package org.example;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();  // TreeSet => ORDER , HashSet != ORDER
        balls.add(new Ball("blue"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("black"));
        balls.add(new Ball("green"));

        balls.remove(new Ball("black"));

        System.out.println(balls.size());

        balls.forEach(System.out::println);
    }

    record Ball(String color){}
}
