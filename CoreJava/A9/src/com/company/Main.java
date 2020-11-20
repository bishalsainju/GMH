package com.company;

public class Main {

    public static void main(String[] args) {
        Thread t4 = new T4("T4");
        t4.start();

        Runnable r5 = new T5();
        Thread t5 = new Thread(r5, "T5");
        t5.start();

        Thread t6 = new Thread() {
            public void run () {
                setName("T6");

                try {
                    sleep(10000);
                    for (int i=1; i <=10; i++){
                        System.out.println(getName() + ": 6 * " + i + " = " + 6*i);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t6.start();

        Runnable r7 = new Runnable() {
            @Override
            public void run() {
                Thread t = new Thread();
                t.setName("T7");
                try {
                    t.sleep(10000);
                    for (int i=1; i <=10; i++){
                        System.out.println(t.getName() + ": 7 * " + i + " = " + 7*i);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t7 = new Thread(r7);
        t7.start();

    }
}
