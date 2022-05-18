/*угадывание числа*/
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Загадайте целое число от 1 до 2 147 483 647 :");
        Scanner in = new Scanner(System.in);
        int a=0;
        int b=2147483647;
        int m;
        for (int i=0; i<32; i++){
            m = (a+b)/2;
            System.out.println("Что Вы можете сказать о числе "+ m + "?");
            System.out.println("0-оно равно \n1-больше \n2-меньше");
            int answ = in.nextInt();
            if (answ == 0){
                System.out.print(m + " это твоё число");
                break;
            }
            if (answ==1){
                a=m;
            }
            if (answ==2){
                b=m;
            }
        }

    }
}
