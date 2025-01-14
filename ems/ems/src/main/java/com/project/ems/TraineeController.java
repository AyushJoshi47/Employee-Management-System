package com.project.ems;

import com.project.ems.Trainee;
import com.project.ems.TraineeRepository;
import com.project.ems.Trainee;
import com.project.ems.TraineeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ems/trainee")
public class TraineeController {

    @Autowired
    private TraineeRepository traineeRepository;

    @PostMapping("/add")
    public @ResponseBody Trainee addTrainee(
            @RequestParam String firstname,
            @RequestParam String lastname,
            @RequestParam String email,
            @RequestParam String phone

    ) {
        Trainee trainee = new Trainee();
        trainee.setFirstname(firstname);
        trainee.setLastname(lastname);
        trainee.setEmail(email);
        trainee.setPhone(phone);
        traineeRepository.save(trainee);
        return trainee;
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<Trainee> getAllTrainees() {
        return traineeRepository.findAll();
    }


}
