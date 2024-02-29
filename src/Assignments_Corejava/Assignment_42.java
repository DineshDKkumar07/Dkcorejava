package Assignments_Corejava;

import java.util.Date;

//write a program to get 10 days before the current time and 10 days after the current time using Date Class?
public class Assignment_42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d=new Date();//creating object for date 
		Date d1= new Date(d.getTime() -(1000*60*60*24*10));// creating object for getting future or past dates based on conditions
		System.out.println(d1);
	//	System.out.println(d);

	}

}