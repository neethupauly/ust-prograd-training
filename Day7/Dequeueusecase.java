package Queue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Dequeueusecase {
    public static void main(String[] args) {

        ArrayDeque<Integer> age = new ArrayDeque<Integer>(10);
        ArrayDeque<Integer> age1 = new ArrayDeque<Integer>(10);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no of people to take vaccination : ");
        int n = Integer.parseInt(scanner.nextLine());
        if(n<=10) {
            for (int i = 0; i < n; i++) {
                System.out.print("Enter the Age of the person : ");
                int userage = Integer.parseInt(scanner.nextLine());
                age.add(userage);
            }
            for (Integer x : age) {

                if (x >= 18) {
                    age1.add(x);

                }
            }
            age.removeAll(age1);
            System.out.println("NotAllowed for Vaccination: "+age);
            System.out.println("Allowed for vaccination: "+ age1);
        }
        else {System.out.println("Vaccination only limited for 10 people today");}
    }
}