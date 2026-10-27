package ra.edu.hw.md04.ss07.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ra.edu.hw.md04.ss07.dto.DoctorResponseDto;
import ra.edu.hw.md04.ss07.service.DoctorService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/doctors")
public class DoctorController {

    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping
    public List<DoctorResponseDto> getDoctors() {
        return doctorService.getDoctors();
    }
}
