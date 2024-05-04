package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.Binding.EmployeeDetails;
import in.ashokit.Binding.kidDetails;
import in.ashokit.entity.EmpEntity;
import in.ashokit.entity.kidEntity;
import in.ashokit.repo.kidRepo;
import in.ashokit.service.EmpService;

@RestController
public class EmpController {

	@Autowired
	private EmpService empService;

	@PostMapping("/saveEmp")
	public ResponseEntity<String> saveEmp(@RequestBody EmployeeDetails employeeDetails) {
		String status = empService.SaveEmp(employeeDetails);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}

	@PutMapping("/updateEmp")
	public ResponseEntity<String> updateEmp(@RequestBody EmpEntity empEntity) {
		String status = empService.updateEmp(empEntity);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}

	@GetMapping("/readEmp")
	public ResponseEntity<List<EmpEntity>> getAllEmp() {
		List<EmpEntity> status = empService.readEmp();
		return new ResponseEntity<>(status, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<String> deleteEmp(@PathVariable Integer empId) {
		String status = empService.deleteEmp(empId);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}

	@PostMapping("/saveKid")
	public ResponseEntity<String> saveKid(@RequestBody kidDetails kidDetails) {
		String kidData = empService.saveKidData(kidDetails);
		return new ResponseEntity<>(kidData, HttpStatus.OK);

	}

	@GetMapping("/readkid")
	public ResponseEntity<List<kidEntity>> getAllKid() {

		List<kidEntity> kid = empService.readKid();
		return new ResponseEntity<>(kid, HttpStatus.OK);

	}

}
