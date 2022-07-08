package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter risk :");
        double enteredRisk = scanner.nextDouble();

        List<Bet> bets = new ArrayList<>();

        while (true) {
            System.out.println("Enter value :");
            String enteredValue = scanner.next();
            if (enteredValue.equals("q")) {
                System.out.println("You are out of system");
                break;
            } else {
                bets.add(new Bet(Integer.parseInt(enteredValue), enteredRisk));
                System.out.println(bets);
            }
        }
        System.out.println(bets);
    }
}