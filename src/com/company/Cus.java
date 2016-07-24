package com.company;

/**
 * Created by Dudaizhong on 2016/2/22.
 */
public class Cus implements Runnable {

    private Bank b = new Bank();


    @Override
    public void run() {
        for (int x=0;x<3;x++)
        {
            try{
                b.add(100);
            }
            catch(Exception e)
            {

            }
        }
    }
}
