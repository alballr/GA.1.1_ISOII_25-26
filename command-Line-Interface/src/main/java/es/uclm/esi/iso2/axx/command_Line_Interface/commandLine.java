package es.uclm.esi.iso2.axx.command_Line_Interface;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class commandLine implements commandLineI {
	
	public Scanner sc;
	
	public commandLine() {
		sc = new Scanner(System.in);
	}

	public int readInt() {
		boolean flag = true;
		int num= 0;
		while(flag == true) {
			try {
				String input= sc.nextLine();
				num = Integer.parseInt(input);
				flag = false;
			} catch(NumberFormatException e) {
				flag = true;
			}		
		}
		return num;
	}
	
	public double readDouble() {
		boolean flag = true;
		double num= 0;
		while(flag == true) {
			try {
				String input= sc.nextLine();
				num = Double.parseDouble(input);
				flag = false;
			} catch(NumberFormatException e) {
				flag = true;
			}		
		}
		return num;
	}

	public Date readDate() {
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);
		boolean flag = true;
		while(flag == true) {
			try {
				String input = sc.nextLine();
				date= sdf.parse(input);
				flag= false;
			} catch (ParseException e) {
				flag= true;	
			}
		}
		return date;
	}
	
	public boolean readBoolean() {
		boolean flag = true;
		boolean bool= false;
		while(flag == true) {
			try {
				String input= sc.nextLine();
				bool = Boolean.parseBoolean(input);
				flag = false;
			} catch(NumberFormatException e) {
				flag = true;
			}		
		}
		return bool;
	}
   
	public String readString() {
		return sc.next();
	}

	public String readLine() {
		return sc.nextLine();
	}

	public void printLine(String output) {
		System.out.println(output);		
	}
	
	public void print(String output) {
		System.out.print(output);
	}	

}
