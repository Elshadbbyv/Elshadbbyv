package javaCore.HackerRank.iktlab.again.StringAndMath;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = (int) (Math.random() * 10);
        System.out.println("Let the game begin!");




        while (true){
            int name = sc.nextInt();

            if (a==name){
                System.out.printf("Congratulations, {name}!");
                break;

            }else if(a<name){
                System.out.printf("Your number is too big. Please, try again.");
                continue;

            }else{
                System.out.println("Your number is too small. Please, try again.");
                continue;
            }

        }
        sc.close();


    }
}
