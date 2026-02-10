import java.util.*;

public class Comp {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
    
    Comparator<Integer> ob=new Comparator<Integer>() {


        public int compare(Integer i,Integer j)
        {
            if(i%10 > j%10)
            {
                return 1;
            }else
            {
                return -1;
            }
        }
        
    };

    List<Integer> ok=new ArrayList<Integer>();
    ok.add(45);
    ok.add(78);
    ok.add(21);
    ok.add(90);
    ok.add(76);
    System.out.println("Orignal  List :"+ok);
    Collections.sort(ok,ob);
    System.out.println("Sorted List :"+ok);







    //Sorting by String lenght:
    Comparator<String>  lol=new Comparator<String>() {


        public int compare(String i,String j)
        {
            if(i.length() > j.length())
            {

                return 1;
            }else
                return -1;
        }
        
    };

    List<String> lo=new ArrayList<String>();
    lo.add("I");
    lo.add("Am");
    lo.add("Sahil");
    lo.add("Name");

    System.out.println("Original list :"+lo);
    Collections.sort(lo,lol);
    System.out.println("Sorted List   :"+lo);



    //Input and sort
    Comparator<Integer> oj=new Comparator<Integer>() {

        public int compare(Integer i,Integer j)
        {
            if(i/10 > j/10)
            {
                return 1;
            }else
            {
                return -1;
            }
        }
        
    };

    List<Integer>  onk=new ArrayList<>();


    for(int i=0;i<=3;i++)
    {
        int val=sc.nextInt();
        onk.add(val);
    }

    System.out.println("Original List :"+onk);
    Collections.sort(onk,oj);
    System.out.println("Sorted List   :"+onk);

    }
    
}
