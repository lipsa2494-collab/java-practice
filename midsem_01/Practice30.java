package midsem_01;

public class Practice30 {

	public static void main(String[] args) {
		for(int r=1;r<=3;r++) {
			for(int s=2;s>=r;s--) {
				System.out.print(" ");
			}
			for(int c=1;c<=(2*r)-1;c++) {
					System.out.print("*");												
			}
			System.out.println();
		}
		for(int x=1;x<=2;x++) {
			for(int y=1;y<=x ;y++) {
				System.out.print(" ");
			}
			for(int z=(2*x)-1;x<=3;x++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
	}

}
