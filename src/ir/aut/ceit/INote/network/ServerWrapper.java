package ceit.aut.ac.ir.network;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerWrapper {

    public static void main(String[] args) {


        try {
            ServerSocket serverSocket = new ServerSocket(5000);

            while (!serverSocket.isClosed()) {
                Socket s = serverSocket.accept();
                Scanner scanner = new Scanner(s.getInputStream());
                int userNum = scanner.nextInt();

                PrintStream printStream = new PrintStream(s.getOutputStream());
                printStream.println(userNum * 2);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
