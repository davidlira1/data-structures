package com.galvanize;

public class BubbleSort {
    public static void solve(int[] array) {
        Boolean sorted = false;
        int lastUnsorted = array.length - 1;

        while(!sorted) {
            sorted = true;

            for(int i = 0; i < lastUnsorted; i++) {
                //SWAP IF CURRENT ELEMENT IS GREATER THAN NEXT ELEMENT
                if(array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
            lastUnsorted--;
        }
    }
}
