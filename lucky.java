import java.util.Scanner;


public class lucky {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
    

    int n=0,buck_cap=4,buck_rem=0,rate=3,sent=0,recieve=0;
    int a[]=new int[20];

    System.out.println("The no of packets:");
    n=sc.nextInt();

    System.out.println("The size of packets:");
    for(int i=1;i<=n;i++)// start from 1
    {
        a[i]=sc.nextInt();
    }


    System.out.println("Clock\t\tPacket Sieze\t\tAccept\t\tSent\t\tRemainig Bucket");
    

    for(int i=0;i<=n;i++)
    {
        if(a[i]!=0)

            {
                if(buck_rem+a[i]>buck_cap)
                {
                    recieve=-1;
                }else
                {
                    recieve=a[i];
                    buck_rem +=a[i];

                }
            }

            if(buck_rem!=0)
            {
                if(buck_rem<rate)
                {
                    sent=buck_rem;
                    buck_rem=0;
                }else
                {
                    sent=rate;
                    buck_rem -=rate;
                }
            }else
            {
                sent=0;
            }


            if(recieve==-1)
            {
                System.out.println(i+"\t\t"+a[i]+"\t\t"+"Dropped"+"\t\t"+sent+"\t\t"+buck_rem+"\t\t");
            }else
            {
                System.out.println(i+"\t\t"+a[i]+"\t\t"+recieve+"\t\t"+sent+"\t\t"+buck_rem+"\t\t");
            }
    }
    
    

    
}
}