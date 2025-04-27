public class Q5 {
    public static void main(String[] args) {
      
       Runtime runtime = Runtime.getRuntime();
        
   
        System.out.println("Total memory before object creation: " + runtime.totalMemory());
        System.out.println("Free memory before object creation: " + runtime.freeMemory());

     
        DataHolder obj1 = new DataHolder();
        DataHolder obj2 = new DataHolder();

        
        obj1.initialize(10, 25.5);
        obj2.initialize(20, 50.5);

     
        obj1.updateInt(15);
        obj2.updateDouble(75.75);

      
        System.out.println("\nTotal memory after object creation: " + runtime.totalMemory());
        System.out.println("Free memory after object creation: " + runtime.freeMemory());

   
        obj1 = null;
        obj2 = null;

        //obj1 = obj2;

   
        System.gc();

        System.out.println("\nTotal memory after garbage collection: " + runtime.totalMemory());
        System.out.println("Free memory after garbage collection: " + runtime.freeMemory());
    }
}

class DataHolder {
    private int intValue;
    private double doubleValue;

    public void initialize(int intValue, double doubleValue) {
        this.intValue = intValue;
        this.doubleValue = doubleValue;
    }
    public void updateInt(int newValue) {
        this.intValue = newValue;
    }

    public void updateDouble(double newValue) {
        this.doubleValue = newValue;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector called for object with values: " + intValue + ", " + doubleValue);
    }
}
