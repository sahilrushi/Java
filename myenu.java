enum myenu {


    DD(23),
    DSA(78),
    JAVA(89),
    OS(67);

    private int  marks;

    myenu(int marks)
    {
        this.marks=marks;
    }
    


    public int getMarks() {
        return marks;
    }



    public void setMarks(int marks) {
        this.marks = marks;
    }


    public void show()
    {
        System.out.println("The marks of "+this.name()+" is "+marks);
    }


    public static void main(String[] args) {
        


       for(myenu k:myenu.values())
       {
        System.out.println(k+" marks ="+k.getMarks());
       }
    
       myenu.JAVA.show();
       
        
        
    
    }
}