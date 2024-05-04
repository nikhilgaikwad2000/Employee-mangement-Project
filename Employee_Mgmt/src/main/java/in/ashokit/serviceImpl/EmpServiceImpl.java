package in.ashokit.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.Binding.EmployeeDetails;
import in.ashokit.Binding.kidDetails;
import in.ashokit.entity.EmpEntity;
import in.ashokit.entity.kidEntity;
import in.ashokit.repo.EmpRepo;
import in.ashokit.repo.kidRepo;
import in.ashokit.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpRepo empRepo;
	@Autowired
	private kidRepo kidRepo;

	@Override
	public String SaveEmp(EmployeeDetails employeeDetails) {

		EmpEntity entity = new EmpEntity();
		BeanUtils.copyProperties(employeeDetails, entity);
		empRepo.save(entity);

		return "Employee Details Save Successfully......";
	}

	@Override
	public String updateEmp(EmpEntity empEntity) {
		if (empRepo.existsById(empEntity.getEmpId())) {
			empRepo.save(empEntity);
			return "Employee Record Update Successfully";
		}
		return "Employee Record Not Found..!!!";
	}

	@Override
	public List<EmpEntity> readEmp() {
		List<EmpEntity> EmployeeData = empRepo.findAll();
		return EmployeeData;
	}

	@Override
	public String deleteEmp(Integer empId) {
		if(empRepo.existsById(empId)) {
		  empRepo.deleteById(empId);
		  return"Employee Deleted Successfully";
		}
		return "Employee Data Not Found..!!!";
	}

	@Override
	public String saveKidData(kidDetails kidDetails) {
		kidEntity entity=new kidEntity();
		BeanUtils.copyProperties(kidDetails, entity);
		kidRepo.save(entity);
		return "";
	}

	@Override
	public List<kidEntity> readKid() {
		List<kidEntity> kiddata = kidRepo.findAll();
		return null;
	}

}
