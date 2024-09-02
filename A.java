class Student {
    int rollNo;
    String name;
    static String collegeName = "YCCE";
    Student(int r , String n){
        rollNo = r;
        name = n;
    }
    void show(){
        System.out.println(rollNo + " " +name +" "+collegeName);
    }
}

public class A {
    public static void main(String[] args){
        Student s1 = new Student(34, "pratiksha");
        System.out.println(Student.collegeName);
        s1.show();
        Student s2 = new Student(22, "jayant");
        s2.show();
    }
}

