import java.util.Scanner;

public class Largest_two {
public static void main(String[] args) {
	Scanner in =  new Scanner(System.in);
	int num1 = in.nextInt();
	int num2 = in.nextInt();
	if(num1>=num2) {
		System.out.println("Num1 is greater");
	}
	else {
		System.out.println("Num2 is greater");
	}
}
}
