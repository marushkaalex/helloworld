package com.epam.am.hw;

public class Runner {
    public static void main(String[] args) {
        Greater greater = new Greater();
        greater.setGreeting("HelloWorld");
        System.out.println(greater.getGreeting());
    }
}
