
public class StarbuzzCoffee {
 
	public static void main(String args[]) {
		
		Beverage beverage = new HouseBlend();
		beverage = new Soy(beverage);
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		beverage = new Sugar(beverage);
        beverage = new Whip(beverage);
		System.out.println(beverage.getDescription() 
				+ " $" + beverage.cost());
 
	    Beverage beverage2 = new Varietal();
        beverage2 = new Sugar(beverage2);
        beverage2 = new Milk(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());
    
    }
}
