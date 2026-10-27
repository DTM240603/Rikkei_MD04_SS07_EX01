package ra.edu.hw.md04.ss07.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ra.edu.hw.md04.ss07.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
