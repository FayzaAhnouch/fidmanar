package fidmanar.demo.ws;

import fidmanar.demo.bean.Factures;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import fidmanar.demo.service.FacturesService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("Fidmanar/Facture")
@CrossOrigin(origins = {"http://localhost:4200"})
public class FactureWS {
    @Autowired
    public FacturesService facturesService;
    @PostMapping("/")
    public int save(@RequestBody Factures factures) {
        return facturesService.save(factures);  }
        @GetMapping("/reference/{reference}")
    public Factures findByReference(@PathVariable String reference){
        return facturesService.findByReference(reference);
    }
    @GetMapping("/type/{type}")
    public Factures findByType(String type){
        return facturesService.findByType(type);

    }
    @GetMapping("/date/{date}")
    public Factures findByDate(Date date){

        return facturesService.findByDate(date);
    }
    @GetMapping("/reference/{reference}/Montant/{montant}")
    public Factures findByReferenceAndMontant(@PathVariable String reference ,@PathVariable String montant){
        return facturesService.findByReferenceAndMontant(reference,montant);
    }
     @DeleteMapping("/reference/{reference}")
    public int deleteByReference(@PathVariable String reference){
        return facturesService.deleteByReference(reference);
    }
    @DeleteMapping("/type/{type}")
    public int deleteByType(@PathVariable String type){

        return facturesService.deleteByType(type);
    }

    @GetMapping("/")
    public List<Factures> findAll() {
        return facturesService.findAll();
    }
}
