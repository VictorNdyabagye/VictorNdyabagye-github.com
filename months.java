package months_of_the_year;

import java.util.Scanner;

public class months {

	public static void main(String[] args) {

				String [] Months = {
						"January",
						"February",
						"March",
						"April",
						"May",
						"june",
						"July",
						"August",
						"September",
						"October",
						"November",
						"December"
						
				};
				
				try (Scanner input = new Scanner(System.in)) {
					System.out.println("How many Months make a year ?");
					int Months1 = input.nextInt();
					
					if(Months1 == 12) {
						System.out.println("You got that right my friend,....!, lets continue......");
						
						System.out.println("Enter the number to convert to a Months of the year(from 1 - 13)");
						int number = input.nextInt();
						if(number>12 || number<1) {
							System.out.println("The number entered is invalid");
						}else {
							System.out.println("The numer entered corresponds to :" + Months[number-1]);
						}
					}else {
						System.out.println("You're wrong, " + Months1 + " Months do not make a year !!!!");
					}
				}
				

			}


	}


