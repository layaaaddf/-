package org.example;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {
        System.out.println("请输入生成题目个数和数字的范围（多少以内）");
        System.out.println("以空格分开，按下回车键以确定");
        Scanner sc = new Scanner(System.in);
        try {
            System.setOut(new PrintStream("题目.txt"));
        } catch (FileNotFoundException e1) {
            System.out.println("找不到指定的文件");
            System.exit(-1);
        } catch (IOException e2) {
            System.out.println("发生错误");
            System.exit(-1);
        }
        String first = sc.nextLine();
        String string[] = first.split(" ");
        String string1 = string[1];
        String string0 = string[0];
        int str0 = Integer.parseInt(string0);
        try {
        } catch (NumberFormatException e3) {
            System.out.println("请输入整数");
            System.exit(-1);
        }
        int num = Integer.parseInt(string1);
        try {
            ArrayIndexOutOfBoundsException e2 = new ArrayIndexOutOfBoundsException();
            if (num > 10 || num < 0) {
                throw e2;
            }
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("请输入10以内的整数");
            System.exit(-1);
        }
        //设置题目数量
              String[]str_num=new String[str0];
        for(int k=0;k<str0;k++)
        {Number s1=new Number();
         int t=s1.beiyunsuan_number();
        String[]number=new String[t];
        String[]symbol=new String[t-1];
        String[]sum=new String[4*t-3];
        for(int i=0;i<t;i++)
        {number[i]=s1.fraction(s1.ramdom(num));}
        for(int i=0;i<t-1;i++)
        {symbol[i]=s1.ramdom_yunsuanfu();}
        for(int i=0;i<4*t-3;i++)
        {int c=0;
          //将数加进
            if(i%4==0)
            {c=i-2;//排除0为除数
                if(c>0&&symbol[i/4-1]=="÷"&&number[i/4].equals("0"))
                {number[i/4]="1";}
                sum[i]=number[i/4];
            }
            //将字符加进
            else if (i%4==2) {
                c=(i+2)/4-1;
                sum[i]=symbol[c];}
            else {
                sum[i] = " ";
            }
            }

        number_string s2=new number_string();
        String jieguo=s2.Number_string(sum);
        sum=number_string.zeng_fen_change(sum);
        String jieguo2="";
        jieguo2=operation.last(sum);
        int i=0;
        boolean flag=true;
        //查重
        while(i<str0)
        {if(str_num[i]!=null&&jieguo2!=null&&str_num[i].equals(jieguo2))
        {flag=false;
        break;} i++;
        }
        if(flag==false)
            k--;
        else if (flag==true)
        {String jieguo3=k+1+". "+jieguo+" =";
        System.out.println(jieguo3);
        }
        }
        sc.close();
    }
   }