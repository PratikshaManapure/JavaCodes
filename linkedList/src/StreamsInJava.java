import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class StreamsInJava {
    public static void main(String[] args) {

        List<Employee> empList = getEmpList();
        System.out.println("Filter the employees list with gender as Female: ");
        empList.stream().filter(e -> e.getGender().equals("Female")).forEach(e -> System.out.println(e.getFirstName()));

        System.out.println("Filter the employees list with newJoiner as True: ");
        empList.stream().filter(e -> e.getGender().equals("Female")).forEach(e -> System.out.println(e.getFirstName()));

        boolean isSalary = empList.stream()
                .allMatch(e -> e.getSalary() > 1000);
        System.out.println("Employees with salary greater than 1000 are present or not: "+isSalary);

        System.out.println("Employee with max salary: ");
        empList.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .ifPresent(System.out::println);

        System.out.println("Employee who have no experienct");
    }
    public static List<Employee> getEmpList(){
        return Arrays.asList(
                new Employee("21071270","Pratiksha","Manapure","pratikshamanapure@gmail.com","Female","True",101146,0),
                new Employee("73-274-6476","Raj","Frudd","kfrudd1@ovh.net","Male","FALSE",29310,2),
                new Employee("85-939-9584","Rutika","Gumb","agumb2@twitter.com","Female","FALSE",62291,4),
                new Employee("08-180-8292","Robin","Batterham","rbatterham3@last.fm","Male","FALSE",142439,4),
                new Employee("21-825-2623","Jayant","Burrel","uburrel4@google.ru","Male","FALSE",128764,5),
                new Employee("66-708-5539","Aayushi","Ridding","Ridding","Female","FALSE",152924,4),
                new Employee("81-697-2363","Joete","Braybrooke","jbraybrooke6@prnewswire.com","Male","TRUE",128907,0),
                new Employee("63-019-1110","Elroy","Baverstock","ebaverstock7@ehow.com","Male","TRUE",2510,0)
        );
    }
}