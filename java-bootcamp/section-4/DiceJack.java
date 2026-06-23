import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.print("Enter three number between 1 to 6: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if(isLessThan1(num1, num2, num3) || isHigherThan6(num1, num2, num3)) {
            System.out.println("You entered number(s) outside the valid range");
            System.exit(0);
        }
        
        int sumOfNumbers = num1 + num2 + num3;
        int sumOfDiceRolls = roll1 + roll2 + roll3;

        System.out.println("Your sum: " + sumOfNumbers + " Dice Sum: " + sumOfDiceRolls);
        if (userwon(sumOfNumbers, sumOfDiceRolls)) { 
            System.out.println("\ncongratulations, you won!");
        } else {
            System.out.println("\nBetter luck next time!");
        }

        scan.close();
    }

    public static boolean isLessThan1(int num1 , int num2 , int num3){
        return (num1 < 1 || num2 < 1 || num3 < 1);
    }

    public static boolean isHigherThan6(int num1 , int num2 , int num3){
        return (num1 > 7 || num2 > 7 || num3 > 7);
    }

    public static boolean userwon(int sumNumbers , int sumDiceRolls) {
        return(sumNumbers > sumDiceRolls && (sumNumbers - sumDiceRolls) < 3);
    }
    public static int rollDice() {
        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int)randomNumber;
    }
}
