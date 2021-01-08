import {EmployeeBuilder} from "./EmployeeBuilder.js";

let employee = new EmployeeBuilder()
	.setEmployeeFirstName("mohammad")
	.setEmployeeLastName("alsharif")
	.setEmployeeAge(24)
	.build()

console.log(employee)
