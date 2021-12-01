package collectionexamples;


import java.util.PriorityQueue;


public class PriorityqueueExm {
    public static void main(String[] args) {
        PriorityQueue<Integer> bus = new PriorityQueue();

        bus.add(10);
        bus.add(50);
        bus.add(40);
        bus.add(59);
        bus.add(12);
        bus.add(20);
        System.out.println(bus);
        bus.forEach(peopleage -> check(peopleage));

    }

    static void check(int peopleage) {
        if (peopleage>=50){
            System.out.println("Reserved for aged people");
        }
        else if(peopleage>=30 && peopleage<=49){
            System.out.println("Reserved for people with children");
        }

        else{
            System.out.println("Unreserved");
        }

    }
}
