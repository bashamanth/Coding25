package org.example.crackingcodinginterview.arraysstrings;

public class RotateMatrix {

// incomplete
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(rotateMatrix(matrix));
    }

    private static boolean rotateMatrix(int[][] matrix) {

        if(matrix.length==0 || matrix.length!=matrix[0].length) return false;

        int n= matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int firstPointer = layer;
            int lastPointer = n-1-layer;

            for (int i = firstPointer; i < lastPointer; i++) {
                int offset = i-firstPointer;

            }


        }
    return  false;
    }
}
