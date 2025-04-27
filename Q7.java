class Student {
    private String name;
    private int rollNumber;
    private String course;

    public Student(String name, int rollNumber, String course) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
    }

    @Override
    protected void finalize() {
        System.out.println("Student object with roll number " + rollNumber + " is garbage collected.");
    }
}

public class Q7 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        System.out.println("Before creating students:");
        System.out.println("Total Memory: " + runtime.totalMemory());
        System.out.println("Free Memory: " + runtime.freeMemory());

        Student s1 = new Student("Alice", 101, "Computer Science");
        Student s2 = new Student("Bob", 102, "Mechanical Engineering");

        System.out.println("\nAfter creating students:");
        System.out.println("Total Memory: " + runtime.totalMemory());
        System.out.println("Free Memory: " + runtime.freeMemory());

        s1 = null;
        s2 = null;

        System.gc(); // Request garbage collection

        System.out.println("\nAfter requesting garbage collection:");
        System.out.println("Total Memory: " + runtime.totalMemory());
        System.out.println("Free Memory: " + runtime.freeMemory());
    }
}