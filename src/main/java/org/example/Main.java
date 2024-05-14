package org.example;

// n=2-9 olmak üzere klavyeden n tabanında girilen sayının 10 tabanındaki karşılığını hesaplayan program

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i;
        int ns;
        int n;
        String s;
        double t=0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n    Sayı : ");
        s = scanner.nextLine();
        System.out.print("\n    Taban : ");
        n = scanner.nextInt();

        for (i=s.length()-1;i>=0; i--){
            ns = (int) s.charAt(i)-48; t=t+ns*(Math.pow(n,s.length()-1-i));
        }
        System.out.print("\n10 Tabanındaki Değeri : "+(int)t);
    }
}