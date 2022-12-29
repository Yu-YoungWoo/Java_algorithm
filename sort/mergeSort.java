package com.example.algorithm.sort;

import java.util.Arrays;


// 시간복잡도는 O(N logN)
// 최악 최선 모두 -> N logN
// 병합하는 시간 -> logN
// 병합 과정에서 정렬되는 시간 -> N
public class mergeSort {
    public static void main(String[] args) {
        int[] a = {3, 31, 48, 73, 8, 11, 20, 29, 65, 15};

        mergeSort(a, 0, a.length - 1);

        System.out.println(Arrays.toString(a));
    }

    // p = 시작 인덱스
    // r = 끝 인덱스
    public static void mergeSort(int[] a, int p, int r) {

        if(p < r) {
            int q = (p + r) / 2;
            /*
                재귀를 통해 a 배열이 2개만 비교할때까지 반복적으로 루프를 탐
            */
            mergeSort(a, p, q);  // 전반부 정렬
            mergeSort(a, q + 1, r); // 후반부 정렬
            merge(a, p, q, r); // 병합
        }
    }

    public static void merge(int[] a, int p, int q, int r) {
        /*
            a[p...q]와 a[q+1...r]을 병합하여 a[p...r]을 정렬된 상태로 만든다.
            마지막 단계까지 오면 a[p...q]와 a[q+1...r]은 이미 정렬되어 있는 상태
         */
        int i = p;
        int j = q + 1;  // 중간부터 시작

        int[] tmp = new int[a.length]; // 병합할 새로운 배열
        int t = 0; // 새로운 배열의 인덱스

        // p 부터 q 까지 또는 q + 1 부터 r까지
        while(i <= q && j <= r) {

            if(a[i] <= a[j]) {
                tmp[t++] = a[i++];
            } else {
                tmp[t++] = a[j++];
            }
        }

        // 전반부 배열에 남아있는 값 삽입
        while(i <= q) {
            tmp[t++] = a[i++];
        }

        // 후반부 배열에 남아있는 값 삽입
        while(j <= r) {
            tmp[t++] = a[j++];
        }
        i = p;
        t = 0;

        // 처음부터 끝까지
        while(i <= r) {
            // 정렬되어 있는 tmp 배열 값을 a 배열에 저장
            a[i++] = tmp[t++];
        }
    }
}
