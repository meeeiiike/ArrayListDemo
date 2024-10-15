package ie.atu.week5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayListDemo {

    // Prints all elements and shows current index number
    public static void printArrayList(ArrayList<Integer> arrayList) {
        for(Integer i : arrayList){
            System.out.println("Element at index " + arrayList.indexOf(i) + ": " + i);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Create arrayList and assign 10 values
        ArrayList<Integer> arrayList = new ArrayList<>();
        int value = 100;

        // Loop to add 10 values, from 100 incrementing to 1000 instead of manually adding
        for( int i = 0; i < 10; i++ ){
            arrayList.add(value);
            value += 100;
        }
        // Print method
        printArrayList(arrayList);

        // Adding new number to array list
        System.out.println("Please enter a new number");

        // InputMismatch not working, needed import and still showing null as does "Exception"
        try{
            arrayList.add(sc.nextInt());

        }catch(InputMismatchException e){
            System.out.println("Invalid! Error Message: " + e.getMessage());
        }

        // Print method with new value added
        printArrayList(arrayList);
    }
}
