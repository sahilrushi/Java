public class dog implements cat {


    public void make()
   {
    System.out.println("The interface methd");
   }

   public void learn()
   {
    System.out.println("The inherited second method");
   }

   public static void main(String[] args) {
    

    int nums=90;

    nums=9;

    new dog().make();
    new dog().learn();
    System.out.println(nums);
   }

}
