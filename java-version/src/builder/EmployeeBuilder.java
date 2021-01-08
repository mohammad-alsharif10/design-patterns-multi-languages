package builder;

public class EmployeeBuilder {

    private final Employee employee = new Employee();

    public EmployeeBuilder setFirstName(String firstName) {
        this.employee.setFirstName(firstName);
        return this;
    }

    public EmployeeBuilder setLastName(String lastName) {
        this.employee.setLastName(lastName);
        return this;
    }

    public EmployeeBuilder setAge(Integer age) {
        this.employee.setAge(age);
        return this;
    }

    public Employee build() {
        return this.employee;
    }
}
