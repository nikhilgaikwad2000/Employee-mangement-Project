package in.ashokit.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "EMPLOYEE_MASTER")
public class EmpEntity {

	@Id
	@GeneratedValue
	private Integer empId;
	private String empName;
	private String empMail;
	private LocalDate empDob;
	private Long empPhno;
	private String empCity;
	private Long empSalary;
	private LocalDate joinDate;
	
}
