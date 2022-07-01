package assingment1;

public class TestCar {

	public static void main(String[] args) 
	{
		Car c1=new Tata();
		
		System.out.println("Fuel type of Tata Motors: "+c1.fueltype()+" motor version: "+c1.version()+"motor mileage: "+c1.mileageinkmpl());  
		
		Car c2=new Mahindra();
		System.out.println("Fuel type of Tata Motors: "+c2.fueltype()+" motor version: "+c2.version()+"motor mileage: "+c2.mileageinkmpl());  
		
	}

}
