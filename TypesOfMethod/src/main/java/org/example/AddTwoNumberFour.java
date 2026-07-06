package org.example;

public class AddTwoNumberFour {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
         int a ;
         int b ;
       int sum =  calc.add(34,67);
        System.out.println("Total Sum:" + sum);
    }
    static class  Calculator{
        int res;
        int add(int x , int y){
            res = x + y;
            return  res;
        }
    }
}
