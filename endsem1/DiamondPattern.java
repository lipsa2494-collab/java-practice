package endsem1;

public class DiamondPattern {

	public static void main(String[] args) {
	    for(int i=1;i<=3;i++) {
	    	for(int j=1;j<=3-i;j++) {
	    		System.out.print(" ");
	    	}
	    	for(int k=1;k<=(2*i)+1;k++) {
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    }
	    for(int i=1;i<=2;i--) {
	    	for(int j=1;j<=i;j++) {
	    		System.out.print(" ");
	    	}
	    	for (int k=(2*i)-1;k<=3;k++) {
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    	
	    }
	}

}
