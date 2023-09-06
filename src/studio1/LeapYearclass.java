package studio1;

import java.util.Scanner;

public class LeapYearclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Year");
		int year = in.nextInt();
		
		boolean isleapyear = (((year % 4 == 0 )&& !(year % 100 == 0)) || (year % 400 == 0));
		System.out.print(isleapyear);
		}}
