/**
 * 
 */

/**
 * @author zainmaqsood, irfanraziuddin
 *
 */
public class Unit implements Facility{

	private int id;
	private String type;
	
	public Unit(int Id, String Type){
		this.id = Id;
		this.type = Type;
	}
	
	@Override
	public void listDetails() {
		System.out.println("Facility: " + this.id + " " + ", type: " + this.type);
	}

}
