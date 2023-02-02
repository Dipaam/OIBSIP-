import java.util.*;
import java.lang.Math;
class GuessingGame
{
	public static void main(String[] args)
	{
		int answer=(int) (Math.random() * 100)+1;
		int k=5;
		Scanner input=new Scanner(System.in);
		boolean correct=false;
		System.out.println("I am thinking of a number between 1 to 100.\nYou have 5 tries to guess the number.");
		while(k>0)
		{
			System.out.println("Enter your guess:");
			int guess = input.nextInt();
			if(guess==answer)
			{
				System.out.println("You guessed the number!\nYou win!");
				break;
			}
			else if(guess > answer)
			{
				System.out.println("Your guess is too high.\nYou have " + (k-1) +" tries left ");
				k--;
			}
			else
			{
				System.out.println("Your guess is too low.\nYou have " + (k-1) +" tries left ");
				k--;
			}
		}
			if(correct==false)
			{
				System.out.println("you ran out of tries.\nYou lose!");
			}
				
	}
}