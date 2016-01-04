public class OurSingleObject {

	private static OurSingleObject obj = null;

	// constructor
	private OurSingleObject(){}

	// get instance method
	public static OurSingleObject getInstance(){
		if(obj == null){
			obj = new OurSingleObject();
		}
	 return obj;
	}
}