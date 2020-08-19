package geekbrain;

import java.util.Scanner;

public class homework01_04 {
    public static void main(String[] args) {
        check(5, 7);
    }

    private static void check(int a, int b) {

        int c = a + b;
        if (c >= 10 && c <= 20)
        {
            System.out.println("True");
        }

        else System.out.println("False");
        }

    }