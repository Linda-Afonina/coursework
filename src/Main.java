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
}