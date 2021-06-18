package fidmanar.demo.ws;

import fidmanar.demo.bean.CNSS;
import fidmanar.demo.dao.CNSSDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import fidmanar.demo.service.CNSSService;

import java.util.Date;

@RestController
@RequestMapping("fidmanar/Cnss")
@CrossOrigin(origins = {"http://localhost:4200"})
public class CnssWS {
    @Autowired
    public CNSSService cnssService;
    @PostMapping("/")
    public int save(@RequestBody CNSS cnss) {
        return cnssService.save(cnss);  }
        @GetMapping("/numeroCnssandReference}")
    public CNSS findByNumeroCnss(@PathVariable String numeroCnss){

        return cnssService.findByNumeroCnss(numeroCnss);
    }
    @GetMapping("/reference/{reference}")
    public CNSS findByRefrence(@PathVariable String reference){

        return findByRefrence(reference);
    }
    @GetMapping("/date-de-declaration/{datede}")
    public CNSS findBydatede(@PathVariable Date datede){
        return findBydatede(datede);

    }@GetMapping("/activite/{activite}")
    public CNSS findByActivite(@PathVariable String activite){

        return findByActivite(activite);
    }@GetMapping("/numeroCnss/{numeroCnss}/Reference/{reference}")
    public CNSS findByNumeroCnssAndReference(@PathVariable String numeroCnss ,@PathVariable String reference ){
        return findByNumeroCnssAndReference( numeroCnss ,reference);
    }
@DeleteMapping("/reference/{reference}")
    public int deleteByReference(@PathVariable String reference){

        return deleteByReference(reference);
    }
    @DeleteMapping("/numerCnss/{numeroCnss}")
    public int deleteByNumeroCnss(@PathVariable String numeroCnss){

        return deleteByNumeroCnss(numeroCnss);
    }



}
