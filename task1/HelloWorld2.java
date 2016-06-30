package task1;

import java.util.Scanner;

public class HelloWorld2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Как тебя зовут?");
        String name = sc.nextLine();
        System.out.println("Привет, "+ name);
    }
}
