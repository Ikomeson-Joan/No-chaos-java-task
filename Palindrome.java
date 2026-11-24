
import java.util.Scanner;

public class Palindrome{
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter a word: ");
String word = sc.nextLine();

String reversedWord = "";
int lengthOfWord = word.length();
int count = lengthOfWord - 1;

while (count >= 0){

reversedWord += word.charAt(count);
count -= 1;

}

if (word.equals(reversedWord)){
System.out.println(word + " is a palindrome");
}

else{
System.out.println(word + " is not a palindrome");
}

}
}