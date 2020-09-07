package ModulOne;

/*public class Process extends Thread{

    public void run() {
        while (true){
            System.out.println("Hello");// this method will run infinitivly
        }
    }*/

public class Process extends Thread{

    private volatile boolean isRun = true; /*переменной с ключевым словом
    volatile означает, что значение этой переменной может изменяться другими
     потоками. ... В целях повышения производительности спецификация языка
      Java допускает сохранение в JRE
    локальной копии переменной для каждого потока, который на нее
    ссылается.*/

    public void run() {
        while (/*true */isRun){// we changed true to isRun to call the method "exit"
            System.out.println("Hello");

            try {
                Thread.sleep(2000);/* each 200 millisec will appera "Hello */
            } catch (InterruptedException e) {// if catch the error
                e.printStackTrace();// write a message
            }
        }
    }

    public void exit() {
        isRun = false;

    }
}
