package inout12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class WebClient {
    public static void main(String[] args) throws IOException {
        var domain = "example.com";
        // domain 80portとやりとりをするSocketオブジェクトを作成
        try ( var soc = new Socket(domain,80);
              //出力用にPrintWriterオブジェクトを作成
              var pw = new PrintWriter(soc.getOutputStream());
              //入力用にはBufferReaderオブジェクトを生成
              var isr = new InputStreamReader(soc.getInputStream());
              var bur = new BufferedReader(isr))
        {
            pw.println("GET /index.html HTTP/1.1");
            pw.println("Host: " + domain);
            pw.println();
            pw.flush();
            bur.lines().limit(18).forEach(System.out::println);
        }
    }
}
