/**
* Custom StringBuilder class to help understand the inner workings of 
* the data structure.
*
**/
public class CustomStringBuilder{
	
	// String, StringBuilder, StringBuffer use char[] for internal storage
	private char[] myStringArray;
	private int size = 0;
	private final int initialSize = 10;
	
	/**
	* Default Constructor with no characters 
	*/
	public CustomStringBuilder(){
			this(intialSize);
	}	
	
	/**
	* Constructor with size parameter 
	*
	* @throws NegativeArraySizeException
	**/
	public CustomStringBuilder(int size){
		if(size<0){
			throw new NegativeArraySizeException("Size cannot be negative");
		}
		myStringArray = new char[size];
		this.size = size;
	}
	
	/**
	* Constructor 
	*
	* @throws NullPointerException
	*/
	public CustomStringBuilder(String str){
		if(str==null){
			throw newNullPointerException("String cannot be null.");
		}
		super(str.length() + intialSize;
		append(str);
	}
	
	// To Do: implement constructor that accepts a charsequence 
	
	public int length(){
		return this.size;
	}
	
	public void add(String s){
		checkSize();
		
	}
	
	/**
	* Method returns the char at the specified index
	*
	* @throws StringIndexOutOfBoundsException 
	*/
	public char charAt(int index){
		if(index < 0 || index >= this.size){
			throw new StringIndexOutOfBoundsException("Index must be between 0 and " + size-1 + ".");
		}
				return myStringArray[index];
	}
	
	/**
	* Method sets the char at the specified index
	*
	* @throws StringIndexOutOfBoundsException 
	*/
	public char setCharAt(int index, char c){
		if(index < 0 || index >= this.size){
			throw new StringIndexOutOfBoundsException("Index must be between 0 and " + size-1 + ".");
		}
		myStringArray[index] = c;
	}
	
	/**
	* TO DO: append, substring, indexOf, lastIndex, reverse, to string
	public String append(String str){
		
	}
	**/
	
	private void checkSize(int size){
		if(size>stringArray.length){
			char[] newArray = new char[size];
			System.arraycopy(this.stringArray, 0, newArray, 0, this.size);
		}

}