package org.example;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueue {
    public static void main(String[] args) {

        LinkedList<Person> linkedList = new LinkedList<>();

        linkedList.add(new Person("Ionut", 28));
        linkedList.add(new Person("Alexa", 32));
        linkedList.addFirst(new Person("First",45));
        linkedList.addLast(new Person("Last", 100));
        ListIterator<Person> personListIterator = linkedList.listIterator();

        while(personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }

        while(personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }


        System.out.println(linkedList);



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
