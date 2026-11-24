import java.util.Scanner;

public class Average{
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter number or -1 to end: ");
int number= sc.nextInt();

int total = 0;
int counter = 0;

while (number != -1){

total += number;
counter += 1;

double average = (double) total / counter;
System.out.println("Average is " + average);

System.out.print("Enter number or -1 to end: ");
number= sc.nextInt();
}


}
}
