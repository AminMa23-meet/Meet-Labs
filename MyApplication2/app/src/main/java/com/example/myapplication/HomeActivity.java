package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;


public class HomeActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<User> user;
    private ArrayAdapter<User> arrayAdapter;
    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mAuth=FirebaseAuth.getInstance();
        listView.findViewById(R.id.my_list_view);
        user= new ArrayList<>();
        user.add( new User("Amin", "aimnjsahd@gmail.com", "sd"));
        user.add(new User("asdpfjkp", "PAOSFdpoam@gmail.com", "54sdsd321"));
        arrayAdapter=new UserArrayAdapter(this, R.layout.list_view, user);
        listView.setAdapter(arrayAdapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.signout) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        return true;


    }

}