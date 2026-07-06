package org.example;

public class AddTwoNumberThree {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int a = 10 ;
        int b = 35;
          calc.add(a,b);
    }
    static class Calculator {
        int res;

        void add(int x, int y) {
            res = x + y;
            System.out.println("Total Sum:" + res);
        }
    }

}
