package myDemo;

	public class staticKeyword{
		
		static int var1;
		int var2;
		
		staticKeyword(){
			
			var1++;
			var2++;
			
		}

		public static void main(String args[]){
			
			staticKeyword obj1=new staticKeyword();
			staticKeyword obj2=new staticKeyword();
			
			
			System.out.println(obj1.var1);
			System.out.println(obj2.var2);
		}
		
		
}