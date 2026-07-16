package org.example;
   class  Papa{
              int i ;
              public void add(int k , int j){
                  i =  k + j ;
                  System.out.println(i);
      }
        }
public class P1 {
    public static void main(String[] args) {
        System.out.println("Ashutosh Yadav");
        Papa papa = new Papa();
          papa.add(5 , 6);
    }
}
