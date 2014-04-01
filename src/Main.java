/**
 * 
 */

/**
 * @author zainmaqsood, irfanraziuddin
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Unit U1 = new Unit (1,"Apartment");
		Unit U2 = new Unit (2,"Shop");
		Unit U3 = new Unit (3,"Mall");
		Unit U4 = new Unit (4,"Apartment");
		
		Building B1 = new Building (1,"Residential");
		Building B2 = new Building (2,"Commercial");
		Building B3 = new Building (3,"Office");
		Building B4 = new Building (4,"Mix");
		
		B1.addFacility(U1);
		B1.addFacility(U2);
		B2.addFacility(U3);
		B1.addFacility(U4);
		
		B4.addFacility(B1);
		B4.addFacility(B2);
		
		B4.listDetails();

	}

}
