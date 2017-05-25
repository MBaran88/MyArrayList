package com.company;

public class Main {

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        list.add("ala");
        list.add("ma");
        list.add("kota");

        for(int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }
    }
}
