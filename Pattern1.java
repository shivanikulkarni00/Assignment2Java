package Assignment2Java;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row :");
        int n=sc.nextInt();
        System.out.println("Enter the column :");
        int m=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

/*
Enter the row :
6
Enter the column :
5
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
 */
	}


