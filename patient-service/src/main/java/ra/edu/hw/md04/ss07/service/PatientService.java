package ra.edu.hw.md04.ss07.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ra.edu.hw.md04.ss07.dto.PatientRequestDto;
import ra.edu.hw.md04.ss07.dto.PatientResponseDto;
import ra.edu.hw.md04.ss07.entity.Patient;
import ra.edu.hw.md04.ss07.repository.PatientRepository;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Transactional
    public PatientResponseDto createPatient(PatientRequestDto request) {
        Patient patient = new Patient(
                request.id(),
                request.fullName(),
                request.dateOfBirth(),
                request.gender(),
                request.phoneNumber(),
                request.address(),
                request.medicalHistory()
        );
        Patient savedPatient = patientRepository.save(patient);
        return new PatientResponseDto(
                savedPatient.getId(),
                savedPatient.getFullName(),
                savedPatient.getDateOfBirth(),
                savedPatient.getGender(),
                savedPatient.getPhoneNumber(),
                savedPatient.getAddress(),
                savedPatient.getMedicalHistory()
        );
    }
}
