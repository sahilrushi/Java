import java.io.IOException;

public class Syncro{

    int count;
    public  synchronized void run()
    {

        count++;
        
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        

        Syncro k=new Syncro();
        
        Runnable ob=()->
        {
            for(int i=0;i<1000;i++)
            {
                System.out.println("First Thread..");
                k.run();
            }
        };
        Runnable obj=()->
        {
            for(int i=0;i<1000;i++)
            {
                System.out.println("Second Thread..");
                k.run();
            }
        };

        Thread t1=new Thread(ob);
        Thread t2=new Thread(obj);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(k.count);





    }
    
}
