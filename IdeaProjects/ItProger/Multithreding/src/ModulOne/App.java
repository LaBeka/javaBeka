package ModulOne;

public class App {

    private int count = 0;// potoki ne synchronized

    public synchronized void increment() {
        count++;
    }

    /*public void main(String[] args) {
        doSomething(); // call the method it should be: public STATIC void doSomething() {
    }*/

    public static void main(String[] args) {
        App app = new App();
        app.doSomething(); // it works with (WITHOUT STATIC) public void doSomething() {
    }

    public void doSomething() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++){
                    increment();
                }
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
                System.out.println("The result : " + count);
    }
}
