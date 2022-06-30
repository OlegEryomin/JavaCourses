package com.geekbrains.courses.work14;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
    public static void main(String[] args) {
        new EchoServer().start();
    }

    private void start() {
        try (ServerSocket serverSocket = new ServerSocket(8189)) {
            System.out.println("Ожидание подключения клиента...");
            final Socket socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            final DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            new Thread(() -> {

                readMessage(in, out);

            }).start();

            new Thread(() -> {
                sendMessage(out);
            }).start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readMessage(DataInputStream in, DataOutputStream out) {
        while (true) {
            try {
                final String message = in.readUTF();
                if ("/end".equalsIgnoreCase(message)) {
                    out.writeUTF("/end");
                    break;
                }
                System.out.println("Сообщение от клиента: " + message);
               // out.writeUTF(message);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void sendMessage(DataOutputStream out) {
        try {
            while (true) {
                Scanner scanner = new Scanner(System.in);
                out.writeUTF(scanner.nextLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
