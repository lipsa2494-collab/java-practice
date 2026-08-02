package assign4;
import java.util.ArrayList;
import java.util.Scanner;
public class Ass4Q4 {
	public static void main(String[] args) {
		ArrayList<Integer> lst=new ArrayList();
		Scanner sc=new Scanner(System.in);
		int choice;
		int ele;
		do {
			System.out.println("1.Add element");
			System.out.println("2.Remove element");
			System.out.println("3.Search element");
			System.out.println("4.Display all elements:");
			System.out.println("5.exit");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter element to add:");
				ele=sc.nextInt();
				lst.add(ele);
				break;
				
			case 2:
				System.out.println("Enter element to search:");
				ele=sc.nextInt();
				if(lst.remove(Integer.valueOf(ele))) {
					System.out.println("Element removed");
				}
				else {
					System.out.println("Element not removed");
				}
				break;
				
			case 3:
				System.out.println("Enter element to search:");
				ele=sc.nextInt();
				if(lst.contains(ele)) {
					System.out.println("Element found");
				}
				else {
					System.out.println("Element not found");
				}
				break;
				
			case 4:
				System.out.println("Elements in the list: "+lst);
				break;
			
			case 5:
				System.out.println("Exiting program");
				break;
			
			default:
				System.out.println("Invalid choice");
			}
		}
		while(choice !=5);
	}
}
