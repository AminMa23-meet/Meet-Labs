package com.example.myapplication;
class User{
    private String Name;
    private String Email;
    private String Password;

    public User(String Name, String Email, String Password){
        this.Name = Name;
        this.Email = Email;
        this.Password = Password;
    }
    public void setName (String Name) {
        this.Name = Name;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }
    public void setPassword(String Password) {
        this.Password = Password;
    }
    public String getName(){ return this.Name;}
    public String getEmail(){ return this.Email;}
    public String getPassword(String Password){ return this.Password;}

    @Override
    public String toString() {
        return "User:" +
                "Name='" + this.Name + '\'' +
                ", Email='" + this.Email + '\'' +
                ", Password='" + this.Password;
    }

}
