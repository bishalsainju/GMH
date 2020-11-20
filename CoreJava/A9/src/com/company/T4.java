package com.company;

public class T4 extends Thread {
    public T4(String name) {
        super(name);
    }
    public void run() {
        try {
            Thread.sleep(10000);
            for (int i=1; i <=10; i++){
                System.out.println(Thread.currentThread().getName() + ": 4 * " + i + " = " + 4*i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
