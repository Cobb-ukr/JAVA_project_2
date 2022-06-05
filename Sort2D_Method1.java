import java.util.*;
class Sort2D_Method1
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the no. of  rows: ");
            int m = sc.nextInt();
            System.out.print("Enter the no. of columns: ");
            int n = sc.nextInt();
            int A[][]=new int[m][n];
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print("Enter the elements: ");
                    A[i][j] = sc.nextInt();
                }
            }
 
            System.out.println("The original matrix:");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(A[i][j]+"\t");
                }
                System.out.println();
            }
 
            /* Saving the 2D Array into a 1D Array */
            int B[]=new int[m*n];
            int x = 0;
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    B[x] = A[i][j];
                    x++;
                }
            }
             
            /*Sorting the 1D Array in Ascending Order*/
            int t=0;
            for(int i=0; i<(m*n)-1; i++)
            {
                for(int j=i+1; j<(m*n); j++)
                {
                    if(B[i]>B[j])
                    {
                        t=B[i];
                        B[i]=B[j];
                        B[j]=t;
                    }
                }
            }
             
            /*Saving the sorted 1D Array back into the 2D Array */
            x = 0;
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    A[i][j] = B[x];
                    x++;
                }
            }
             
            System.out.println("The Sorted Array:");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(A[i][j]+"\t");
                }
                System.out.println();
            }
        }
    }
