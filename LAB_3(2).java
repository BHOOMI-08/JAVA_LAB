class Student {
    int id;
    String name;
    int age;
    Student() {
        this(20, "Bhoomi", 19);
        System.out.println("Inside 0-args constructor");
    }
    Student(int i) {
        id = i;
        name = "NULL";
        age = 0;
        System.out.println("Inside 1-arg constructor");
    }
    Student(int i, String n) {
        this(i);
        name = n; 
        System.out.println("Inside 2-args constructor");
    }
    Student(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
        System.out.println("Inside 3-args constructor");
    }
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }
    public static void main(String[] args) {
        System.out.println("Creating s1 using 0-arg constructor:");
        Student s1 = new Student();        
        s1.display();
        System.out.println("\nCreating s2 using 2-arg constructor:");
        Student s2 = new Student(102, "Rahul");       
        s2.display();
        System.out.println("\nCreating s3 using 3-arg constructor:");
        Student s3 = new Student(103, "Aman", 20);    
        s3.display();
    }
}
