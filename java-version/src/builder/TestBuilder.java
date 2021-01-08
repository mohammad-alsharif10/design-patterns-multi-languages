package builder;

public class TestBuilder {

    public static void main(String[] args) {
        Employee employee = new EmployeeBuilder()
                .setFirstName("mohammad")
                .setLastName("alsharif")
                .setAge(24)
                .build();
        System.out.println(employee.toString());
    }
}
