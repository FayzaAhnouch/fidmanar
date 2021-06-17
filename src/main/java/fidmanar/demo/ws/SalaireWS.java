package fidmanar.demo.ws;

import fidmanar.demo.bean.Personnels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import fidmanar.demo.service.PersonnelsService;

import java.util.Date;

@RestController
@RequestMapping("Fidmanar/Salaire")
public class SalaireWS {

    @Autowired
    public PersonnelsService personnelsService;

    @PostMapping("/")
    public int save(Personnels personnels) {
        return personnelsService.save(personnels);
    }




        @GetMapping("/date-d-embauche/{datedembauche}")
    public Personnels findByDatedembauche(Date datedembauche){
        return personnelsService.findByDatedembauche(datedembauche );

    }
    @GetMapping("/datederetraite/{datederetraite}")
    public Personnels findBydatederetraite(@PathVariable Date datederetraite) {
        return personnelsService.findByDatederetraite(datederetraite);
    }
    @GetMapping("/saliredebase/{salairedebase}")
    public Personnels findBySalairedebase(@PathVariable String salairedebase) {
        return personnelsService.findBySalairedebase(salairedebase);
    }
    @DeleteMapping("/datedembauche/{datedembauche}")
    public int deleteByDatedembauche(@PathVariable Date datedembauche) {
        return personnelsService.deleteByDatedembauche(datedembauche);
    }
    @DeleteMapping("/salireDeBAse/{salairedebase}")
    public int deleteBySalairedebase(@PathVariable String salairedebase) {
        return personnelsService.deleteBySalairedebase(salairedebase);
    }





    }



