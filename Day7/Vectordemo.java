package list;

import java.util.Vector;

public class Vectordemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>(8);
        vector.add("Carrot");
        vector.add("Tomato");
        vector.add("Onions");
        vector.addElement("potato");
        System.out.println(vector);
        System.out.println(vector.capacity());
        System.out.println(vector.size());
        System.out.println(vector.firstElement());
        System.out.println(vector.contains("Tomato"));
        vector.removeElement("Onions");
        vector.forEach(veg -> System.out.println(veg));
    }
}
//vector is a dynamic array (which can inc or decr the size)
//Its like one row or a coloumn of a matrix
//we have add element methods here