
import java.util.Scanner;

public class ReversedWord{
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter a word: ");
String word = sc.nextLine();


int lengthOfWord = word.length();
int count = lengthOfWord - 1;

while (count >= 0){

System.out.print(word.charAt(count));

count--;

}

}
}