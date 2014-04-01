import java.util.ArrayList;

/**
 * 
 */

/**
 * @author zainmaqsood, irfanraziuddin
 *
 */
public class Building implements Facility{

	private int id;
	private String type;
	ArrayList<Facility> facilities = new ArrayList<Facility>();
	
	public Building(int Id, String Type){
		this.id = Id;
		this.type = Type;
	}
	
	public void addFacility(Facility facility){
		facilities.add(facility);
	}
	
	public boolean removeFacility(Facility facility){
		//if (facilities.contains(facility))
			return (facilities.remove(facility));
		
	}
	@Override
	public void listDetails() {
		for (Facility facility : facilities){
			facility.listDetails();
		}
		
	}
}
