package com.corenetworks.presentacion;

import com.corenetworks.modelo.User;

public class ProbarUser {
    public static void main(String[] args) {
        User u1 = new User("Pedro", 24);
        System.out.println(u1.toString());
        System.out.println(new User("Pablito", 30).toString());
    }
}
