package org.example;

public class number_string {
    public String Number_string(String[]a){
        String b="";
        for(int i=0;i<a.length;i++)
        {  b=b+a[i];}
        return  b;
    }
    //分数转换为真分数和整数转化为分数
    public static String[] zeng_fen_change(String[]a){
     Number s=new Number();
     for(int i=0;i<a.length;i++)
     {if(a[i].contains("'"))
     {a[i]=s.false_fraction(a[i]);
     }
         if (!a[i].contains("/")&&!a[i].equals("×")&&!a[i].equals("÷")&&!a[i].equals("-")&&!a[i].equals("+")&&!a[i].equals(" "))
         {a[i]=a[i]+"/1";}
     }
     return a;
    }

}
