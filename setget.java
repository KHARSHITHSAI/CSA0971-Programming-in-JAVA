class Employee {
    private String employeeName;
    private String department;
    private double salary;

    // Constructor
    public Employee(String employeeName, String department, double salary) {
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
    }

    // Setter methods
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter methods
    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    // Display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        // Create an employee object
        Employee employee = new Employee("John Doe", "IT", 50000.0);

        // Display employee details using getter methods
        System.out.println("Employee Details:");
        System.out.println("================");
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Salary: $" + employee.getSalary());

        // Update employee details using setter methods
        employee.setSalary(55000.0);
        employee.setDepartment("HR");

        // Display updated employee details
        System.out.println("\nUpdated Employee Details:");
        System.out.println("========================");
        employee.displayDetails();
    }
}
