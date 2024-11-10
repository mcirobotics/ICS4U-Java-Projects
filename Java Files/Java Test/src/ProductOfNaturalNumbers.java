/*
 * Jonathan Graydon
 * Product of Natural Numbers
 * This program will accept a positive integer 'n' and output the product of all natural numbers from 1 to n
 */

import java.util.Scanner;

public class ProductOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test1 = 5;
        int test2 = 8;
        int test3 = 16;
        System.out.println(print_1_to_N_product(test1));
        System.out.println(print_1_to_N_product(test2));
        System.out.println(print_1_to_N_product(test3));
    }
    public static int print_1_to_N_product(int n){
        int product = 1;
        for(int i = 1; i <= n; i++){
            product = product * i;
        }
        return product;
    }
}