package com.test;

import java.util.Scanner;
    public class SumOfEven{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int[] numbers = new int[6];

            System.out.println("hii");
            System.out.println("enter any six numbers :");

            for(int i=0 ; i<numbers.length;i++){
                System.out.println("number is"+ (i+1));
                numbers[i] = sc.nextInt();

            }
            int sum =0 ;
            for(int number:numbers){
                if(number%2 == 0){
                    sum += number;
                }
            }

            System.out.println("sum of even numbers :"+ sum);

            sc.close();




    }

        }
