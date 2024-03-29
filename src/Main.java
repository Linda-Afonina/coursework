public class Main {
    public static void main(String[] args) {
        EmployeeBook employee = new EmployeeBook();

        employee.printListOfEmployees();
        EmployeeBook.printSeparator();
        System.out.print("Сумма затрат на ЗП в месяц: " + employee.calculateSumOfSalary() + " рублей.");
        System.out.println();
        System.out.print("Минимальная ЗП в месяц: " + employee.minSalary() + " рублей.");
        System.out.println();
        System.out.print("Максимальная ЗП в месяц: " + employee.maxSalary() + " рублей.");
        System.out.println();
        System.out.print("Средняя ЗП в месяц: " + employee.mediumSalary() + " рублей.");
        System.out.println();
        EmployeeBook.printSeparator();
        employee.printFullNameOfEmployees();
        EmployeeBook.printSeparator();
        employee.increaseSalary(5);
        EmployeeBook.printSeparator();
        employee.minSalaryInDepartment(4);
        employee.maxSalaryInDepartment(4);
        employee.calculateSumOfSalaryInDepartment(4);
        employee.mediumSalaryInDepartment(4);
        EmployeeBook.printSeparator();
        employee.increaseSalaryInDepartment(4, 3);
        EmployeeBook.printSeparator();
        employee.printEmployeesInDepartment(4);
        EmployeeBook.printSeparator();
        employee.printSalaryLessParameter(85000);
        EmployeeBook.printSeparator();
        employee.printSalaryMoreOrEquallyParameter(85000);
        EmployeeBook.printSeparator();
        System.out.println(employee.addEmployee("Москвин Павел Юрьевич", 1, 92570));
        employee.deleteEmployee(8);
        System.out.println(employee.addEmployee("Москвин Павел Юрьевич", 1, 92570));
        employee.findEmployee(4);
        EmployeeBook.printSeparator();
        employee.printListOfEmployees();
    }
}