package fidmanar.demo.ws;

import fidmanar.demo.bean.Clients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import fidmanar.demo.service.ClientsService;

import java.util.List;

@RestController
@RequestMapping("Fidmanar/Clients")
public class ClientsWS {
    @Autowired
    public ClientsService clientsService;

    @PostMapping("/")
    public int save(@RequestBody Clients clients) {
        return clientsService.save(clients);
    }

    @GetMapping("/reference/{reference}")
    public Clients findByReference(@PathVariable String reference) {
        return clientsService.findByReference(reference);
    }

    @GetMapping("/code/{code}")
    public Clients findByCode(@PathVariable String code) {

        return clientsService.findByCode(code);
    }

    @GetMapping("/nom/{nom}/prenom/{prenom}")
    public List<Clients> findByNomAndPrenom(@PathVariable String nom, @PathVariable String prenom) {
        return clientsService.findByNomAndPrenom(nom, prenom);
    }

    @DeleteMapping("/reference/{reference}")
    public int deleteByReference(@PathVariable String reference) {

        return clientsService.deleteByReference(reference);
    }

    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {

        return clientsService.deleteByCode(code);
    }


}
