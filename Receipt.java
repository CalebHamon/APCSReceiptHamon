// Receipt.java

import java.util.Scanner;

public class Receipt {
    public static void main (String[] args){
        String initial;
        String Coffee = ("Coffee");
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
        for (int i = 0; i < 1; i++ ) {
            if (initial.toUpperCase() == "Coffee" ) {
                System.out.println("How Much Would You Like?")
                int temp;
                temp = scan.nextInt();
                if (temp  )
            }
        }



    }

}