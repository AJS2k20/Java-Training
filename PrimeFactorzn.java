package Practice;

import java.util.Scanner;

public class PrimeFactorizn {

	public static void PrimeFactors(int number) {
		while(number % 2 == 0) {
			System.out.println(2 +" ");
			number /=  2;
			}
		
		for(int i = 3; i*i <= number; i+=2) {
			while(number % i == 0) {
				System.out.println(i + " ");
			number /=i;
			}
		}
		
		if(number > 2) {
			System.out.println(number + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter a numebr ot find its prime factors: ");
		int num = sc.nextInt();
		
		PrimeFactors(num);
		sc.close();
	}

}
