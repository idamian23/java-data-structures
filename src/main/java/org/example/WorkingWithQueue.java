package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueue {
    public static void main(String[] args) {

        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("damian",18));
        supermarket.add(new Person("maria",22));
        supermarket.add(new Person("bianca",25));

        System.out.println(supermarket);
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket);

    }

    static record Person(String name, int age){}
}
