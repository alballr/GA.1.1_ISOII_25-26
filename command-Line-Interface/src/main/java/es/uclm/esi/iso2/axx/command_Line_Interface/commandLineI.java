package es.uclm.esi.iso2.axx.command_Line_Interface;

import java.util.Date;

public interface commandLineI {
	
	int readInt();
	int readPositiveInt();
	double readDouble();
	double readPositiveDouble();
	Date readDate();
	String readString();
	String readLine();
	boolean readBoolean();
	
	void printLine(String output);
	void print(String output);

}
