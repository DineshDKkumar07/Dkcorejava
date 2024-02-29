package dkprograms;

import java.util.Date;

public class Datedemo {

	public static void main(String[] args) {
	{
		
		Date d = new Date();
		
		System.out.println(d.getTime());
		
		//System.out.println(d);
		
		Date d1= new Date(d.getTime()); //- past or future time we can use this(1000*60*60*24*2));
		
		System.out.println(d1);
		
		//month
		//date
		//year
		String a1= d1.toString();
		String month =a1.substring(4, 7);
		System.out.println(month);
		String a2=d1.toString();
		String date=a2.substring(8, 10);
		System.out.println(date);
		String a3=d1.toString();
		System.out.println(a1.length());
		String year=a3.substring(24, 28);
		System.out.println(year);
		
		System.out.println(date.concat("-").concat(month).concat("-").concat(year));
		

	}

	}
	}
