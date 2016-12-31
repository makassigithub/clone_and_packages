package pack1;

public class TheClone implements Cloneable {

	int a;
	double b;
	
	//This method calls object's clone()
	TheClone cloneThis(){
		try{
			//call clone in this object
			return (TheClone) super.clone();
		 }catch(CloneNotSupportedException e){
			System.out.println("Cannot clone this object");
			return this;
		}
	}
	
	public static void main(String...args){
	   // instantiate the class to be cloned and set the instance variable		
		TheClone cln1 = new TheClone();
		TheClone cln2;
		
		cln1.a = 10;
		cln1.b = 20.15;
		
	//Clone cln1	
		cln2 = cln1.cloneThis();
		
		System.out.println("cln1: "+ cln1.a+" "+ cln1.b);
		System.out.println("cln2: "+ cln2.a+" "+ cln2.b);
		
		
		
	}
}
