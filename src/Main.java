// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


//  1st way by extending thread
    public static class A extends Thread {
    public void run() {
        for (int i = 0; i < 20; i++)
            System.out.println("A");
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
    public static class B implements Runnable{
        @Override
        public void run() {
            System.out.println("B");
        }
      }

    public static void main(String[] args) throws InterruptedException {

//   1st way to declare thread by Thread
    A b=new A();
    b.start();

    B a=new B();
    Thread a1=new Thread(a);
    System.out.println(a1.isAlive());
    a1.start();


//    Thread a=new A();
//    a.start();

    for(int i=0;i<10;i++){
//        Thread.sleep(10);
        System.out.println("C");
        Thread.sleep(1);
        }
      }
   }
