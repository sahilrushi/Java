package TCP;

import java.util.Scanner;

public class bell {

    private int D[];
    public static final int max=999;
    private int n;

    public bell(int n)
    {
        this.n=n;
        D=new int [n+1];
    }

    public void shortest(int s,int a[][])
    {
        for(int i=1;i<=n;i++)
        {
            D[i]=max;
        }
        D[s]=0;

        for(int k=1;k<=n-1;k++)
        {
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n;j++)
                {
                    if(a[i][j]!=max)
                    {
                        if(D[j]>D[i]+a[i][j])
                        {
                            D[j]=D[i]+a[i][j];
                        }
                    }
                }
            }
        }

        for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n;j++)
                {
                    if(a[i][j]!=max)
                    {
                        if(D[j]>D[i]+a[i][j])
                        {
                        System.out.println("The grapgh has a -ve node");
                        return;
                        }
                    }
                }
            }

            for(int i=1;i<=n;i++)
            {
                System.out.println("Distance from source "+s+ "To "+i+" is"+D[i]);
            }
    }

   

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        int n=0,s=0;
       
        System.out.println("Enter the number of node:");
        n=sc.nextInt();

         int a[][]=new int[n+1][n+1];


        System.out.println("Enter the weight matrix:");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                a[i][j]=sc.nextInt();

                if(i==j)
                {
                    a[i][j]=0;
                    continue;
                }

                if(a[i][j]==0)
                    a[i][j]=max;
                
            }
        }


        System.out.println("Enter the source vertex:");
        s=sc.nextInt();

        bell ob=new bell(n);
        ob.shortest(s, a);


 
    }
 

  
}
