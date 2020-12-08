//package com.mindtree.employee.service.impl;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.mindtree.employee.dto.EmployeeDto;
//import com.mindtree.employee.entity.Employee;
//import com.mindtree.employee.exception.service.EmployeeNotFoundException;
//import com.mindtree.employee.exception.service.ServiceException;
//import com.mindtree.employee.repository.EmployeeRepository;
//import com.mindtree.employee.service.EmployeeService;
//
//@Service
//public class EmployeeServiceImpl implements EmployeeService {
//
//	@Autowired
//	EmployeeRepository employeeRepository;
//	
//	ModelMapper modelMapper=new ModelMapper();
//	
//	@Override
//	public EmployeeDto addEmployee(EmployeeDto employeeDto) {
//		Employee employee=modelMapper.map(employeeDto,Employee.class);
//		employeeRepository.save(employee);
//		return modelMapper.map(employee,EmployeeDto.class);
//	}
//	
//	@Override
//	public EmployeeDto getEmployeeById(int employeeId) throws ServiceException {
//
//		Employee employee=employeeRepository.findById(employeeId)
//				.orElseThrow(() -> new EmployeeNotFoundException("There is No such user found "));
//
//		return  modelMapper.map(employee,EmployeeDto.class);
//	}
//
//	@Override
//	public List<EmployeeDto> getAllEmployees() {
//		List<Employee> employees=employeeRepository.findAll();
//		return employees.stream().map(e -> modelMapper.map(e,EmployeeDto.class)).collect(Collectors.toList());
//	}
//
//	@Override
//	public EmployeeDto deleteEmployeeById(int employeeId) throws ServiceException {
//
//		Employee employee=employeeRepository.findById(employeeId)
//				.orElseThrow(() -> new EmployeeNotFoundException("There is No such user found "));
//		employeeRepository.deleteById(employeeId);
//		return modelMapper.map(employee,EmployeeDto.class);
//	}
//
//	
//}
