/**
* Driver class to test Singleton Pattern
*/
public class Driver{
	public static void main(String[] args){
	OurSingleObject obj = new OurSingleObject();
	OurSingleObject objTwo = new OurSingleObject();
	
	OurSingleObject obj = OurSingleObject.getInstance();
	OurSignleObject objTwo = OurSingleObject.getInstance();
	
	if(obj.equals(objTwo)){
		System.out.println("Same instance");
		}	
	else
		System.out.println("Something went wrong");
	}
}