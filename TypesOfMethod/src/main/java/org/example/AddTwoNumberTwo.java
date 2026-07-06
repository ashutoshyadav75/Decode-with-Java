package org.example;

public class AddTwoNumberTwo {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
          int sum = cal.add();
        System.out.println("Sum:" + sum);
    }
     static class Calculator{
        int a ;
        int b ;
         int res;
         int add(){
             a = 23;
             b = 54;
             res = a + b;
             return res;
         }
    }
}
