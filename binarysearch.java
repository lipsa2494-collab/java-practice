import java.util.Scanner;
public class binarysearch {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int A[]=new int[10];
        System.out.print("Enter elements to array:");
        for(int i=0;i<A.length;i++){
        A[i]=sc.nextInt();
    }
    System.out.print("Enter elements to search:");
    int search=sc.nextInt();
    int location=-1;
    int l=0;
    int h=A.length-1;
    while (l<=h) {
        int mid= (l+h)/2;
        if(A[mid]==search){
            location=mid;
            break;
        }
        else if (A[mid]<search){
            l=mid+1;
            }
        else {
            h=mid-1;
        }

        }
    if(location!=-1) {
        System.out.println("Found at"+location);
    }
    else {
        System.out.println("Not found");
    }

    }
    }
    

