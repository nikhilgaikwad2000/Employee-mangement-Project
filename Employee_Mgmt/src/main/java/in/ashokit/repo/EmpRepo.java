package in.ashokit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.EmpEntity;

public interface EmpRepo extends JpaRepository<EmpEntity, Serializable> {

}
