package Jdbc;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MyJdbc {
	public static void main(String args[]) throws  IOException{ 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("Print 1 to Add Student");
			System.out.println("Print 2 to Delete Student");
			System.out.println("Print 3 to Display Student");
			System.out.println("Print 4 to exit Application");
			//Scanner sc =new Scanner(System.in);
			int n=Integer.parseInt(br.readLine());
		try{  
			
		
			 
		switch(n) {
        case 1:
        	System.out.println("You have selected to Add Student");
        	System.out.println("Please Enter Student Name: ");
			   String name=br.readLine();
        	System.out.println("Enter PhoneNumber: ");
		       String phone=br.readLine();
			   
			   System.out.println("Enter City :");
			   String city=br.readLine();
			   Student st=new Student(name,phone,city);
			   System.out.println(st);
			   boolean answer=StudentDataBase.insertStudentToDB(st);
			   if(answer) {
				   System.out.println("Student is added Successfully");
			   }else {
				   System.out.println("Something Went Wrong...Please Try again");
			   }
			  break;

        case 2:
            System.out.println("You have selected to Delete Student ID");
            System.out.println("Please Enter Student ID to Delete");
            int userID=Integer.parseInt(br.readLine());
            boolean f=StudentDataBase.deleteStudent(userID);
            if(f) {
            	System.out.println("Deleted");
            }else {
            	System.out.println("Something Went Wrong...Please Try again");
            }
            break;
        case 3:
            System.out.println("You have Selected to Show All Student");
            StudentDataBase.showAllStudent();
            break;
        case 4:
            System.out.println("Application closed...");
            System.out.println("Thanks for using...  :)");
            System.exit(n);
             
		}
		}
		catch(Exception e){ System.out.println(e);}  
		}  
		} } 