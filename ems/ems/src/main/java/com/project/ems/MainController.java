package com.project.ems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping(path = "/ems")
public class MainController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping(path = "/add")
    public @ResponseBody Employee addEmployee(
            @RequestParam String firstname,
            @RequestParam String lastname,
            @RequestParam String email,
            @RequestParam String phone,
            @RequestParam String department,
            @RequestParam String address,
            @RequestParam String maritalstatus,
            @RequestParam String gender,
            @RequestParam String nationality,
            @RequestParam String dateofbirth,
            @RequestParam String jobtitle,
            @RequestParam String dateofhire
    ) {
        Employee employee = new Employee();
        employee.setFirstname(firstname);
        employee.setLastname(lastname);
        employee.setEmail(email);
        employee.setPhone(phone);
        employee.setDepartment(department);
        employee.setAddress(address);
        employee.setMaritalstatus(maritalstatus);
        employee.setGender(gender);
        employee.setNationality(nationality);
        employee.setDateofbirth(dateofbirth);
        employee.setJobtitle(jobtitle);
        employee.setDateofhire(dateofhire);
        employeeRepository.save(employee);
        return employee;
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody Employee getEmployeeById(@PathVariable Integer id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        return employee.orElse(null);
    }

    @DeleteMapping(path ="/delete")
    public @ResponseBody Employee deleteEmployee(@RequestParam Integer id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent()) {
            employeeRepository.delete(employee.get());
            return employee.get();

        }
        return null;
    }


}

