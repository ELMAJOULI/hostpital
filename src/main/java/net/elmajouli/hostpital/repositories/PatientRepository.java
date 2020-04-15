package net.elmajouli.hostpital.repositories;

import net.elmajouli.hostpital.enteties.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
   Page<Patient> findByNameContains(String keyword,Pageable p);

}
