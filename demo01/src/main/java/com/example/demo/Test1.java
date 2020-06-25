package com.example.demo;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //square(5);
        System.out.println("二进制里面包含的数字是："+jinxhi(9));
    }
    static void square(int x){
        for(int i=1;i<=x;i++){
            //前边空格
            for(int j=1;j<=x-i;j++){
                System.out.print(" ");
            }
            //中间数字
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }

            //中间后数字
            for(int m=i-1;m>0;m--){
                System.out.print(m);
            }
            //后边一个空格
            for(int y=1;y<=x-i;y++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static int jinxhi(int num){
        int a =0;//定义一个int变量接受
        int b =0;//统计循环的次数
        int c =0;//c为最后的二进制
        int int1 = 0;//计数求余为1的
        while(num!=0) {
            a = num%2;
            num = num/2;
            if(a==1){
                int1++;
            }
            b++;
            for(int i=0; i<b; i++) {
                a=a*10;
            }
            c+=a;
        }
        System.out.println(c);
        return int1;
    }
    //修改内容
}
