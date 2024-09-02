class Employee{
    int basicSalary;
}

class FullTimeEmployee extends Employee{
    int basicSalary = 10000;
    double incrementedSalary = 0.5*basicSalary + basicSalary;
    void display(){
        System.out.println("Salary information of Full Time Employee:");
        System.out.println("------------------------------------------");
        System.out.println("Basic salary is: "+basicSalary);
        System.out.println("Incremented salary is: "+ incrementedSalary);    
    }
}

class InternEmployee extends Employee{
    int basicSalary = 20000;
    double incrementedSalary = 0.25*basicSalary + basicSalary;
    void display(){
        System.out.println("Salary information of Intern Employee:");
        System.out.println("------------------------------------------");
        System.out.println("Basic salary is: "+basicSalary);
        System.out.println("Incremented salary is: "+ incrementedSalary);   
    }

}
class Test {
    public static void main(String[] args){
        FullTimeEmployee f1 = new FullTimeEmployee();
        f1.display();
        System.out.println();
        InternEmployee i1 = new InternEmployee();
        i1.display();

    }
}
