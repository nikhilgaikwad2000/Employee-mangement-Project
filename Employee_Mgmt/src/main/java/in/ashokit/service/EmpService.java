package in.ashokit.service;

import java.util.List;

import in.ashokit.Binding.EmployeeDetails;
import in.ashokit.Binding.kidDetails;
import in.ashokit.entity.EmpEntity;
import in.ashokit.entity.kidEntity;

public interface EmpService {
  public String SaveEmp(EmployeeDetails employeeDetails);
  
  public String updateEmp(EmpEntity empEntity);
  
  public List<EmpEntity> readEmp();
  
  public String deleteEmp(Integer empID);
  

  public String saveKidData(kidDetails kidDetails);
  
  public List<kidEntity> readKid();
	  
  
}
