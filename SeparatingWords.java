

import java.util.Scanner;

public class SeparatingWords {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter a word: ");
String userInput = sc.nextLine();

int lengthOfWord = userInput.length();

int count = 0;

while (count < lengthOfWord){

System.out.println(userInput.charAt(count));

count++;

}

}
}
