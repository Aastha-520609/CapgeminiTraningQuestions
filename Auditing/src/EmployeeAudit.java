import java.util.ArrayList;

@FunctionalInterface
public interface EmployeeAudit {
     ArrayList<String> fetchEmployeeDetails(double Salary);  
}
