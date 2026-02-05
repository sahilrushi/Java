
import java.util.Scanner;



public class check{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Message:");
        String mes=sc.nextLine().trim().replace(" ", "");
        System.out.println("Generator:");
        String gen=sc.nextLine().trim().replace(" ", "");


        int data[]=new  int[mes.length()+gen.length()-1];
        int div[]=new int[gen.length()];

        for(int i=0;i<mes.length();i++)
        {
            data[i]=Integer.parseInt(mes.charAt(i)+"");
        }
        for(int i=0;i<gen.length();i++)
        {
            div[i]=Integer.parseInt(gen.charAt(i)+"");
        }

        for(int i=0;i<mes.length();i++)
        {
            if(data[i]==1)
            {
                for(int j=0;j<div.length;j++)
                {
                    
                    data[i+j]^=div[j];

                }
            }
        }



        for(int i=0;i<mes.length();i++)
        {
            data[i]=Integer.parseInt(mes.charAt(i)+"");
        }

        System.out.println("The check sum code is:");


        for(int i=0;i<data.length;i++)
        {
            System.out.print(data[i]);
        }
        System.out.println();

        System.out.println("Enter the checksum:");
        mes=sc.nextLine();
        System.out.println("Generator");
        gen=sc.nextLine();


        data=new  int[mes.length()];
        div=new int[gen.length()];


        for(int i=0;i<mes.length();i++)
        {
            data[i]=Integer.parseInt(mes.charAt(i)+"");
        }
        for(int i=0;i<gen.length();i++)
        {
            div[i]=Integer.parseInt(gen.charAt(i)+"");
        }

        for(int i=0;i<mes.length();i++)
        {
            if(data[i]==1)
            {
                for(int j=0;j<div.length;j++)
                {
                    data[i+j]^=div[j];

                }
            }
        }


        boolean valid=true;
        


        for(int i=0;i<data.length;i++)
        {
            if(data[i]==1)
            {
                valid=false;
            }
        
        }


        if(valid==true)
        {
            System.out.println("Data stream is valid");
        }else
        {
            System.out.println("Data stream is not valid");
        }











     






    }
}