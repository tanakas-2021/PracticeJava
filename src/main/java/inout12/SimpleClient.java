package inout12;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class SimpleClient {
    public static void main(String[] args) throws IOException {
        //serverとやりとりを行うSocketオブジェクトを作成
        var soc = new Socket("localhost", 1600);
        //OutputStreamは10章で説明しているStreamとは別
        OutputStream output = soc.getOutputStream();
        output.write(234);
        output.close();
        soc.close();
    }
}
