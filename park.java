public class park {

    public void show()
    {
        System.out.println("The wrong content");
    }
    public void make()
    {
        System.out.println("The second method content");
    }
    public static void main(String[] args) {

        
        
        park ob=new park()
        {
            public void show()
            {
                System.out.println("The modified content ");
            }
        };
        ob.show();

        new park()
        {
            public void make()
            {
                System.out.println("The ananomus object ");
            }
        }.make();
        
        

        
        






        

    }
    
}