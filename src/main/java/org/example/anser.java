package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class anser {
    public static void main(String[] args) {
        String a, b, f = "";
        try {
            FileReader in = new FileReader("题目.txt");
            BufferedReader buf1 = new BufferedReader(in);
            System.setOut(new PrintStream("正确答案.txt"));
            while ((a = buf1.readLine()) != null) {
                String[] c = new String[a.split(" ").length];
                String[] d = new String[a.split(" ").length - 2];
                c = a.split(" ");
                c = number_string.zeng_fen_change(c);
                for (int i = 0; i < d.length; i++)
                    d[i] = c[i + 1];
                b = operation.last(d);
                f =Number.ture_fraction(b);
                System.out.println(f);
            }
            buf1.close();
        }catch (IOException e){
            System.out.println("文件出错");
            System.exit(-1);
        }
    }
}