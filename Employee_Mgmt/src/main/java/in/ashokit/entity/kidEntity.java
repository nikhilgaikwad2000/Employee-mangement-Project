package in.ashokit.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="KIDS_MASTER")
public class kidEntity {

@Id
@GeneratedValue
private Integer kidId;
private String kidName;
private LocalDate kidDob;
private String schoolType;

private Integer empId;
}
