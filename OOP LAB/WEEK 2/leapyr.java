import java.util.*;
class leapyr
{
	public static void main(String args[])
	{
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year: ");
		year=sc.nextInt();
		if (year%4 != 0)
			System.out.println(year+" is a common year");
		else if (year%400 == 0)
			System.out.println(year+ " is a leap year");
		else if (year%100 == 0)
			System.out.println(year+ " is a common year");
		else
			System.out.println(year+ " is a leap year");
	}
}		