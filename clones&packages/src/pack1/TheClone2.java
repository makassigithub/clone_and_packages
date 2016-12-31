package pack1;

public class TheClone2 implements Cloneable {

	int a;
	double b;
	
	//This method overrides Object's clone()
	public Object clone(){
		try{
			//call clone in this object
			return  super.clone();
		 }catch(CloneNotSupportedException e){
			System.out.println("Cannot clone this object");
			return this;
		}
	}
	
	public static void main(String...args){
	   // instantiate the class to be cloned and set the instance variable		
		TheClone2 cln1 = new TheClone2();
		TheClone2 cln2;
		
		cln1.a = 10;
		cln1.b = 20.15;
		
	//Clone{} is called straight	
		cln2 = (TheClone2) cln1.clone();
		
		System.out.println("cln1: "+ cln1.a+" "+ cln1.b);
		System.out.println("cln2: "+ cln2.a+" "+ cln2.b);
		
		
		
	}
}
