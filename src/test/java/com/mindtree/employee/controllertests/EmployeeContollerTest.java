//package com.mindtree.employee.controllertests;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.mindtree.employee.controller.EmployeeController;
//import com.mindtree.employee.dto.EmployeeDto;
//import com.mindtree.employee.service.EmployeeService;
//
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(value = EmployeeController.class)
//public class EmployeeContollerTest {
//
//
//    @InjectMocks
//    EmployeeController employeeController;
//    
//    @Mock
//    EmployeeService employeeService;
//    
//    @Autowired
//    private MockMvc mockMvc;
//    public static String asJsonString(final Object obj) {
//        try {
//            return new ObjectMapper().writeValueAsString(obj);
//        } catch (Exception e) {
//            throw new RuntimeException();
//        }
//    }
//    
//    @Test
//  	public void  addEmployeeTest() throws Exception {
//  		EmployeeDto employeeDto=new EmployeeDto();
//  		employeeDto.setDepartment("IT");
//  		employeeDto.setEmailId("devika@gmail.com");
//  		employeeDto.setEmploeeName("Devika");
//  		employeeDto.setEmployeeId(1);
//  		employeeDto.setSalary(12345);
//  		 Mockito.when(employeeService.addEmployee( employeeDto)).thenReturn( employeeDto);
//           mockMvc.perform(MockMvcRequestBuilders.post("/addEmployee").contentType(MediaType.APPLICATION_JSON)
//                   .content(asJsonString( employeeDto)).accept(MediaType.APPLICATION_JSON))
//                   .andExpect(MockMvcResultMatchers.status().isOk());
//  		
//  	}
//    
//    
//    @Test
//  	public void  getEmployeeByIdTest() throws Exception {
//  		EmployeeDto employeeDto=new EmployeeDto();
//  		employeeDto.setDepartment("IT");
//  		employeeDto.setEmailId("devika@gmail.com");
//  		employeeDto.setEmploeeName("Devika");
//  		employeeDto.setEmployeeId(1);
//  		employeeDto.setSalary(12345);
////  		List<EmployeeDto> employees=new ArrayList<EmployeeDto>();
////  		employees.add(employeeDto);
//  		 Mockito.when(employeeService.getEmployeeById( 1)).thenReturn( employeeDto);
//           mockMvc.perform(MockMvcRequestBuilders.get("/getEmployee/1").contentType(MediaType.APPLICATION_JSON)
//                   .content(asJsonString( employeeDto)).accept(MediaType.APPLICATION_JSON))
//                   .andExpect(MockMvcResultMatchers.status().isOk());
//  		
//  	}
//    
//
//    @Test
//  	public void  getEmployeesTest() throws Exception {
//  		EmployeeDto employeeDto=new EmployeeDto();
//  		employeeDto.setDepartment("IT");
//  		employeeDto.setEmailId("devika@gmail.com");
//  		employeeDto.setEmploeeName("Devika");
//  		employeeDto.setEmployeeId(1);
//  		employeeDto.setSalary(12345);
//  		List<EmployeeDto> employees=new ArrayList<EmployeeDto>();
//  		employees.add(employeeDto);
//  		 Mockito.when(employeeService.getAllEmployees()).thenReturn( employees);
//           mockMvc.perform(MockMvcRequestBuilders.get("/getEmployees").contentType(MediaType.APPLICATION_JSON)
//                   .content(asJsonString( employees)).accept(MediaType.APPLICATION_JSON))
//                   .andExpect(MockMvcResultMatchers.status().isOk());
//  		
//  	}
//    
//}
