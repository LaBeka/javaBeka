package ModulOne;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        /*Process obj = new Process();
        obj.start();// to pull out System.out.println("Hello"); from "class Process"
        System.out.println("Enter any keyboard");
        Scanner in = new Scanner(System.in);

        in.nextLine(); // as soon as we enter any keyboard in console
        obj.exit();// it exits from loop*/

        final Car bmw = new Car();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                //for (int i = 0; i < 1000; i++) {
                    try {
                        bmw.moveCar();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                //}
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                //for (int i = 0; i < 1000; i++) {
                    try {
                        bmw.stopCar();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                //}
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();//are joined to the main thread

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
