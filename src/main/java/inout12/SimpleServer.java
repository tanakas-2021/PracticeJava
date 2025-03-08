package inout12;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String[] args) throws IOException {
        //1600portで通信の待受を行うServerSocketオブジェクトを作成
        var server = new ServerSocket(1600);
        System.out.println("waiting...");
        //clientから接続があった場合、そのclientとやりとりを行うのがSocketオブジェクト
        try(Socket soc = server.accept();
            //InputStreamは10章で説明しているStreamとは別
            InputStream input = soc.getInputStream())
        {
            System.out.println("Connect From " + soc.getInetAddress());
            System.out.println(input.read());
        }
    }
}
