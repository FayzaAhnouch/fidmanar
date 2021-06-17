package fidmanar.demo.ws;

import fidmanar.demo.bean.Achats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import fidmanar.demo.service.AchatsService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("fidmanar/Achats")
public class AchatsWS {
    @Autowired
    public AchatsService achatsService;

    @PostMapping("/")
    public int save(@RequestBody Achats achats) {
        return achatsService.save(achats);
    }

    @GetMapping("/date{date}")
    public Achats findByDate(@PathVariable Date date) {
        return achatsService.findByDate(date);
    }

    @GetMapping("/montant/{montant}")
    public Achats findByMontant(@PathVariable Long montant) {

        return achatsService.findByMontant(montant);
    }

    @GetMapping("reference/{reference}")
    public Achats findByReference(@PathVariable String reference) {

        return achatsService.findByReference(reference);
    }

    @PostMapping("/referenceandDate")
    public Achats findByReferenceAndDate(@RequestBody String reference, @RequestBody Date date) {
        return achatsService.findByReferenceAndDate(reference, date);
    }

    @DeleteMapping("/reference/{reference}")
    public int deleteByReference(@PathVariable String reference) {

        return achatsService.deleteByReference(reference);
    }

    @GetMapping("/")
   public List<Achats> findAll() {
        return achatsService.findAll();
    }
}
