package in.ashokit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.kidEntity;

public interface kidRepo extends JpaRepository<kidEntity, Serializable>{

}
