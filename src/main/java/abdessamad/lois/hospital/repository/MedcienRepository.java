package abdessamad.lois.hospital.repository;

import abdessamad.lois.hospital.entities.Medcien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedcienRepository extends JpaRepository<Medcien, Long> {
    public Medcien findByName(String name);
}
