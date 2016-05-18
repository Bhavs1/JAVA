package question;

public class DataCone {

	public static void main(String[] args) {
		/*Cone c1 = new Cone();
		Cone c2 = new Cone(3,13);
		Cone c3 = new Cone(13, 21, 19);*/
		Cone c4 = new Cone();
		System.out.println(c4.getVolume() + " " + c4.getSurfaceArea());
		
		c4.setHeight(4);
		
		System.out.println(c4.getVolume() + " " + c4.getSurfaceArea());
		
		/*System.out.println(c1.getVolume() + " " + c1.getSurfaceArea());
		System.out.println(c2.getVolume() + " " + c2.getSurfaceArea());
		System.out.println(c3.getVolume() + " " + c3.getSurfaceArea());*/
		
		

	}

}
