public class sumOfSquares{
public static void main(String[] args) {

int number = 345;
int sumOfSquares = 0;

int digit = 1;

while (digit <= 3){

sumOfSquares = sumOfSquares + ((number % 10) * (number % 10));
number = number / 10;
digit += 1;

}

if (sumOfSquares === number){

System.out.println("Sum of square is " + sumOfSquares);

}

}
}