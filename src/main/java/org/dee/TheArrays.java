package org.dee;

import java.util.Arrays;

public class
TheArrays {
    public static void main(String[] args) {
        
        String[] colors = new String[5];
        colors[0] ="purple";
        colors[1] ="blue";

        System.out.println(Arrays.toString(colors));
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        String message = "hello world";
        System.out.println(message);
        int[] numbers = {100,200};

        for(int i =0; i<colors.length;i++){
            System.out.println(colors[i]);
        }

        for(String color : colors) {
            System.out.println(color + " --Easy loop");
        }

        Arrays.stream(colors).forEach(System.out::println);


    }
}
