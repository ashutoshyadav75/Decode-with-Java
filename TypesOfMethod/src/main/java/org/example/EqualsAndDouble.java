package org.example;

public class EqualsAndDouble {
    public static void main(String[] args) {
        String s = "abcdxyz";
        String t = "abcxyz";
        System.out.println(s==t);
        String t = "abc";
        t = t + "xyz";
        System.out.println(s==t);
        String b = new String(s);
        System.out.println(s==t);
        String s = "abcdxyz";
        String t = "abcxyz";
        System.out.println(s==t);
        String t = "abc";
        t = t + "xyz";
        System.out.println(s==t);
        String b = new String(s);
        System.out.println(s==t);

    }
}
