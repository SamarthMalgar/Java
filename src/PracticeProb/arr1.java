package PracticeProb;

import java.util.*;

public class arr1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int input = 0;
        int computerChoice;
       // String playAgain = "yes";

        do {
            computerChoice = random.nextInt(1,100);
            while(input  != computerChoice){
                System.out.print("Enter the number between(1 to 100): ");
                System.out.println(input = sc.nextInt());

                if ((input > 100) || (input < 1)) {
                    System.out.println("invalid Number");
                    break;
                }
                if (input > computerChoice) {
                    System.out.println("it is greater than computer choice\n try smaller Number");

                } else if (input < computerChoice) {
                    System.out.println("it is smaller than computer Choice\n try larger Number");

                } else {
                    System.out.println("Congrats right Answer");
                }
            }

        }while((input > 100) || (input < 1));
        System.out.print("Thank You for playing");
        sc.close();

    }
}