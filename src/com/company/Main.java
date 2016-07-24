package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cus c =new Cus();

        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);

        t1.start();
        t2.start();

    }
}
