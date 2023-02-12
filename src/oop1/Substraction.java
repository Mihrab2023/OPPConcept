package oop1;


	public class Substraction extends Addition{
	

		void sub(int a, int b) {
			int s = a-b;
			System.out.println(s);
		}//end sub
		
		public int add(int a, int b, int c){
			int sum = a+b+c+5;
			return sum;
		}//end add
		
	public static void main(String[]args) {
		Substraction s1 = new Substraction();
		s1.sub(100, 50);
		
		int sum = s1.add(100,100,100);
		s1.sub(sum, 75);
		
		s1.setX(500);
		s1.setY(500);
		s1.add();
		
		//(100+100+100)-75
		
	 }//end main
	
	

}//end class