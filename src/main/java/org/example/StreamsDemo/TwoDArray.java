package org.example.StreamsDemo;

import java.util.Arrays;

public class TwoDArray {

    public static void main(String args[]){

        int [][] g = {
                {1, 2, 3},
                {4, 3, 2},
                {-1, -4, -3}
        };
        int x =  Arrays.stream(g).flatMapToInt(Arrays::stream).sum();
        System.out.println(x);
        int y = Arrays.stream(g).flatMapToInt(l->Arrays.stream(l)).sum();
        System.out.println(y);
        int z = Arrays.stream(g).parallel().flatMapToInt(Arrays::stream).sum();
        System.out.println(z);
    }
}
