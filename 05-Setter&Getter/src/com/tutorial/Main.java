package com.tutorial;

class user {
    private String username;
    private String password;

    //membuat konstruktor
    user(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //method getter
    public String getUsername(){
        return this.username;

    }

    public String getPassword(){
        return this.password;
    }

    //method setter
    public void setPassword(String password){
        this.password = password;
    }
}

public class Main {
    public static void main(String[] args) {
        //instansiasi objek
        user person_1= new user("Yunda", "123456789");

        //panggil method getter
        System.out.println(person_1.getUsername());
        System.out.println(person_1.getPassword());

        person_1.setPassword("0987654321");
        System.out.println("new password:" +person_1.getPassword());

    }


    
}
