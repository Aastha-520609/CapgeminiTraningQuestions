public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 30, 50000);
        Employee emp2 = new Employee("Jane Smith", 25, 60000);

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();

        emp1.setName("Johnathan Doe");
        emp1.setAge(35);
        emp1.setSalary(55000);

        emp1.giveRaise(10);
        emp2.giveRaise(5);

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();

        emp1.setAge(70);
        emp2.setSalary(-5000);
    }
}
