public class Q4 {
    public static void main(String[] args) {
        System.out.println(new AnonymousObject("Object1").displayName());
        System.gc();
    }
}
class AnonymousObject{
    private String Objectname;
    AnonymousObject(String Objectname){
        this.Objectname = Objectname;
    }
    String displayName(){
        return Objectname;
    }
    @Override
    protected void finalize() throws Throwable{
        System.out.println("garbage Collector is succesfully called for "+Objectname);
    }
}
