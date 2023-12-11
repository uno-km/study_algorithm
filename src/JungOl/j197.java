package JungOl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//import java.util.Arrays;
//import java.util.Scanner;

public class j197 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        final int NUM = 4;
        int[] arr1 = new int[NUM];
        int[] arr2 = new int[NUM];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        Rectangle rc = new Rectangle(arr1, arr2);
        rc.compare();

        for (int i = 0; i < NUM; i++) {
            System.out.print(rc.getRes()[i] + " ");
        }
    }
}

class Rectangle {
    private int[] arr1;
    private int[] arr2;
    private int[] res = new int[4];

    Rectangle(int[] arr1, int[] arr2) {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    public void compare() {
        for (int i = 0; i < res.length; i++) {
            if (i < arr1.length / 2 && arr1[i] > arr2[i]) {
                res[i] = arr2[i];
            } else if (i < arr1.length / 2 && arr1[i] < arr2[i]) {
                res[i] = arr1[i];
            } else if (arr1[i] > arr2[i]) {
                res[i] = arr1[i];
            } else {
                res[i] = arr2[i];
            }
        }
    }

    public int[] getRes() {
        return res;
    }
}