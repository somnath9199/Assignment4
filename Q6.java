import java.util.ArrayList;
import java.util.Date;

public class Q6 {
    public static void main(String[] args) {
      Runtime runtime = Runtime.getRuntime();
      System.out.println("before Object creation "+runtime);
      ArrayList<MemoryintensiveObject> list = new ArrayList<>();
      for(int i = 0 ; i<1000000;i++){
        list.add(new MemoryintensiveObject(i));
      }
      System.out.println("After Object creation "+ runtime);
      getheapmemorydetails(runtime);
    
    }
    private static void getheapmemorydetails(Runtime runtime){
        System.out.println("[" + new Date() + "] " );
        System.out.println("Total Heap Memory "+ Runtime.getRuntime().totalMemory());
        System.out.println("TOtal Free Memory "+ Runtime.getRuntime().freeMemory());
    }
}
class MemoryintensiveObject{
    private int id;
    private double[] largeArray;

    MemoryintensiveObject(int id){
     this.id = id;
    }
    @Override
    protected void finalize() throws Throwable{
        System.out.println("Garbage Collector : object with Id "+id);
    }
}