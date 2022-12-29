package com.example.algorithm.sort;

import java.util.Arrays;

// 시간 복잡도는 O(n2)
public class bubbleSort {
    public static void main(String[] args) {
        int[] a = {8, 31, 48, 73, 3, 65, 20, 29, 11, 15};

        for(int i = 0; i < a.length; i++) {
            for(int j = 1;  j < a.length - i; j++) {
                if(a[j - 1] > a[j]) {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
