@FunctionalInterface

interface a {


    int marks(int i,int j);
    public static void main(String[] args) {
    

        a ok=(int i,int j)->i+j;
    
        System.out.println(ok.marks(2,6));


    }
}
