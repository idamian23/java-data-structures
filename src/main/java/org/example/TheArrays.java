package org.example;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";
        colors[2] = "yellow";

        System.out.println(Arrays.toString(colors));

        int[] numbers = {100,200};

        for (int i = 0; i < colors.length;i++) {
            System.out.println(colors[i]);
        }

        Arrays.stream(colors).forEach(System.out::println);



    }
}
