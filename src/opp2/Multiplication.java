package opp2;

import oop1.Addition;

public class Multiplication extends Addition{
	
	void multiple(int a, int b){
		int m = a*b;//local variable
		System.out.println(m);
	}//end add
	
	void multiple (double a, double b){
		double m = a*b;
		System.out.println(m);
	}//end add
	
	public static void main(String[] args) {
		// TODO Auto-generated method stud
		
		Multiplication m1 = new Multiplication();
		m1.multiple(10, 10);
		//(100+100+100)*20
		
		
		int m = m1.add(100, 100, 100);
		m1.multiple(m, 20);
		
		//(110.7 + 100.6 + 100.5) *10
		double m2 = m1.add(100.7, 100.6, 100.5);
		m1.multiple(m2, 10.00);
	
	}

}
