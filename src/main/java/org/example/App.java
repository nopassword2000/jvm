package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        System.out.println( "Hello World!" );
        Thread thread = new Thread(new Runnable() {
            public void run() {
                int i=0;
                while (true) {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("i=" + i++);
                }

            }
        });
        thread.start();
        Thread.currentThread().join();
    }
}
