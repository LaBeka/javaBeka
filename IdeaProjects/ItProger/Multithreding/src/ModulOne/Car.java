package ModulOne;

import java.util.Scanner;

public class Car {

    public void moveCar() throws InterruptedException {
        /*throws InterruptedException it is a replacement to
        try{
        wait()}
        catch{
        sout(InterruptedException e)
        */
        synchronized (this) { // we sync we the methods in this class
            System.out.println("The car is on");
            wait();
            System.out.println("The car is stopped");
        }
    }

    public void stopCar() throws InterruptedException{

        Scanner in = new Scanner(System.in);
        Thread.sleep(2000);

        synchronized (this){ // because we should sync and this method
            System.out.println("Enter something to stop the function");
            in.nextLine(); // user enters something to stop the code
            notify();// xhtobi zapustit opredelenniy thread
            /* instead of wait() and notify we can put sleep
            * but sleep cannot stop whenever we want*/
        }
    }
}
