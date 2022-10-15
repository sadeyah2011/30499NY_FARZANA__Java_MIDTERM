package company_app_design;

public interface Employee {

    /**
     * INSTRUCTIONS
     * <p>
     * Employee is an Interface which contains multiple unimplemented methods.
     * <p>
     * Read the methods and understand what they might be used for. What could be the requirements behind creating such
     * methods? Think about it, and then implement them in a concrete class.
     * <p>
     * You also need to add some additional methods to meet any additional business requirements of this application
     * <p>
     * Get creative - think like a dev
     */

    int employeeId();

    String employeeName();

    void assignDepartment();

    int calculateSalary();

    void benefits();
}