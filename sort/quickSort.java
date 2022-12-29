package com.example.algorithm.sort;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] a = {31, 8, 48, 73, 11, 3, 20, 29, 65, 15};

        quickSort(a, 0, a.length - 1);

        System.out.println(Arrays.toString(a));
    }


    public static void quickSort(int[] a, int p, int r) {

        if(p < r) {
            int q = partition(a, p, r);
            quickSort(a, p, q - 1); // 피벗을 제외한 왼쪽 정렬
            quickSort(a, q + 1, r); // 피벗을 제외한 오른쪽 정렬
        }
    }

    public static int partition(int[] a, int p, int r) {
        int x = a[r];
        int i = p - 1;

        for(int j = p; j < r; j++) {
            if(a[j] <= x) {
                ++i;
                int temp = a[i];

                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i + 1];
        a[i + 1] = a[r];
        a[r] = temp;

        return i + 1;
    }

}

