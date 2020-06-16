package Assignments;

import java.util.Scanner;
class List_of_CompositeNumbers
{
   int num,n,i,j;
   List_of_CompositeNumbers()
     {
       System.out.print("Enter range to find the composite numbers: ");
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       for(i=2;i<=n;i++ )
        {
            num=0;
           for(j=2;j<i;j++)
             {
                 if(i % j == 0)
                    num++;
             }
           if(num!=0)
            System.out.println( +i);
           
        }
    }
public static void main(String args[])   
      {
	List_of_CompositeNumbers ob=new List_of_CompositeNumbers();
      }
}