public class test {
    public static void main(String[] args) {
    int b=12;
    int c=6;
    int j=0;

    try {
        j=b/c;
        if(j==0)
        throw new ArithmeticException("NOt allowed");
        else
        {
            System.out.println("The value of j is:"+j);
        }
        } catch (ArithmeticException e) {
            System.out.println("There is an exception "+e);
    }
    
    }
    
}
