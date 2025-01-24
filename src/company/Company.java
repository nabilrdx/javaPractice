package company;

import employee.Employee;

public class Company {
    public static void main(String[] args) {
        // Create 10 Employee objects
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        Employee emp4 = new Employee();
        Employee emp5 = new Employee();
        Employee emp6 = new Employee();
        Employee emp7 = new Employee();
        Employee emp8 = new Employee();
        Employee emp9 = new Employee();
        Employee emp10 = new Employee();

        // Set employee details (ID, age, department, experience, level, salary)
        emp1.setEmpId("E001");
        emp1.setAge(25);
        emp1.setDepartment("HR");
        emp1.setExperienceInYears(3);
        emp1.setLevel(2);
        emp1.setEmployeeSalary(5000);

        emp2.setEmpId("E002");
        emp2.setAge(28);
        emp2.setDepartment("Finance");
        emp2.setExperienceInYears(5);
        emp2.setLevel(3);
        emp2.setEmployeeSalary(6000);

        emp3.setEmpId("E003");
        emp3.setAge(30);
        emp3.setDepartment("Marketing");
        emp3.setExperienceInYears(7);
        emp3.setLevel(4);
        emp3.setEmployeeSalary(7000);

        emp4.setEmpId("E004");
        emp4.setAge(35);
        emp4.setDepartment("Sales");
        emp4.setExperienceInYears(10);
        emp4.setLevel(5);
        emp4.setEmployeeSalary(8000);

        emp5.setEmpId("E005");
        emp5.setAge(40);
        emp5.setDepartment("IT");
        emp5.setExperienceInYears(12);
        emp5.setLevel(6);
        emp5.setEmployeeSalary(9000);

        emp6.setEmpId("E006");
        emp6.setAge(26);
        emp6.setDepartment("HR");
        emp6.setExperienceInYears(2);
        emp6.setLevel(2);
        emp6.setEmployeeSalary(5000);

        emp7.setEmpId("E007");
        emp7.setAge(32);
        emp7.setDepartment("Finance");
        emp7.setExperienceInYears(6);
        emp7.setLevel(3);
        emp7.setEmployeeSalary(6000);

        emp8.setEmpId("E008");
        emp8.setAge(27);
        emp8.setDepartment("Marketing");
        emp8.setExperienceInYears(4);
        emp8.setLevel(3);
        emp8.setEmployeeSalary(6000);

        emp9.setEmpId("E009");
        emp9.setAge(33);
        emp9.setDepartment("Sales");
        emp9.setExperienceInYears(8);
        emp9.setLevel(4);
        emp9.setEmployeeSalary(7000);

        emp10.setEmpId("E010");
        emp10.setAge(29);
        emp10.setDepartment("IT");
        emp10.setExperienceInYears(5);
        emp10.setLevel(3);
        emp10.setEmployeeSalary(6000);

        int totalSalary = emp1.getSalary()+emp2.getSalary()+emp3.getSalary()+emp4.getSalary()+emp5.getSalary()+emp6.getSalary()+emp7.getSalary()+emp8.getSalary()+emp9.getSalary()+emp10.getSalary();
        
        // Print the total salary of all employees
        System.out.println("Total Salary of all Employees: " + totalSalary);
        System.out.println("--------------------------");
        System.out.println("All Employee details:::");
        System.out.println("--------------------------");

        Employee emp[] = {emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10};
        
        for(int i=0; i<emp.length; i++) {
        	emp[i].printEmpDetails();
        }
        
       
    }
    
 
}
