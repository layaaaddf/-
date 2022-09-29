package org.example;

import java.util.Random;

public class Number {
    //
    public String ramdom(int num){
        Random a=new Random();
        int b=a.nextInt(num);
        String c=Integer.toString(b);
        return c;
    }
    //产生随机的运算符
    public String ramdom_yunsuanfu(){
        Random r1=new Random();
        int b= r1.nextInt(4);
        String string="q";
        if(b>=0&&b<1)
            string="×";
        else if (b>=1&&b<2)
            string="÷";
        else if (b>=2&&b<3)
            string="+";
        else string="−";
        return string;
    }
    //产生题目中运算数字的量（2或3）
    public int beiyunsuan_number(){
        Random a = new Random();
        int b= a.nextInt(2);
        return b+2;
    }
    //分数
    public  String fraction(String b){
    Random a=new Random();
    int c=a.nextInt(4);
    int d=c+a.nextInt(6);
    String e=b;
    if(c>=3){
        if(b.equals("0"))
            e=c+"/"+d;
        else e=b+"'"+c+"/"+d;
    }
    return e;
    }
    public String false_fraction(String b)
    {String a[]=b.split("'");
    String c[]=a[1].split("/");
    int d=Integer.parseInt(a[0]);
    int e= Integer.parseInt(c[0]);
    int f=Integer.parseInt(c[1]);
    int g=d*f+e;
    String h=g+"/"+f;
    return  h;}
    //假分数转换为真分数
    public static String ture_fraction(String b){
        String[]a=b.split("/");
        //分割字符串为字符数组
        String c="";
        int d=Integer.parseInt(a[0]);
        int e=Integer.parseInt(a[1]);
        int f,g,h=0;
        if(a[0].equals("0"))
            c="0";
        else if (a[1].equals("1"))
            c=a[0];
            else if (d>=e){
                f=d/e;
                g=d%e;
                if (g==0)
                    c=f+"";
                else {
                    h=operation.gongyinzi(g,e);
                    c=f+"'"+g/h+"/"+e/h;
                }
        }
        else
        {c=b;}
         return c;

    }
    }

