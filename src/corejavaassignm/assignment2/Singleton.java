package corejavaassignm.assignment2;

public class Singleton {

	private static Singleton instance;
	

    private Singleton() { //private constructor to prevent from creating instnce
    }

    // Public static method to access the instance
    public static Singleton getInstance() {
    	//checking instance
    	//if not created create one else return name
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
