package intermidiate.methodAssignment;
import java.util.Scanner;

//Write a method that prints "Hello, World!" when called. Call the method using the class name.
//Write a method that takes two integers as parameters and prints their sum. Call the method using the class name.
//Write a method that takes an integer as a parameter and prints whether it is even or odd. Call the method using the class name.
//Write a method that takes an integer and prints its multiplication table up to 10. Call the method using the class name.
//Write a method that takes two numbers as parameters and swaps them without returning anything. Call the method using the class name.
//Write a method that takes an integer N and prints numbers from 1 to N. Call the method using the class name.
//Write a method that takes an integer as a parameter and prints whether it is positive, negative, or zero. Call the method using the class name.
//Write a method that takes an integer N and prints natural numbers from N to 1. Call the method using the class name.
//Write a method that takes an integer and prints its square. Call the method using the class name.
//Write a method that takes an integer and prints its cube. Call the method using the class name.
//Write a method that takes an integer and prints its reverse. Call the method using the class name.
//Write a method that takes a character and prints its ASCII value. Call the method using the class name.
//Write a method that takes a character and prints whether it is a vowel or consonant. Call the method using the class name.

public class Method {
	
	public static void printHello() {
		System.out.println("Hello World");
	}
	public static void findAddition(int a , int b) {
		int sum = a+b;
		System.out.println("The sum is :" + sum);
	}
	public static void evenOrOdd(int a ) {
		if(a%2==0) {
			System.out.println("It is even");
		}
		else {
			System.out.println("It is odd");
		}
	}
	public static void table(int a) {
		for(int i= 1;i<=10;i++) {
			System.out.println(a+" "+"x"+" "+i+" "+(a*i));
		}
	}
	public static void swap(int a , int b) {
		a = (a+b) - (b=a);
		System.out.println("Value of a is :"+a + "Value of b is :"+b);
		
	}
	public static void printN(int N) {
		for(int i = 1;i<=N;i++) {
			System.out.println(i);
		}
	}
	public static void signed(int n) {
		if(n>0) {
			System.out.println("Positive");
		}
		else if(n==0) {
			System.out.println("Zero");
		}
		if(n<0) {
			System.out.println("Negative");
		}
	}
	public static void Nprint(int N) {
		for(int i =N;i>=1;i++) {
			System.out.println(i);
		}
	}
	public static void square(int a) {
		System.out.println(a*a);
	}
	public static void cube(int a) {
		System.out.println(a*a*a);
	}
	public static void reverse(int num) {
		int reverse = 0;
		while(num>0) {
			int rem = num%10;
			reverse = (reverse*10)+rem;
			num/=10;
		}
		System.out.println("The reverse of number is : "+reverse);
	}
	public static void ascii(char c) {
		int value = (int)c;
		System.out.println("The value is :" + value);
	}
	public static void vowelOrConsonant(char c) {
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
			System.out.println("Character given is a vowel :" + c);
		}
		else {
			System.out.println("Character given is a Consonant :"+ c);
		}
	}
  public static void main(String[] args) {
	Scanner scanner  = new Scanner(System.in);

	 int choice;
     do {
         System.out.println("\nMenu:");
         System.out.println("1. Print Hello");
         System.out.println("2. Find Addition");
         System.out.println("3. Even or Odd");
         System.out.println("4. Print Table");
         System.out.println("5. Swap Numbers");
         System.out.println("6. Print N Numbers");
         System.out.println("7. Check Sign");
         System.out.println("8. Print N Numbers Again");
         System.out.println("9. Square");
         System.out.println("10. Cube");
         System.out.println("11. Reverse Number");
         System.out.println("12. ASCII Value");
         System.out.println("13. Vowel or Consonant");
         System.out.println("0. Exit");
         System.out.print("Enter your choice: ");
         choice = scanner.nextInt();

         switch (choice) {
             case 1:
                 printHello();
                 break;
             case 2:
                 System.out.print("Enter two numbers: ");
                 findAddition(scanner.nextInt(), scanner.nextInt());
                 break;
             case 3:
                 System.out.print("Enter a number: ");
                 evenOrOdd(scanner.nextInt());
                 break;
             case 4:
                 System.out.print("Enter a number: ");
                 table(scanner.nextInt());
                 break;
             case 5:
                 System.out.print("Enter two numbers: ");
                 swap(scanner.nextInt(), scanner.nextInt());
                 break;
             case 6:
                 System.out.print("Enter a number: ");
                 printN(scanner.nextInt());
                 break;
             case 7:
                 System.out.print("Enter a number: ");
                 signed(scanner.nextInt());
                 break;
             case 8:
                 System.out.print("Enter a number: ");
                 Nprint(scanner.nextInt());
                 break;
             case 9:
                 System.out.print("Enter a number: ");
                 square(scanner.nextInt());
                 break;
             case 10:
                 System.out.print("Enter a number: ");
                 cube(scanner.nextInt());
                 break;
             case 11:
                 System.out.print("Enter a number: ");
                 reverse(scanner.nextInt());
                 break;
             case 12:
                 System.out.print("Enter a character: ");
                 ascii(scanner.next().charAt(0));
                 break;
             case 13:
                 System.out.print("Enter a character: ");
                 vowelOrConsonant(scanner.next().charAt(0));
                 break;
             case 0:
                 System.out.println("Exiting...");
                 break;
             default:
                 System.out.println("Invalid choice! Please try again.");
         }
     } while (choice != 0);
	
	
	
}
}
