package htc.training.homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Home {
	
	static int test;

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		/*  // logic to print the series exercise
		String seriestxt;
		String fractxt;
		
		Series series = new Series(20); 
		seriestxt = series.seriesnum();
		fractxt = series.fracseries();
		
		System.out.println(seriestxt);		//prints 1,-3,5,-7....
		System.out.println(fractxt);		//prints 1/1, 1/2, 1/3 ...
		*/
		
		/*  //Loan calculation using the inheritance method
		EmployeeInheritence emp = new EmployeeInheritence("Hem",38,"unmarried","temporary",10);
		emp.loancalc();
		System.out.println("Loan amount - Rs " + emp.getLoanamt());
		
		EmployeeInheritence emp1 = new EmployeeInheritence("Hem",58,"unmarried","temporary",30);
		emp1.loancalc();
		System.out.println("Loan amount - Rs " + emp1.getLoanamt());
		
		EmployeeInheritence emp2 = new EmployeeInheritence("Hem",38,"unmarried","permanent",28);
		emp2.loancalc();
		System.out.println("Loan amount - Rs " + emp2.getLoanamt());
		
		EmployeeInheritence emp3 = new EmployeeInheritence("Hem",68,"unmarried","permanent",31);
		emp3.loancalc();
		System.out.println("Loan amount - Rs " + emp3.getLoanamt());
		
		EmployeeInheritence emp4 = new EmployeeInheritence("Hem",28,"married","permanent",28);
		emp4.loancalc();
		System.out.println("Loan amount - Rs " + emp4.getLoanamt());
		
		EmployeeInheritence emp5 = new EmployeeInheritence("Hem",68,"married","permanent",31);
		emp5.loancalc();
		System.out.println("Loan amount - Rs " + emp5.getLoanamt());
		*/
		
		/*  //Loan calculation - passing obj as a paramerter
		//Person hem = new Person("Hem",38,"unmarried");
		//Employee emp = new Employee("temporary",10,0, hem);   //initializing loanamt as 0 and passing obj hem
		//Employee emp = new Employee("temporary",31,0, hem);
		
		//Employee emp = new Employee("permanent",10,0, hem);
		//Employee emp = new Employee("permanent",31,0, hem);
		
		Person gee = new Person("Geetha",38,"married");
		//Employee emp = new Employee("permanent",10,0, gee);
		Employee emp = new Employee("permanent",30,0, gee);
		emp.loancalc();
		System.out.println(emp.toString());
		*/
		
		/* 		//loan calc using clone method
		EmployeeClone hem = new EmployeeClone("married","temporary",10);
		hem.loancalc();
		System.out.println(hem.toString());
		
		EmployeeClone hem1 = (EmployeeClone) hem.clone();
		hem1.setExperience(30);
		hem1.loancalc();
		System.out.println(hem1.toString());
		
		EmployeeClone hem2 = (EmployeeClone) hem.clone();
		hem2.setExperience(30);
		hem2.setJobstatus("permanent");
		hem2.loancalc();
		System.out.println(hem2.toString());
		
		EmployeeClone hem3 = (EmployeeClone) hem.clone();
		hem3.setExperience(10);
		hem3.setJobstatus("permanent");
		hem3.loancalc();
		System.out.println(hem3.toString());
		
		EmployeeClone hem4 = (EmployeeClone) hem.clone();
		hem4.setExperience(30);
		hem4.setJobstatus("permanent");
		hem4.setMaritalstts("unmarried");
		hem4.loancalc();
		System.out.println(hem4.toString());
		
		EmployeeClone hem5 = (EmployeeClone) hem.clone();
		hem5.setExperience(10);
		hem5.setJobstatus("permanent");
		hem5.setMaritalstts("unmarried");
		hem5.loancalc();
		System.out.println(hem5.toString());
		*/
		
		/*
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an ip - ");
		String ip = scan.next();
		System.out.println(ip);
		*/
		Connection conn=null;
		Statement stmt = null;
		ResultSet rslt = null;
		String query;
		
		try {
		conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/JavaTraining","postgres","Newday01");
		stmt = conn.createStatement();
		rslt = stmt.executeQuery("SELECT * FROM public.\"Employee\"");
		while(rslt.next()) {
			System.out.println(rslt.getInt(1));
			System.out.println(rslt.getString(2));
			System.out.println(rslt.getString(3));
		}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
