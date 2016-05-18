package question;

public class HouseDemo {

	public static void main(String[] args) {
		
		House h1 = new House();
		 
		h1.setColor("White");
		h1.setNumber(345);
		h1.setType(3);
		h1.setAddress("Kormangla");
		h1.setCost(15);
		h1.setLength(350);
		h1.setBreadth(500);
		h1.setOwnername("Murugan");
		h1.setSold(true);
		h1.setUnderConstruction(true);
		h1.display();
		
		h1.AddRepair(4);
		h1.increasePrice(6);
		h1.decreasePrice(2);
		h1.display();
	
	}

	}


