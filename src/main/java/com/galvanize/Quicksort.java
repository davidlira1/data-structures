package com.galvanize;

import java.util.Arrays;

public class Quicksort {

    public static void solve(int[] array) {
        if(array.length == 0 || array.length == 1) {
            return;
        }

        solve(array, 0, array.length - 1);
    }

    public static void solve(int[] array, int left, int right) {
        if(left >= right) {
            return;
        }
        int pivot = array[(left + right) / 2];
        int index = partition(array, left, right, pivot);
        solve(array, left, index - 1);
        solve(array, index,right);
    }

    public static int partition(int[] array, int left, int right, int pivot) {
        while(left <= right) {
            while(array[left] < pivot) {
                left++;
            }
            while(array[right] > pivot) {
                right--;
            }
            if(left <= right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
        return left;
    }
}
