public class Employee {

    private final String fullName;
    private int department;
    private int salary;
    private static int count;
    private final int id;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = ++count;

    }

    public String getFullName() {
        return this.fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object otherFullName) {
        if (this.getClass() != otherFullName.getClass()) {
            return false;
        }
        Employee employee = (Employee) otherFullName;
        return fullName.equals(employee.fullName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(fullName);
    }

    @Override
    public String toString() {
        return "id " + id + ". Сотрудник: " + fullName + ", отдел: " + department + ", зарплата: " + salary;
    }
}
