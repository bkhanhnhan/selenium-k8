package lab_08_EmployeeSalary;

import java.util.Arrays;
import java.util.List;

public class EmployeeController {

    public static void main(String[] args) {
        Employee fulltimeEmployee = new FulltimeEmployee();
        Employee fulltimeEmployee2 = new FulltimeEmployee();
        Employee fulltimeEmployee3 = new FulltimeEmployee();
        Employee contractEmployee = new ContractEmployee();
        Employee contractEmployee2 = new ContractEmployee();

        // Return employee’s salary
        System.out.println("Fulltime Employee's Salary is: " + fulltimeEmployee.getEmployeeSalary());
        System.out.println("Contract Employee's Salary is: " + contractEmployee.getEmployeeSalary());

        // Calculate Salary
        int totalSalary = new EmployeeController().calculatingSalary(Arrays.asList(fulltimeEmployee,fulltimeEmployee2,fulltimeEmployee3,contractEmployee,contractEmployee2));
        System.out.println("Total salary: " + totalSalary);
    }

    public int calculatingSalary(List<Employee> employeeList){
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary = totalSalary + employee.getEmployeeSalary();
        }
        return totalSalary;
    }
}
