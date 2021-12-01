package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StreamStrings {
    public static void main(String[] args) {
        ArrayList<String> vowels = new ArrayList<>(List.of("a", "e", "i", "o", "u", "A", "E", "I", "O", "U"));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letter to search");
        String newls = "";
        vowels.stream()
                .filter(x -> vowels.contains((sc.nextLine())))
                .findAny();
        System.out.println(vowels.add(newls));
    }
}
