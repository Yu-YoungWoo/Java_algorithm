package com.example.algorithm.sort;

import java.util.Arrays;

// 시간 복잡도는 O(n2)
public class insertionSort {
    public static void main(String[] args) {
        int[] a = {3, 31, 48, 73, 8, 11, 20, 29, 65, 15};

        for(int i = 1; i <= a.length - 1; i++) {
            // key와 비교할 뒤 인덱스
            int loc = i - 1;
            // key
            int newItem = a[i];

            //
            while(loc >= 0 && newItem < a[loc]) {
                a[loc + 1] = a[loc];
                loc--;
            }
            a[loc + 1] = newItem;
        }

        System.out.println(Arrays.toString(a));
    }
}
