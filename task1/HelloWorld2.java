package task1;

import java.util.Scanner;

public class HelloWorld2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Как твоё имя?");
        String name = sc.nextLine();
        System.out.println("Привет, "+ name);
    }
}
