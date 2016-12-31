package pack1;

public class PackageClass {

	public static void main(String[] args) {
		// reference of  a package class
        Package pkg [];
        
        // Instantiate the package class      
        pkg = Package.getPackages();
        
        //print the package info of this class
        
        for(Package p : pkg){
        	
        	System.out.println(p.getName()+"---"+
        	p.getImplementationTitle()+"---"+
        	p.getImplementationVendor()+"---"+
        	p.getImplementationVersion()+"---"+
        	p.hashCode()
        	);
        }
        
        
	}

}
