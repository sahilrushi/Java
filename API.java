import java.util.*;
public class API  {

    public static void main(String[] args){


        
        Collection nums=new ArrayList<>();
        nums.add(56);
        nums.add(89);
        nums.add("Sahil");
        System.out.println(nums);

        Collection<Integer> nums2=new ArrayList<>();
        nums2.add(78);
        nums2.add(23);
        nums2.add(45);
        System.out.println(nums2);
        nums2.add(89);


        Collection<String>  mun=new ArrayList<>();
        mun.add("kol");
        mun.add("Gun");
        System.out.println(mun);


        List<Integer> num=new ArrayList<>();
        num.add(90);
        num.add(3);
        num.add(35);
        num.add(12);
        System.out.println(num);

        Set<Integer> nums3=new HashSet<>();
        nums3.add(45);
        nums3.add(41);
        nums3.add(41);
        System.out.println(nums3.size()); 


        Set<String> st=new TreeSet<>();
        st.add("Srp");
        st.add("Val");
        st.add("Naruto");
        st.add("Srp");
        System.out.println(st);


    // //To find the next value
        Iterator<Integer> val=nums2.iterator();

        for(int i:nums2)
        {
            System.out.println(val.next());
        }


    //     //Maps:

        Map<String,Integer> ob=new Hashtable();
        ob.put("DSA",78);
        ob.put("DD", 56);
        ob.put("OS", 89);
        ob.put("Java", 90);
        System.out.println(ob);

        for(String key:ob.keySet())
        {
            System.out.println(key+":"+ob.get(key));
        }


    //Input and sort

    Scanner sc=new Scanner(System.in);



    List<Integer> val2=new ArrayList<>();

    for(int i=0;i<=4;i++)
    {
        int numm=sc.nextInt();
        val2.add(numm);
    }

    Collections.sort(val2);
    System.out.println(val);



    



    

    

        
    

        

    

    }
    
}
