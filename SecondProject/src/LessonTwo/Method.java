package LessonTwo;

public class Method {

	public static void main(String[] args) {
	myFirstMethod("Bhavya");	
	myFirstMethod("Swaroop");
	Add(27,26);

	}
	  public static void myFirstMethod(){
		System.out.println("Hello"); 
	  }
		
		public static void myFirstMethod(String name){
			System.out.println("Hello " + name);
		}
			
	    public static void Add(int a,int b){
	    	
				System.out.println( a + b);
		}
	    
	   

}
