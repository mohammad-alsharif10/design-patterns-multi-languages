import {Employee} from "./Employee.js";

export class EmployeeBuilder {
   employee = new Employee()
   
   setEmployeeFirstName(firstName) {
	  this.employee.firstName = firstName
	  return this;
   }
   
   setEmployeeLastName(lastName) {
	  this.employee.lastName = lastName
	  return this;
   }
   
   setEmployeeAge(age) {
	  this.employee.age = age
	  return this;
   }
   
   build() {
	  return this.employee;
   }
}

// module.exports = {
//    EmployeeBuilder
// }
