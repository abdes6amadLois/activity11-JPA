package abdessamad.lois.hospital.service;

import abdessamad.lois.hospital.entities.Consultation;
import abdessamad.lois.hospital.entities.Medcien;
import abdessamad.lois.hospital.entities.Patient;
import abdessamad.lois.hospital.entities.RendezVous;

import java.util.List;

public interface IHospitalService {
    public Patient savePatient(Patient patient);
    public Medcien saveMedcien(Medcien medcien);
    public RendezVous saveRDV(RendezVous rendezVous);
    public Consultation saveConsultation(Consultation consultation);
    public List<Patient> getPatients();
}
