
import java.util.Scanner;

public class Pattern10 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row : ");
        int n=sc.nextInt();
        System.out.println("Enter column : ");
        int m=sc.nextInt();

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

}
/*
Enter row :
5
Enter column :
5
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *

 */