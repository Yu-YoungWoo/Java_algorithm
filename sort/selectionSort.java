package com.example.algorithm.sort;

import java.util.Arrays;

// 시간 복잡도는 O(n2)
public class selectionSort {
    public static void main(String[] args) {
        int[] a = {3, 31, 48, 73, 8, 11, 20, 29, 65, 15};

        for(int i = 0; i < a.length - 1; i++) {
            int minIndex = i;

            for(int j = i + 1; j < a.length; j++) {
                if(a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            swap(a, minIndex, i);
        }

        System.out.println(Arrays.toString(a));
    }

    public static void swap(int[] a, int x, int y) {
       int temp = a[x];
       a[x] = a[y];
       a[y] = temp;
    }
}
