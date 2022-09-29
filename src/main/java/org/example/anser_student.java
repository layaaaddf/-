package org.example;

import com.sun.deploy.util.StringUtils;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class anser_student {
    public static void main(String[]args) {
        String a, b, c = "";
        int True = 0;
        int False = 0;
        int sum = 1;
        int i=0;
        String ture_nums="";
        String fasle_nums="";
    try {
        FileReader fl1=new FileReader("学生答案.txt");
        FileReader fl2=new FileReader("正确答案.txt");
        BufferedReader buf1=new BufferedReader(fl1);
        BufferedReader buf2=new BufferedReader(fl2);
        PrintStream pr=new PrintStream(new FileOutputStream("分数成绩.txt"));
        System.setOut(pr);
        while((a=buf1.readLine())!=null)
        {if(a.equals(b=buf2.readLine()))
        {c="答案正确";
        True++;
        if(c=="答案正确") {
            ture_nums =ture_nums+Integer.toString(i+1)+"," ;
            i++;
        }
        }
            else {c="答案错误";
            False++;
            if(c=="答案错误") {
                fasle_nums = fasle_nums+Integer.toString(i+1)+",";
                i++;
            }
        }

        }
        System.out.println("Correct:"+True+"道题"+"("+ture_nums+")");
        System.out.println("Wrong:"+False+"道题"+"("+fasle_nums+")");
        buf1.close();
        buf2.close();
    }catch (IOException e){
        System.out.println("出错");
    }
    }


}
