package abdessamad.lois.hospital.repository;

import abdessamad.lois.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    public Patient findByName(String name);
}
