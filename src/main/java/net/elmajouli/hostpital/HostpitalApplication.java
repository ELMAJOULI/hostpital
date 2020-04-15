package net.elmajouli.hostpital;

import net.elmajouli.hostpital.enteties.Patient;
import net.elmajouli.hostpital.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class HostpitalApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(HostpitalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        patientRepository.save(new Patient(null,"Amine"
                ,new SimpleDateFormat("dd/MM/yyy").parse("23/05/1998")
                ,false));
        patientRepository.save(new Patient(null,"Ahmed"
                ,new SimpleDateFormat("dd/MM/yyy").parse("25/01/1990")
                ,false));
        patientRepository.save(new Patient(null,"Morade"
                ,new SimpleDateFormat("dd/MM/yyy").parse("01/01/1968")
                ,false));
        patientRepository.save(new Patient(null,"Rachid"
                ,new SimpleDateFormat("dd/MM/yyy").parse("10/09/1995")
                ,false));
        patientRepository.save(new Patient(null,"Youssef"
                ,new SimpleDateFormat("dd/MM/yyy").parse("03/03/2005")
                ,false));
        patientRepository.save(new Patient(null,"Nezha"
                ,new SimpleDateFormat("dd/MM/yyy").parse("10/09/1998")
                ,false));
        patientRepository.save(new Patient(null,"Najat"
                ,new SimpleDateFormat("dd/MM/yyy").parse("23/05/1998")
                ,false));
        patientRepository.save(new Patient(null,"Amine"
                ,new SimpleDateFormat("dd/MM/yyy").parse("23/05/1998")
                ,false));
        patientRepository.save(new Patient(null,"Ahmed"
                ,new SimpleDateFormat("dd/MM/yyy").parse("25/01/1990")
                ,false));
        patientRepository.save(new Patient(null,"Naima"
                ,new SimpleDateFormat("dd/MM/yyy").parse("02/06/1975")
                ,false));
        patientRepository.save(new Patient(null,"Morade"
                ,new SimpleDateFormat("dd/MM/yyy").parse("01/01/1968")
                ,false));
        patientRepository.save(new Patient(null,"Naima"
                ,new SimpleDateFormat("dd/MM/yyy").parse("02/06/1975")
                ,false));
        patientRepository.save(new Patient(null,"Nezha"
                ,new SimpleDateFormat("dd/MM/yyy").parse("10/09/1998")
                ,false));
        patientRepository.save(new Patient(null,"Rachid"
                ,new SimpleDateFormat("dd/MM/yyy").parse("10/09/1995")
                ,false));
        patientRepository.save(new Patient(null,"Youssef"
                ,new SimpleDateFormat("dd/MM/yyy").parse("03/03/2005")
                ,false));
        patientRepository.save(new Patient(null,"Najat"
                ,new SimpleDateFormat("dd/MM/yyy").parse("23/05/1998")
                ,false));
        patientRepository.save(new Patient(null,"Rachid"
                ,new SimpleDateFormat("dd/MM/yyy").parse("10/09/1995")
                ,false));
        patientRepository.save(new Patient(null,"Youssef"
                ,new SimpleDateFormat("dd/MM/yyy").parse("03/03/2005")
                ,false));
        patientRepository.save(new Patient(null,"Naima"
                ,new SimpleDateFormat("dd/MM/yyy").parse("02/06/1975")
                ,false));
    }
}
