public class Employee {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String status;
    private int salary;
    private int experience;

    public Employee(String id, String firstName, String lastName, String email, String gender, String status, int salary, int experience) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.status = status;
        this.salary = salary;
        this.experience = experience;
    }

    // Getter method for id
    public String getId() {
        return id;
    }

    // Setter method for id
    public void setId(String id) {
        this.id = id;
    }

    // Getter method for firstName
    public String getFirstName() {
        return firstName;
    }

    // Setter method for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter method for lastName
    public String getLastName() {
        return lastName;
    }

    // Setter method for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter method for email
    public String getEmail() {
        return email;
    }

    // Setter method for email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter method for gender
    public String getGender() {
        return gender;
    }

    // Setter method for gender
    public void setGender(String gender) {
        this.gender = gender;
    }

    // Getter method for status
    public String getStatus() {
        return status;
    }

    // Setter method for status
    public void setStatus(String status) {
        this.status = status;
    }

    // Getter method for salary
    public int getSalary() {
        return salary;
    }

    // Setter method for salary
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Getter method for experience
    public int getExperience() {
        return experience;
    }

    // Setter method for experience
    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", status='" + status + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }
}
