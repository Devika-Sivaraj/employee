//package com.mindtree.employee.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.mindtree.employee.apiconfiguration.ApiResponse;
//import com.mindtree.employee.dto.EmployeeDto;
//import com.mindtree.employee.exception.service.ServiceException;
//import com.mindtree.employee.service.EmployeeService;
//
//@RestController
//public class EmployeeController {
//
//	/**
//	 * addEmployee, Method used to Add Employee
//	 * @param employeeDto,
//	 * @return employeeDto,
//	 * @throws ServiceException
//	 */
//	@Autowired
//	EmployeeService employeeService;
//	
//	@PostMapping("/addEmployee")
//	public ResponseEntity<ApiResponse> addEmployee(@RequestBody EmployeeDto employeeDto) throws ServiceException {
//		return ResponseEntity.status(HttpStatus.OK)
//				.body(new ApiResponse("Employee added successfully", "ok", 200,employeeService.addEmployee(employeeDto), true, false));
//
//	}
//	@GetMapping("/getEmployee/{employeeId}")
//	public ResponseEntity<ApiResponse> getEmployeeById(@PathVariable ("employeeId") int employeeId) throws ServiceException {
//		return ResponseEntity.status(HttpStatus.OK)
//				.body(new ApiResponse("Employee Retrived successfully", "ok", 200,employeeService.getEmployeeById(employeeId), true, false));
//
//	}
//	@GetMapping("/getEmployees")
//	public ResponseEntity<ApiResponse> getAllEmployees() throws ServiceException {
//		return ResponseEntity.status(HttpStatus.OK)
//				.body(new ApiResponse("Returned All Employees successfully", "ok", 200,employeeService.getAllEmployees(), true, false));
//
//	}
//	@DeleteMapping("/deleteEmployee")
//	public ResponseEntity<ApiResponse> deleteEmployeeById(@PathVariable ("employeeId") int employeeId) throws ServiceException {
//		return ResponseEntity.status(HttpStatus.OK)
//				.body(new ApiResponse("Returned All Employees successfully", "ok", 200,employeeService.deleteEmployeeById(employeeId), true, false));
//
//	}
//
//}
