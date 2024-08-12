package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 3, 7, 9, 10,12};
        int[] arr2 = invertirArray(arr);

    }
public static int [] invertirArray (int [] arr){
        int []arr2 = new int[arr.length];
        for(int i=arr.length-1, j=0; i>=0; i--,j++){
        arr2[j]=arr[i];

        }
        return arr2;
    }
}