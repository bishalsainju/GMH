package com.company;

public class T5 implements Runnable {
    public void run() {

        try {
            Thread.sleep(10000);
            for (int i=1; i <=10; i++){
                System.out.println(Thread.currentThread().getName() + ": 5 * " + i + " = " + 5*i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
