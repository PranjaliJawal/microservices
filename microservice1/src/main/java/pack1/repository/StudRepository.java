package pack1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pack1.model.Student;

@Repository
public interface StudRepository extends JpaRepository<Student, Long>{

}
