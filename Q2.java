public class Q2 {
    public static void main(String[] args) {
        ReassigningReference r1 = new ReassigningReference("Object1");
        ReassigningReference r2 = new ReassigningReference("Object2");
        r1 = r2;
        System.gc();
    }
}
class ReassigningReference{
    private String Objectname;
    ReassigningReference(String Objectname){
        this.Objectname = Objectname;
    }
    @Override
    protected void finalize() throws Throwable{
        System.out.println("Garbage Collector is succesfully called for "+Objectname);
    }
}