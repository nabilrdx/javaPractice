package employee;

public class Employee {
    // Class level variables
    private String empId;
    private int age;
    private int salary;
    private String department;
    private int experienceInYears;
    private int level;

    // Getter and Setter methods
    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // Method to set salary based on the given formula
    public void setEmployeeSalary(int basicSalary) {
        this.salary = (this.level + this.experienceInYears + basicSalary) * 1000;
    }
    
    public void printEmpDetails() {
    	System.out.println("Employee ID: " + empId);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("Experience (years): " + experienceInYears);
        System.out.println("Level: " + level);
        System.out.println("-----------------------------");
    }
    
    
    
    public static void main(String[] args) {
    	System.out.println("Hi from employee class!");
    }
}
