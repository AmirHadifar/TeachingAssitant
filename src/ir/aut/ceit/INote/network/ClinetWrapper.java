package ceit.aut.ac.ir.network;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClinetWrapper {

    public static class Handler implements Runnable {

        Socket s;

        public Handler(Socket socket) {
            s = socket;
        }

        @Override
        public void run() {

        }
    }

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1", 5000);
        Thread t = new Thread(new Handler(socket));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for Server");
        int num = scanner.nextInt();

        PrintStream printStream = new PrintStream(socket.getOutputStream());
        printStream.println(num);

        Scanner scanner1 = new Scanner(socket.getInputStream());
        System.out.println(scanner1.nextInt());

    }
}
