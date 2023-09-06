// Receipt.java

import java.util.Scanner;

public class Receipt {
    public static void main (String[] args){
        double sum;
        String initial;
        String addition;
        System.out.println("Welcome to the Crazy Cafe");
        System.out.println("What Would You Like?");
        System.out.println("We Currently Have The Following:");
        System.out.println("Coffee w/ 1lb of Caffeine: $12.99");
        System.out.println("Tea w/ 1lb of Caffeine: $10.25");
        System.out.println("Bagel w/ 1lb of Caffeine Infused: $4.99");
        System.out.println("Donut w/ 1lb of Caffeine Infused: $4.99");
        System.out.println("Water: $0.99");
        System.out.println("(Please Write The First Word of Each Product To Add The Item To The Cart & Only One Product At A Time, We Will Ask You If You Want Anything Else)");
        Scanner scan = new Scanner(System.in);
        System.out.println("What Would You Like?");
        initial = scan.nextLine();
        if (initial.toUpperCase() == "COFFEE") {
            System.out.println("How Much Would You Like?");
            int temp;
            temp = scan.nextInt();
            if ((temp > 0) && (temp % 1 == 0)) {
                sum = 12.99*temp + sum;
                System.out.println("Would You Like Anything Else?");
                addition = scan.nextLine();
            }
        }
        if (initial.toUpperCase() == "TEA") {
            System.out.println("How Much Would You Like?");
            int temp;
            temp = scan.nextInt();
            if ((temp > 0) && (temp % 1 == 0)) {
                sum = 10.25*temp + sum;
                System.out.println("Would You Like Anything Else?");
                addition = scan.nextLine();
            }
        }
        if (initial.toUpperCase() == "BAGEL") {
            System.out.println("How Much Would You Like?");
            int temp;
            temp = scan.nextInt();
            if ((temp > 0) && (temp % 1 == 0)) {
                sum = 4.99*temp + sum;
                System.out.println("Would You Like Anything Else?");
                addition = scan.nextLine();
            }
        }
        if (initial.toUpperCase() == "DONUT") {
            System.out.println("How Much Would You Like?");
            int temp;
            temp = scan.nextInt();
            if ((temp > 0) && (temp % 1 == 0)) {
                sum = 4.99*temp + sum;
                System.out.println("Would You Like Anything Else?");
                addition = scan.nextLine();
            }
        }
        addition = addition.toUpperCase();
        if ((addition == "YES") || (addition == "Y")) {
            

        }
        
        }



    }

}