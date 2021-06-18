package fidmanar.demo.ws;
import fidmanar.demo.bean.Ventes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import fidmanar.demo.service.VentesService;

import java.util.Date;

@RestController
@RequestMapping("Fidmanar/Vente")
@CrossOrigin(origins = {"http://localhost:4200"})
public class VentesWS {
     @Autowired
    public VentesService ventesService;

    @PostMapping("/")
    public int save(@RequestBody  Ventes ventes) {
        return ventesService.save(ventes);
    }
    @GetMapping("/date/{date}")
    public Ventes findByDate( @PathVariable Date date) {

        return ventesService.findByDate(date);
    }
    @GetMapping("/reference/{reference}")
    public Ventes findByReference(@PathVariable String reference){

        return ventesService.findByReference(reference);
    }
    @GetMapping("/montant/{montant}")
    public Ventes findByMontant(@PathVariable String montant) {

        return ventesService.findByMontant(montant);
    }
    @DeleteMapping("date/{date}")
    public int deleteByDate(@PathVariable Date date) {

        return ventesService.deleteByDate(date);
    }
     @DeleteMapping("/reference/{reference}")
    public int deleteByReference(@PathVariable String reference){

        return ventesService.deleteByReference(reference);
    }
}
