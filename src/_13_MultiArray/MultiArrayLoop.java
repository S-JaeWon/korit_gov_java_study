package _13_MultiArray;

import java.util.Arrays;

public class MultiArrayLoop {
    public static void main(String[] args) {
        // 다차원 배열 순회
        String [][] seats = new String[][]
                {
                        {"A1", "A2", "A3", "A4", "A5"},
                        {"B1", "B2", "B3", "B4", "B5"},
                        {"C1", "C2", "C3", "C4", "C5"}
                };

        // 2차원 배열이므로 for문 중첩
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < seats2.length; i++) {
            for (int j = 0; j < seats2[i].length; j++) {
                System.out.print(seats2[i][j] + " ");
            }
            System.out.println();
        }

        // 10 * 15
        String[][] arr = new String[10][15];
//        String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            String eng = String.valueOf((char)('A' + i));
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = eng + (j + 1);
            }
        }
        arr[3][7] = "__";
        arr[5][3] = "__";
        arr[7][5] = "__";
        arr[7][6] = "__";

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // 다차원 배열 합 구하기
        // 3 * 3, 1부터 홀추로 차례대로 대입, 이후 총합 구하기



        int[][] odd = new int[3][3];
        int numb = 1;
        for (int i = 0; i < odd.length; i++) {
            for (int j = 0; j < odd[i].length; j++) {
                odd[i][j] = numb;
                numb += 2;
            }
        }

//        for (int i = 0; i < odd.length; i++) {
//            for (int j = 0; j < odd[i].length; j++) {
//                System.out.print(odd[i][j] + " ");
//            }
//            System.out.println();
//        }

        // 다차원 배열 출력
        System.out.println(Arrays.deepToString(odd));

        int sum = 0;
        for (int i = 0; i < odd.length; i++) {
            for (int j = 0; j < odd[i].length; j++) {
                sum += odd[i][j];
            }
        }
        System.out.println(sum);

        // 각 행, 열의 합, 전체의 합
        int[][] a = { // [2][3]
                {1, 2, 3},
                {4, 5, 6}
        };

        int n = a.length;
        int m = a[0].length;
        int [] sumRow = new int[n];
        int [] sumCol = new int[m];
        int sumAll = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sumRow[i] += a[i][j]; // {6, 15}
                sumCol[j] += a[i][j]; // {5, 7, 9}
                sumAll += a[i][j];
            }
        }
        System.out.println(Arrays.toString(sumRow));
        System.out.println(Arrays.toString(sumCol));
        System.out.println(sumAll);

        // A + B, B - A
        int[][] A = {
                {1, 2},
                {3, 4}
        };

        int[][] B = {
                {5, 6},
                {7, 8}
        };

        int n1 = A.length;
        int m1 = B.length;

        int[][] add = new int[n1][m1];
        int[][] sub = new int[n1][m1];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                add[i][j] = A[i][j] + B[i][j];
                sub[i][j] = B[i][j] - A[i][j];
            }
        }
        System.out.println(Arrays.deepToString(add));
        System.out.println(Arrays.deepToString(sub));
    }
}
