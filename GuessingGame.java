

import java.util.Scanner;

public class GuessingGame {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);


int randomNumber = 13;
int counter = 1;

System.out.print("Pick a number: ");
int number = sc.nextInt();

while (number != randomNumber){

System.out.print("Pick a number between 1 and 100: ");
number = sc.nextInt();

counter += 1;
}

System.out.print("The user made " + counter + " guesses");

}
}