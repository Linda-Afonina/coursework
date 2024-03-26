public class Main {
    public static void main(String[] args) {
        EmployeeBook employee = new EmployeeBook();

        employee.printListOfEmployees(employee.employee);
        EmployeeBook.printSeparator();
        System.out.print("Сумма затрат на ЗП в месяц: " + employee.calculateSumOfSalary(employee.employee) + " рублей.");
        System.out.println();
        System.out.print("Минимальная ЗП в месяц: " + employee.minSalary(employee.employee) + " рублей.");
        System.out.println();
        System.out.print("Максимальная ЗП в месяц: " + employee.maxSalary(employee.employee) + " рублей.");
        System.out.println();
        System.out.print("Средняя ЗП в месяц: " + employee.mediumSalary(employee.employee) + " рублей.");
        System.out.println();
        EmployeeBook.printSeparator();
        employee.printFullNameOfEmployees(employee.employee);
        EmployeeBook.printSeparator();
        employee.increaseSalary(employee.employee, 5);
        EmployeeBook.printSeparator();
        employee.minSalaryInDepartment(employee.employee, 4);
        employee.maxSalaryInDepartment(employee.employee, 4);
        employee.calculateSumOfSalaryInDepartment(employee.employee, 4);
        employee.mediumSalaryInDepartment(employee.employee, 4);
        EmployeeBook.printSeparator();
        employee.increaseSalaryInDepartment(employee.employee, 4, 3);
        EmployeeBook.printSeparator();
        employee.printEmployeesInDepartment(employee.employee, 4);
        EmployeeBook.printSeparator();
        employee.printSalaryLessParameter(employee.employee, 85000);
        EmployeeBook.printSeparator();
        employee.printSalaryMoreOrEquallyParameter(employee.employee, 85000);
        EmployeeBook.printSeparator();
        employee.addEmployee(employee.employee);
        employee.deleteEmployee(employee.employee, 81);
        employee.printListOfEmployees(employee.employee);
        employee.addEmployee(employee.employee);
        employee.findEmployee(employee.employee, 4);
    }


}