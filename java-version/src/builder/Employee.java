package builder;

public class Employee {
    private String firstName;
    private String lastName;
    private Integer age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Employee{")
                .append("firstName='")
                .append(firstName)
                .append('\'')
                .append(", lastName='")
                .append(lastName)
                .append('\'')
                .append(", age=")
                .append(age)
                .append('}').toString();
    }
}
