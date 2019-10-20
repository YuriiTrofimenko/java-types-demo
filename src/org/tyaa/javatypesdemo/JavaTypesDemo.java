/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.javatypesdemo;

import java.util.Scanner;

/**
 *
 * @author yurii
 */
public class JavaTypesDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // int x = 10;
        // String s = "Hello Java!";
        
        /* byte b1 = 127;
        b1 = -128;
        // b1 = 128;
        // b1 = -129;
        
        short sh = 129;
        int i1 = 129000;
        long l1 = 1000000000000000000L;
        
        float f1 = 10.12f;
        double d2 = 32432524.454356557657d;
        
        boolean boo1 = true;
        boo1 = false;
        
        char ch1 = 'A';
        // sout + Tab
        // System.out.println(ch1);
        
        for (int i = 0; i < 26; i++) {
            // System.out.println(ch1++);
            // System.out.println(++ch1);
        }
        
        // final char ch2 = 'B';*/
        
        /* int y = 0;
        y = y + 1;
        y += 1;
        y++; */
        
        // double result = 11 / 2;
        // double result = (double)11 / (double)2;
        // double result = 11.0 / 2.0;
        // double result = 11d / 2d;
        // System.out.println(result);
        
        // System.out.println(2 * 2 == 4 ? "Yes" : "No");
        // int x = 1;
        /*switch(x){
            case 0: {
                System.out.println("0");
                break;
            }
            case 1: {
                System.out.println("1");
                // break;
            }
            case 2: {
                System.out.println("2");
                break;
            }
            // case 3 -> System.out.println("3");
            default: {
                System.out.println("Unknown value!");
            }
        }*/
        
        // Since Java 12
        /*switch(x){
            case 0 -> System.out.println("0");
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 3 -> System.out.println("3");
            default ->  System.out.println("Unknown value!");
        }*/
        
        /* int i = 0;
        final int costraint = 10;
        PARENT:while(i < costraint){
            System.out.println("Parent Loop #" + i);
            i++;
            int j = 0;
            while(j < costraint){
                System.out.println("Child Loop #" + j);
                j++;
                if(i == 2 && j == 2){
                    break PARENT;
                }
            }
        } */
        
        /* switch(number10){
            case 0: System.out.println("Voron"); break;
            case 1: System.out.println("Vorona"); break;
            case 2: System.out.println("Voroni"); break;
            case 3: System.out.println("Voroni"); break;
            case 4: System.out.println("Voroni"); break;
            case 5: System.out.println("Voron"); break;
            case 6: System.out.println("Voron"); break;
            case 7: System.out.println("Voron"); break;
            case 8: System.out.println("Voron"); break;
            case 9: System.out.println("Voron");
        } */
        /* switch(number10){
            
            case 1: System.out.println("Vorona"); break;
            case 2:
            case 3:
            case 4: System.out.println("Voroni"); break;
            case 0: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: System.out.println("Voron");
        } */
        System.out.println("Input an integer number from 0 to infinity:");
        
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int number10 = number % 10;
        int number100 = number % 100;
        
        if (number100 >= 11 && number100 <= 14) {
            System.out.println("Voron");
        } else {
            switch(number10){

                case 1: System.out.println("Vorona"); break;
                case 2:
                case 3:
                case 4: System.out.println("Voroni"); break;
                case 0: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 9: System.out.println("Voron");
            }
        }
        
        //TODO:
        //1. добавить два цикла:
        //родительский снова и снова предлагает ввести число,
        //дочерний - после каждого вывода слова в консоль
        //спрашивает "Продолжить? (д/н)",
        //и делает это до тех пор, пока пользователь не введет д или н,
        //иначе спрашивает снова
        //2. разбить решение на две части:
        //первая решает задачу,
        //вторая - осуществляет диалог с пользователем в консоли
    }
    
}
