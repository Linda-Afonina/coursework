public class EmployeeBook {

    private final Employee[] employee = new Employee[10];

    {
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
    }

    public void printListOfEmployees() {
        System.out.println("Список сотрудников:");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            System.out.println(employee[i]);
        }
    }

    public int calculateSumOfSalary() {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            sum = sum + employee[i].getSalary();
        }
        return sum;
    }

    public int minSalary() {
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

    public int maxSalary() {
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

    public double mediumSalary() {
        return (double) calculateSumOfSalary() / employee.length;
    }

    public void printFullNameOfEmployees() {
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

    public void increaseSalary(int percent) {
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

    public void minSalaryInDepartment(int department) {
        int minSalaryInDepartment = maxSalary();
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

    public void maxSalaryInDepartment(int department) {
        int maxSalaryInDepartment = minSalary();
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

    public void calculateSumOfSalaryInDepartment(int department) {
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

    public void mediumSalaryInDepartment(int department) {
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

    public void increaseSalaryInDepartment(int department, int percent) {
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

    public void printEmployeesInDepartment(int department) {
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

    public void printSalaryLessParameter(int parameter) {
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

    public void printSalaryMoreOrEquallyParameter(int parameter) {
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

    public void addEmployee() {
        int count = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                employee[i] = new Employee("Москвин Павел Юрьевич", 1, 92790);
                System.out.println("Сотрудник успешно добавлен.");
                break;
            }
            if (employee[i] != null) {
                ++count;
            }
            if (count == employee.length) {
                System.out.println("Нельзя добавить сотрудника, штат полный.");
            }
        }
    }

    public void deleteEmployee(int ID) {
        int count = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getId() == ID) {
                employee[i] = null;
                System.out.println("Сотрудник с ID " + ID + " удален.");
                break;
            }
            if (employee[i] != null) {
                ++count;
            }
            if (count == employee.length) {
                System.out.println("Неверный ID.");
            }
        }
    }

    public void findEmployee(int ID) {
        String name = "";
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (employee[i].getId() == ID) {
                name = employee[i].getFullName();
            }
        }
        System.out.println("Сотрудник с номером ID " + ID + " - " + name + ".");
    }
}
