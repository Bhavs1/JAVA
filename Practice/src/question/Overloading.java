package question;

public class Overloading {
	
	public int Add (int a,int b){
		System.out.println("1");
		return (a + b);
		
	}
		
	public int Add (int a,int b ,int c){
		System.out.println("2");
			return (a + b + c);
			
		
	}
	
	public double Add (double a,double b){
		System.out.println("3");
		return (a + b);
		
		
	}
	
	public String Add (String s1, String s2){
		System.out.println("4");
		return(s1 + s2);
		
	}

	public static void main(String[] args){
		
		int a = 10;
		int b = 20;
		int c = 30;
		String s1 = "hello";
		String s2 = "world";
		
		Overloading sum = new Overloading();
	
		
		System.out.println(sum.Add ( a, b));
		System.out.println(sum.Add(a, b,c));
		System.out.println(sum.Add((double)a,(double) b));
		System.out.println(sum.Add(s1, s2));
	}
}
