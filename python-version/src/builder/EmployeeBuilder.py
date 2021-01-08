from src.builder.Employee import Employee


class EmployeeBuilder:
    employee = Employee()

    def set_employee_first_name(self, first_name):
        self.employee.firstName = first_name
        return self

    def set_employee_last_ame(self, last_name):
        self.employee.lastName = last_name
        return self

    def set_employee_age(self, age):
        self.employee.age = age
        return self

    def build(self):
        return self.employee
