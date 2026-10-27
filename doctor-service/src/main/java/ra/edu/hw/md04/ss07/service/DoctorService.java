package ra.edu.hw.md04.ss07.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ra.edu.hw.md04.ss07.dto.DoctorResponseDto;
import ra.edu.hw.md04.ss07.repository.DoctorRepository;

import java.util.List;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Transactional(readOnly = true)
    public List<DoctorResponseDto> getDoctors() {
        return doctorRepository.findAll().stream()
                .map(doctor -> new DoctorResponseDto(
                        doctor.getId(),
                        doctor.getName(),
                        doctor.getSpecialization()
                ))
                .toList();
    }
}
