package net.elmajouli.hostpital.controllers;


import net.elmajouli.hostpital.enteties.Patient;
import net.elmajouli.hostpital.repositories.PatientRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;


@Controller
public class PatientController {

    private final PatientRepository patientRepository;
    public PatientController(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @GetMapping("/patient")
    public String getPatient(@RequestParam(defaultValue = "0") int page
                             ,@RequestParam(defaultValue = "2") int size
                             ,@RequestParam(defaultValue = "") String keyword
                             ,Model patients){
        Page<Patient> patientPage = patientRepository.findByNameContains(keyword, PageRequest.of(page, size));
            patients.addAttribute("patientPages", patientPage);
            patients.addAttribute("currentPage",page);
            patients.addAttribute("size",size);
            patients.addAttribute("pages",new int[patientPage.getTotalPages()]);
            patients.addAttribute("keyword",keyword);

        return "patient";

    }
    @PostMapping("/addPatient")
    //i'want to use @ModelAttribute but have problem to convert the date returned by HTml to java date
    public String addPatient(String name,String birth,boolean isSick){
        System.out.println(name+" "+birth+" "+isSick);
        try {
            patientRepository.save(new Patient(null,name,new SimpleDateFormat("yyy-mm-dd").parse(birth),isSick));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "redirect:/patient";
    }
    @GetMapping("/removePatient")
    public String removePatient(@RequestParam Long id){
        patientRepository.deleteById(id);
        return "redirect:/patient";
    }

}
