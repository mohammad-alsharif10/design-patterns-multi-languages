from src.builder.EmployeeBuilder import EmployeeBuilder

employee = EmployeeBuilder() \
    .set_employee_first_name("mohammad") \
    .set_employee_last_ame("alsharif") \
    .set_employee_age(24) \
    .build()

print(employee.firstName)
print(employee.lastName)
print(employee.age)
