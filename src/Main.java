import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Новикова Елена Геннадьевна", 1, 108940);
        employee[1] = new Employee("Голиков Сергей Иванович", 3, 67520);
        employee[2] = new Employee("Кондратьев Олег Петрович", 2, 95080);
        employee[3] = new Employee("Соколова Инна Ивановна", 5, 72670);
        employee[4] = new Employee("Петров Алексей Владимирович", 4, 85880);
        employee[5] = new Employee("Григорьев Кирилл Александрович", 3, 64230);
        employee[6] = new Employee("Нестерова Ольга Михайловна", 2, 89950);
        employee[7] = new Employee("Меньшов Кирилл Александрович", 4, 101570);
        employee[8] = new Employee("Меньшова Наталья Юрьевна", 4, 72290);
        employee[9] = new Employee("Королькова Светлана Николаевна", 5, 96440);

        printListOfEmployees(employee);
        printSeparator();
        System.out.print("Сумма затрат на ЗП в месяц: " + calculateSumOfSalary(employee) + " рублей.");
        System.out.println();
        System.out.print("Минимальная ЗП в месяц: " + minSalary(employee) + " рублей.");
        System.out.println();
        System.out.print("Максимальная ЗП в месяц: " + maxSalary(employee) + " рублей.");
        System.out.println();
        System.out.print("Средняя ЗП в месяц: " + mediumSalary(employee) + " рублей.");
        System.out.println();
        printSeparator();
        printFullNameOfEmployees(employee);
        printSeparator();
        increaseSalary(employee, 5);
        printSeparator();
        minSalaryInDepartment(employee, 4);
        maxSalaryInDepartment(employee, 4);
        calculateSumOfSalaryInDepartment(employee, 4);
        mediumSalaryInDepartment(employee, 4);
        printSeparator();
        increaseSalaryInDepartment(employee, 4, 3);
        printSeparator();
        printEmployeesInDepartment(employee, 4);
        printSeparator();
        printSalaryLessParameter(employee, 85000);
        printSeparator();
        printSalaryMoreOrEquallyParameter(employee, 85000);
    }

    public static void printListOfEmployees(Employee[] employee) {
        System.out.println("Список сотрудников:");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            System.out.println(employee[i]);
        }
    }

    public static int calculateSumOfSalary(Employee[] employee) {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            sum = sum + employee[i].getSalary();
        }
        return sum;
    }

    public static int minSalary(Employee[] employee) {
        int minSalary = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (employee[i].getSalary() < minSalary) {
                minSalary = employee[i].getSalary();
            }
        }
        return minSalary;
    }

    public static int maxSalary(Employee[] employee) {
        int maxSalary = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (employee[i].getSalary() > maxSalary) {
                maxSalary = employee[i].getSalary();
            }
        }
        return maxSalary;
    }

    public static double mediumSalary(Employee[] employee) {
        return (double) calculateSumOfSalary(employee) / employee.length;
    }

    public static void printFullNameOfEmployees(Employee[] employee) {
        System.out.println("ФИО всех сотрудников: ");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            System.out.println(employee[i].getFullName());
        }
    }

    public static void printSeparator() {
        System.out.println("=========================");
    }

    public static void increaseSalary(Employee[] employee, int percent) {
        double increaseSalary;
        double increasePercent = (double) percent / 100;
        System.out.println("ЗП сотрудников после индексации на " + percent + "%:");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            increaseSalary = employee[i].getSalary() + employee[i].getSalary() * increasePercent;
            System.out.println(employee[i].getFullName() + " - " + increaseSalary + " рублей.");
        }
    }

    public static void minSalaryInDepartment(Employee[] employee, int department) {
        int minSalaryInDepartment = maxSalary(employee);
        String name = employee[0].getFullName();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (employee[i].getDepartment() == department && employee[i].getSalary() < minSalaryInDepartment) {
                minSalaryInDepartment = employee[i].getSalary();
                name = employee[i].getFullName();
            }
        }
        System.out.println("Сотрудник с минимальной ЗП в " + department + " отделе - " + name + ", ЗП - "
                + minSalaryInDepartment + " рублей");
    }

    public static void maxSalaryInDepartment(Employee[] employee, int department) {
        int maxSalaryInDepartment = minSalary(employee);
        String name = employee[0].getFullName();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (employee[i].getDepartment() == department && employee[i].getSalary() > maxSalaryInDepartment) {
                maxSalaryInDepartment = employee[i].getSalary();
                name = employee[i].getFullName();
            }
        }
        System.out.println("Сотрудник с максимальной ЗП в " + department + " отделе - " + name + ", ЗП - "
                + maxSalaryInDepartment + " рублей");
    }

    public static void calculateSumOfSalaryInDepartment(Employee[] employee, int department) {
        int sumInDepartment = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (employee[i].getDepartment() == department) {
                sumInDepartment = sumInDepartment + employee[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на ЗП по " + department + " отделу: " + sumInDepartment + " рублей.");
    }

    public static void mediumSalaryInDepartment(Employee[] employee, int department) {
        double mediumSalary;
        int sumInDepartment = 0;
        int count = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (employee[i].getDepartment() == department) {
                sumInDepartment = sumInDepartment + employee[i].getSalary();
                ++count;
            }
        }
        mediumSalary = (double) sumInDepartment / count;
        System.out.println("Средняя ЗП по " + department + "-му отделу: " + mediumSalary + " рублей.");
    }

    public static void increaseSalaryInDepartment(Employee[] employee, int department, int percent) {
        double increaseSalary;
        double increasePercent = (double) percent / 100;
        String name;
        System.out.println("ЗП сотрудников " + department + "-го отдела после индексации на " + percent + "%:");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (employee[i].getDepartment() == department) {
                increaseSalary = employee[i].getSalary() + employee[i].getSalary() * increasePercent;
                name = employee[i].getFullName();
                System.out.println(name + " - " + increaseSalary + " рублей.");
            }
        }
    }

    public static void printEmployeesInDepartment(Employee[] employee, int department) {
        System.out.println("Список сотрудников " + department + " отдела:");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (employee[i].getDepartment() == department) {
                System.out.println("ID " + employee[i].getId() + ", " + employee[i].getFullName() +
                        ", ЗП - " + employee[i].getSalary() + " рублей.");
            }
        }
    }

    public static void printSalaryLessParameter(Employee[] employee, int parameter) {
        System.out.println("Список сотрудников с ЗП ниже " + parameter + " рублей:");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (employee[i].getSalary() < parameter) {
                System.out.println("ID " + employee[i].getId() + ", " + employee[i].getFullName() +
                        ", ЗП - " + employee[i].getSalary() + " рублей.");
            }
        }
    }

    public static void printSalaryMoreOrEquallyParameter(Employee[] employee, int parameter) {
        System.out.println("Список сотрудников с ЗП выше " + parameter + " рублей:");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (employee[i].getSalary() >= parameter) {
                System.out.println("ID " + employee[i].getId() + ", " + employee[i].getFullName() +
                        ", ЗП - " + employee[i].getSalary() + " рублей.");
            }
        }
    }
}