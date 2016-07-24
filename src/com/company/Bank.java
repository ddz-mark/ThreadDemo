package com.company;

/**
 * Created by Dudaizhong on 2016/2/22.
 */
public class Bank {

    private int sum=0;
    //Object obj = new Object();

    public synchronized void add(int n) throws Exception{

      //  synchronized(obj) {

            sum = sum + n;
            Thread.sleep(10);

            System.out.println("sum=" + sum);
      //  }
    }
}
