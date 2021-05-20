package operators;

import java.util.Scanner;

public class MonthToDays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String month = sc.next();
		month = month.toUpperCase();
		int days = 0;

		// switch statements
		switch (month) {
		case "JANUARY":
			days = 31;
			break;
		case "FEBRUARY":
			days = 28;
			break;
		case "MARCH":
			days = 31;
			break;
		case "APRIL":
			days = 30;
			break;
		case "MAY":
			days = 31;
			break;
		case "JUNE":
			days = 30;
			break;
		case "JULY":
			days = 31;
			break;
		case "AUGUST":
			days = 31;
			break;
		case "SEPTEMBER":
			days = 30;
			break;
		case "OCTOBER":
			days = 31;
			break;
		case "NOVEMBER":
			days = 30;
			break;
		case "DECEMBER":
			days = 31;
			break;
		default:
			days = 0;
		}
		System.out.println("Using Switch Statements");
		System.out.println(printStatement(month, days));
		System.out.println("---------------------------");

		// if else-if blocks
		if (month.equals("JANUARY"))
			days = 31;
		else if (month.equals("FEBRUARY"))
			days = 28;
		else if (month.equals("MARCH"))
			days = 31;
		else if (month.equals("APRIL"))
			days = 30;
		else if (month.equals("MAY"))
			days = 31;
		else if (month.equals("JUNE"))
			days = 30;
		else if (month.equals("JULY"))
			days = 31;
		else if (month.equals("AUGUST"))
			days = 31;
		else if (month.equals("SEPTEMBER"))
			days = 30;
		else if (month.equals("OCTOBER"))
			days = 31;
		else if (month.equals("NOVEMBER"))
			days = 30;
		else if (month.equals("DECEMBER"))
			days = 31;
		else
			days = 0;
		System.out.println("Using if else blocks");
		System.out.println(printStatement(month, days));

		sc.close();
	}

	public static String printStatement(String month, int days) {
		if (days == 0)
			return "Please enter a valid year";
		else if (days == 28)
			return days + " or " + ++days + " days in a month of " + month + " based on the year";
		return days + " days in a month of " + month;
	}
}
