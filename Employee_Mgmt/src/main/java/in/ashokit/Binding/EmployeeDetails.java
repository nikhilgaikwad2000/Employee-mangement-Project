package in.ashokit.Binding;

import java.time.LocalDate;

import lombok.Data;

@Data
public class EmployeeDetails {

	private String empName;
	private String empMail;
	private LocalDate empDob;
	private Long empPhno;
	private String empCity;
}
