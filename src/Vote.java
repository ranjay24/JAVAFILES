import java.util.Scanner;

public class Vote {
public static void main(String[] args) {
	Scanner in =  new Scanner(System.in);
	int age = in.nextInt();
	if(age>=18) {
		System.out.println("Person can vote");
	}
	else {
		System.out.println("Person is under-aged");
	}
}
}
