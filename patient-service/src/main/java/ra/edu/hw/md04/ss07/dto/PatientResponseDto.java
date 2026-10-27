package ra.edu.hw.md04.ss07.dto;

import java.time.LocalDate;

public record PatientResponseDto(
        Long id,
        String fullName,
        LocalDate dateOfBirth,
        String gender,
        String phoneNumber,
        String address,
        String medicalHistory
) {
}
