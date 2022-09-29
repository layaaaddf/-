package org.example;

public class operation {
    //将分子与分母拆分到字符数组里
    public static int[] split(String a){
        String []b=a.split("/");
        int []c=new int[2];
        c[0]=Integer.parseInt(b[0]);
        c[1]=Integer.parseInt(b[1]);
        return c;
    }
    //找公因数化简假分数
    public static  int gongyinzi(int a,int b){
        while(b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
    //乘法
public static String mul(String a,String b){
        String t="";
        int[]c=operation.split(a);
        int[]d=operation.split(b);
        int e=c[0]*d[0];
        int f=c[1]*d[1];
        int g=operation.gongyinzi(e,f);
        t=e/g+"/"+f/g;
        return t;
    }
    //除法
    public static  String div(String a,String b)
    {String t="";
        int[]c=operation.split(a);
        int[]d=operation.split(b);
        int e=c[0]*d[1];
        int f=c[1]*d[0];
        int g=operation.gongyinzi(e,f);
        t=e/g+"/"+f/g;
        return t;
    }
    //加减法
    public static String add_sub(String a,String b,String yunsuanfu)
    {
        String t="";
        int[]c=operation.split(a);
        int[]d=operation.split(b);
        int g=c[1]*d[1]/operation.gongyinzi(c[1],d[1]);
        int e=g/c[1]*c[0];
        int f=g/d[1]*d[0];
        if(yunsuanfu.equals("+"))
        {int h=e+f;
        t=h+"/"+g;}
        else
        {int h=e-f;
        t=h+"/"+g;}
        return t;
    }
    //算术表达式最后运算
public static String last(String[]a) {
    for (int i = 1; i < a.length; i = i + 2) {
        int n = 1;
        while (a[i-n].equals("")) {
            n++;
        }
        if (a[i].equals("×")) {
            a[i - n] = operation.mul(a[i - n], a[i + 1]);
            a[i] = "";
            a[i + 1] = "";
        } else if (a[i].equals("÷")) {
            a[i - n] = operation.div(a[i - n], a[i + 1]);
            a[i] = "";
            a[i + 1] = "";
        }
    }
    for (int i = 1; i < a.length; i = i + 2) {
        int n = 1;
        while (a[i - n].equals("")) {
            n++;
        }
        if (a[i].equals("+")) {
            a[i - n] = operation.add_sub(a[i - n], a[i + 1], "+");
            a[i] = "";
            a[i + 1] = "";
        } else if (a[i].equals("-")) {
            a[i - n] = operation.add_sub(a[i - n], a[i + 1], "-");
            a[i] = "";
            a[i] = "";

        }
    }
    return a[0];
}
}
