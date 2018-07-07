package ceit.aut.ac.ir.thread;

public class Main {

    static class Runner extends Thread {


        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {


        Runner runner = new Runner();
        runner.start();
        runner.stop();

    }
}
