package ie.atu.week5;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

    public static void printArrayList(ArrayList<Integer> arrayList) {
        for(Integer i : arrayList){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(500);
        arrayList.add(600);
        arrayList.add(700);
        arrayList.add(800);
        arrayList.add(900);
        arrayList.add(1000);

        printArrayList(arrayList);
    }
}
