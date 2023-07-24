package corejavaassignm.assignment2.persistance;

public class Client {

	public static void main(String[] args) {
		//calling persistance object at runtime
		Persistance persistance;
		
		//making a general condition
		boolean a = false;
		
		if(a) {
			persistance = new DatabasePersistance();
		}else {
			persistance = new FilePersistance();
		}

		persistance.persist();
	}

}
