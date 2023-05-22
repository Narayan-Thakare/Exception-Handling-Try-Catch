package trycatch;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Student {
	
	
	int roll;
	String name;
	String address;
	
	Student(int roll,String name,String address){
		this.roll=roll;
		this.name=name;
		this.address=address;
	}
	public int getRoll(){
		return roll;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
		
	}
public String toString(){
	return roll+" "+name+" "+address;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	boolean loop=true;
	Scanner s=new Scanner (System.in);
	Collection<Student>c=new ArrayList<Student>();
	while(loop){
		
		System.out.println("1.Add Student");
		System.out.println("2.Exit");
	/*	try{
		System.out.println("Enter the choice");
        int choice= Integer.parseInt(s.nextLine());
		}
		catch(NumberFormatException e){
    		System.out.println("Enter the No. it is a :"+e);
	
			
		}*/
		System.out.println("Enter the choice");
        int choice= Integer.parseInt(s.nextLine());
        switch(choice){
        
        case 1:
        	try{
        	System.out.println("1 .Enter The Roll No.");
        	int roll=Integer.parseInt(s.nextLine());
        	System.out.println("2.Enter The Name");
        	String name=s.nextLine();
        	System.out.println("3.Enter The Address");
        	String address=s.nextLine();
        	c.add(new Student(roll,name,address));
        	
        	}
        	catch(NumberFormatException e){
        		System.out.println("Enter the No. it is a :"+e);
        	}
        	
        	break;
         
        case 2:
        	System.out.println("Exit");
        	loop=false;
        	break;
        
        
        
        
        }
			
	}
			
	}

}
