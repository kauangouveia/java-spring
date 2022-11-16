import javax.swing.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        Socket cliente = new Socket("localhost",12345);
    }

}