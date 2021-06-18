package fidmanar.demo.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Factures {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long montant;
    private Date date;
    private long reference;
    private String type;
    @OneToMany(mappedBy ="factures")
    private List<Achats> achats;
    @OneToMany(mappedBy = "factures")
    private List<Ventes> ventes;



}
