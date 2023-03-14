package com.driver;

public class Main {

    public static void main(String[] args){
        Product p1=new Product();
        System.out.println(p1.product(5,6));
        System.out.println(p1.product(5,6,7));
        System.out.println(p1.product(5.1,6));
    }

    public static class Product{
        public int product(int a,int b){
            return a*b;
        }
        public int product(int a,int b,int c){
            return a*b*c;
        }
        public static double product(double a,double b){
            return a*b;
        }
    }

}