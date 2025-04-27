public class Q3 {
    public static void main(String[] args) {
        NullifiedRefrence n1 = new NullifiedRefrence("Object1");
        n1 = null;
        System.gc();
    }
}
class NullifiedRefrence {
    private String Objectname;
    NullifiedRefrence(String Objectname) {
        this.Objectname = Objectname;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector succesfully called for " + Objectname);
    }
}



//what is AnonymousObject??

//Student s1 = new Student("Kunal");
