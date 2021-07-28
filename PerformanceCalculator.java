package Const_Static;
import java.util.Scanner;

class Employee{
	private int point;

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
}

class PerformanceRating{
	private final static int Outstanding=5;
	private final static int Good=4;
	private final static int Average=3;
	private final static int Poor=2;
	
	static int calculatePerformance(Employee employee) {
		if(employee.getPoint()>=80 && employee.getPoint()<=100)
			return PerformanceRating.Outstanding;
		else if(employee.getPoint()>=60)
			return Good;
		else if(employee.getPoint()>=50)
			return Average;
		else if(employee.getPoint()>=1)
			return Poor;
		return 0;
	}
}

public class PerformanceCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Employee employee[]=new Employee[3];
		System.out.println("Enter points for three employees:");
		for(int i=0;i<3;i++) {
			employee[i]=new Employee();
			employee[i].setPoint(sc.nextInt());
			
		}
		
		System.out.println("Respective rating out of 5 for the three employees are:");
		for(int i=0;i<3;i++) {
			System.out.print( PerformanceRating.calculatePerformance( employee[i])+"    ");
		}

	}

}
