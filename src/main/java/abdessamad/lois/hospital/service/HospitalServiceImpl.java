package abdessamad.lois.hospital.service;

import abdessamad.lois.hospital.entities.Consultation;
import abdessamad.lois.hospital.entities.Medcien;
import abdessamad.lois.hospital.entities.Patient;
import abdessamad.lois.hospital.entities.RendezVous;
import abdessamad.lois.hospital.repository.PatientRepository;
import abdessamad.lois.hospital.repository.RendezVousRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService {
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private RendezVousRepository rendezVousRepository;

    @Override
    public Patient savePatient(Patient patient) {

        patientRepository.save(patient);
        return patient;
    }

    @Override
    public Medcien saveMedcien(Medcien medcien) {
        return null;
    }

    @Override
    public RendezVous saveRDV(RendezVous rendezVous) {
        rendezVous.setId(UUID.randomUUID().toString());
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return null;
    }

    @Override
    public List<Patient> getPatients() {
        return patientRepository.findAll();
    }


}
