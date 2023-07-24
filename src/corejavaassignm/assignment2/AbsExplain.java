package corejavaassignm.assignment2;


public class AbsExplain {
	
	public static void main(String[] args) {
		//cannot instantiate abstract class
		//Test t = new Test();
				
	}

}

//abstract class if any method is abstract
abstract class Test{
	
	//can have both abstract and concrete method
	//not 100% abstraction
	
	public int add(int a , int b) {		//concrete method
		return a+b;
	}
	
	public abstract void proj();	//abstract method
	
}


//can declare class abstract without abstract method
abstract class Test1{
	
	public void play() {
		System.out.println("Hello,I'm playing with code.");
	}
}

//Extending an abstract class,add the abstract method, override it
//or make the sub classes as private
class Demo extends Test{

	@Override
	public void proj() {		//override abstract method
		// TODO Auto-generated method stub
		
	}
	
}