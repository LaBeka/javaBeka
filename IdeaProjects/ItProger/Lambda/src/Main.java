public class Main {

    public static void main(String[] args) {
        /*Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };

        Runnable run1 = () -> System.out.println("hello");*/

        IMath imath = new IMath() {
            @Override
            public double summ(double a, double b) {
                return a * b;
            }
        };

        System.out.println(imath.summ(5,7));

        IMath imath2 = (y, x) -> y + x;
        System.out.println(imath2.summ(6,7));
    }
}
