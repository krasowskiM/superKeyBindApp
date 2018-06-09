package main;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    private static final String ID = "superID";
    private static final String SUPER_FIELD = "superValue";
    private BufferedInputStream inputStream;

    public Main() {
    }



    public static void main(String[] args) {
        System.out.println();
        Main main = new Main();
        //ctrl+p
        try {
            main.setInputStream(new BufferedInputStream(new FileInputStream("cos.xml")));
        } catch (FileNotFoundException e) {
            System.out.println("zdarzył sie wyjatek");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public BufferedInputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(BufferedInputStream inputStream) {
        this.inputStream = inputStream;
    }
}
