/*
 *  Name : Amirreza Mirzaei
 */
import java.util.Random;
import java.util.Scanner;

public class RollingDice {

	public static void main(String[] args) {
		
		Random randomNumber = new Random();
		
		int x = randomNumber.nextInt(6) + 1;
		if(x == 6) {
			System.out.println("Congrats, You rolled a " + x + " now you can roll another time");
		} else {
			System.out.println("you rolled " + x);
		}

	}

}
