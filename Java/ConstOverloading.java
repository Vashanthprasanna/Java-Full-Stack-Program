package Java;

public class ConstOverloading {
	
	ConstOverloading(String name){
	        System.out.println("welcome" + name);
	    }

	ConstOverloading(int a , int b){
		this("VP");
	        System.out.println("Addition" + (a+b));

	    }

	ConstOverloading(int n){
		this(10,20);
	        int fact =1;
	        for(int i=1;i<=n;i++){
	            fact = fact*i;
	            System.out.println("factorial:" + fact);
	        }

	    }
	    
	public static void main(String[] args) {
		ConstOverloading obj = new ConstOverloading(5);
		ConstOverloading obj1 = new ConstOverloading("Vk");
		ConstOverloading obj2 = new ConstOverloading(5,10);
	}
}

