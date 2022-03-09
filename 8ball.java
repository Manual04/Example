import java.util.Random;
import java.util.Scanner;
public class 8Ball{
	public static void main ( String[] args) {
		Random num = new Random();
		int choice = 1 + num.nextInt(12);
		Scanner input = new Scanner(System.in);
		System.out.println("What question do you have for me today?");
		String response = input.nextLine();
		if ( choice == 1) {
			response = "it is certain";
		}else if ( choice 2) {
			response = "Probabaly";
		}else if ( choice 3) {
			response = "Without a doubt";
		}else if ( choice 4) {
			response = "Definley";
		}else if ( choice 5) {
			response = "Oh yess!";
		}else if ( choice 6) {
			response = "Why would that be a no";
		}else if ( choice 7) {
			response = "Oh yes yes";
		}else if ( choice 8) {
			response = "Its likely";
		}else if ( choice 9) {
			response = "Thats a no";
		}else if ( choice 10) {
			response = "Try again";
		}else if ( choice 11) {
			response = "Nah";
		}else if ( choice 12) {
			response = "Why would it";
		}
		System.out.println("MAGIC 8-BALL SAYS" + respose);
}
}