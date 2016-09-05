package com.jny.dev;

/**
 * Created by neo0503 on 2016. 9. 5..
 */
public class BubbleSort {

    public static void bubbleSort(int A[], int n) {
        for(int pass = n -1 ; pass >= 0; pass--){
            for(int i = 0; i < pass -1; i++){
                if(A[i] > A[i+1]){
                    //Swap items
                    int temp = A[i];
                    A[i] = A[i+1];
                    A[i+1] = temp;
                }
            }
        }
    }
}
