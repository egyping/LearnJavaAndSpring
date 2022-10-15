package org.amigoscode;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuesInAction {

    public static void main(String[] args) {

        // Queues
        // FIFO First in first out
        // most of the time we use PriorityQueue or LinkedLis

        Queue<Person> queue1 = new LinkedList<>();
        queue1.add(new Person("Fahd"));
        queue1.add(new Person("Yassin"));
        queue1.add(new Person("Yomna"));
        queue1.add(new Person("Yehya"));
        System.out.println(queue1);
        // [Person{name='Fahd'}, Person{name='Yassin'}, Person{name='Yomna'}, Person{name='Yehya'}]

        System.out.println(queue1.peek());
        // Person{name='Fahd'} -- peek bring the front of the q the first

        //queue1.poll();
        //System.out.println(queue1.poll());
        // Person{name='Yassin'}
        // poll removed the first and now yassin is the first
        // removed Fahd because of FIFO

        queue1.forEach(x -> System.out.println(x.name));
//      Fahd
//      Yassin
//      Yomna
//      Yehya

    }


    static class Person {
        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
