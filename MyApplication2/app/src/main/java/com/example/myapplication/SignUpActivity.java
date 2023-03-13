package com.example.myapplication;



import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView title;
    private EditText name;
    private EditText email;
    private EditText password;
    private Button submit;
    private FireBaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        title = findViewById(R.id.Title);
        email = findViewById(R.id.Email);
        password = findViewById(R.id.Password);
        name = findViewById(R.id.Name);
        submit = findViewById(R.id.Submit);
        submit.setOnClickListener(this);
        mAuth = FirebaseAuth.getInstance();


    }

    @Override
    public void onClick(View view) {
        create_user(email.getText().toString(), password.getText().toString());
    }
};

    public void create_user(String Email, String Password){
            mAuth.createUserWithEmailAndPassword(Email, Password)
            .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
    @Override
    public void onComplete(@NonNull Task<AuthResult> task) {
            if (task.isSuccessful()) {
                // Sign in success, update UI with the signed-in user's information
                Intent i= new Intent(SignUpActivity.this, HomeActivity.class);
                 startActivity(i);

            } else {
            // If sign in fails, display a message to the user.
                    Toast.makeText(SignUpActivity.this, "Authentication failed.",
                    Toast.LENGTH_SHORT).show();
                             }
                         }
                    });
                 }
            }
