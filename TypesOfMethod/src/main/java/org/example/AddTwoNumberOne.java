package org.example;

public class AddTwoNumberOne {
    public static void main(String[] args) {
        Add add = new Add();
          add.add();
    }

         static class Add{
          int a = 10;
          int b = 23;
          int result;
          void add(){
              result = a + b;
              System.out.println("Total sum:" + result);
          }

              }
}
