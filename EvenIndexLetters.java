

import java.util.Scanner;

public class EvenIndexLetters{
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter a word: ");
String word = sc.nextLine();


int lengthOfWord = word.length();
String evenIndexLetters = "";
int count = 0;

while (count < lengthOfWord){

if (count % 2 == 0){

evenIndexLetters += word.charAt(count);

}

count++;
}

System.out.print(evenIndexLetters);

}
}