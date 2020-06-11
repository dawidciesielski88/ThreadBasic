package com.dawidciesielski;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello form AnotherThread.");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Another thread woke me up :(");
            return;
        }
        System.out.println("Three seconds have passed I'm awake");
    }
}
