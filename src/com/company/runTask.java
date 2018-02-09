package com.company;

public class runTask implements Runnable {

    public static void runTask(Runnable runnable) {
        runnable.run();
        System.out.println("Zaimplemetuj interfejs Runnable");
    }

    @Override
    public void run() {
        System.out.println("From runTask");
    }


}
