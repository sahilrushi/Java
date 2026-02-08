

public class RunThread implements Runnable{

    public void run()
    {

    }
    public void run2()
    {

    }
    public static void main(String[] args) {
       

   
        Runnable ob=()->
        {
            for(int i=0;i<=5;i++)
            {
                System.out.println("Hi This is the first Thread......"+i);
                try
                {
                    Thread.sleep(3);
                }catch(InterruptedException k)
                {
                    System.out.println("There is an Error in thr first Thread.."+k);
                }
            }
        };

        Runnable obj=()->

        {
            for(int i=0;i<=5;i++)
            {
                System.out.println("Hello this is the second thread.."+i);
                try
                {
                    Thread.sleep(4);
                }catch(InterruptedException k)
                {
                    System.out.println("There is an error in second thread.."+k);
                }
            }
        };

        Thread t1=new Thread(ob);
        Thread t2=new Thread(obj);

        t1.start();
        t2.start();

        // System.out.println(t1);
        // System.out.println(t2);
        

    
}
}