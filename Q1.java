public class Q1{
    public static void main(String args[]){
      UnreachableObject u1 = new UnreachableObject("Object1");
      u1.show();
      System.gc();
    }
}
class UnreachableObject{
    private String objectname;

    UnreachableObject(String objectname){
        this.objectname = objectname;
    }
    void show(){
        display();
    }
    void display(){
        System.out.println("Object is "+ objectname);
    }
    @Override
    protected void finalize() throws Throwable{
        System.out.println("Garbage collector Suceessfully called for "+ objectname);
    }
}