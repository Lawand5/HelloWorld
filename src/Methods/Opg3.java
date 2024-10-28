package Methods;

import java.util.Scanner;

public class Opg3 {

    public static void BMI() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hvad er din vægt?");
        int weight = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Hvad er din højde");
        double height = scanner1.nextDouble();
        double result = weight / (height * height);
        System.out.println("Din BMI er = " + result);
    }

    public static void main(String[] args) {
        BMI();
    }
} 