package com.nest.hotelfantasy;
import java.util.Scanner;
public class HotelMenu {
    static int total=0;
        public static void main(String[] args) {

            int y;

            Scanner s=new Scanner(System.in);
            while (true) {
                System.out.println("enter the choice");
                System.out.println("1.Tea 10$");
                System.out.println("2.coffee 30$");
                System.out.println("3.puffs 15$");
                System.out.println("4.chicken roll 30$");
                System.out.println("5.samosa 15$");
                System.out.println("6.BILL");
                System.out.println("7.exit");
                y=s.nextInt();

                switch (y) {
                    case 1:
                        System.out.println("how many quantity");
                        int m = s.nextInt();
                        total = (10 * m) + total;
                        break;
                    case 2:
                        System.out.println("how many quantity");
                        int n = s.nextInt();
                        total = (30 * n) + total;
                        break;
                    case 3:
                        System.out.println("how many quantity");
                        int o = s.nextInt();
                        total = (15 * o) + total;
                        break;
                    case 4:
                        System.out.println("how many quantity");
                        int x = s.nextInt();
                        total = (30 * x) + total;
                        break;
                    case 5:
                        System.out.println("how many quantity");
                        int z = s.nextInt();
                        total = (15 * z) + total; 
                        break;
                    case 6:System.out.println("total bill="+total);
                        break;
                    case 7:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("invalid input");
                }
            }

        }
    }

