import java.util.Scanner;



public class rs {

    static int gcd(int m,int n)
    {
        while(n!=0)
        {
            int r=m%n;
            m=n;
            n=r;
        }
        return m;
    }

   
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=0,p=0,q=0,e=0,d=0,phi=0;
        int nums[]=new int[100];
        int enc[]=new int [100];
        int dec[]=new int [100];

        String mes;
        int nef;

        System.out.println("The message:");
        mes=sc.nextLine();
        System.out.println("p and q:");
        p=sc.nextInt();
        q=sc.nextInt();


        n=p*q;
        phi=(q-1)*(p-1);

        for(int i=2;i<phi;i++)//always 2 and phi
        {
            if(gcd(i,phi)==1)
            {
                e=i;
                break;
            }
        }
        for(int i=2;i<phi;i++)
        {
            if((e*i-1)%phi==0)
            {
                d=i;
                break;

            }
        }


        for(int i=0;i<mes.length();i++)
        {
            char c=mes.charAt(i);
            nums[i]=c-96;
        }
        nef=mes.length();


        for(int i=0;i<nef;i++)
        {
            enc[i]=1;
            for(int j=0;j<e;j++)
            {
                enc[i]=(enc[i]*nums[i])%n;

            }

            
        }
        System.out.println("Encryption:");
        for(int i=0;i<nef;i++)
        {
            System.out.println(enc[i]+""+(char)(enc[i]+96));
        }



        for(int i=0;i<nef;i++)
        {
            dec[i]=1;
            for(int j=0;j<d;j++)
            {
                dec[i]=(dec[i]*enc[i])%n;

            }

            
        }
        System.out.println("Decryption:");
        for(int i=0;i<nef;i++)
        {
            System.out.print((char)(dec[i]+96));
        }
        System.out.println();
        




        

    }
}
