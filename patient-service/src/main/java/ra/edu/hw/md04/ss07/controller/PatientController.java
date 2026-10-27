package ra.edu.hw.md04.ss07.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ra.edu.hw.md04.ss07.dto.PatientRequestDto;
import ra.edu.hw.md04.ss07.dto.PatientResponseDto;
import ra.edu.hw.md04.ss07.service.PatientService;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping
    public ResponseEntity<PatientResponseDto> createPatient(@RequestBody PatientRequestDto request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(patientService.createPatient(request));
    }
}
