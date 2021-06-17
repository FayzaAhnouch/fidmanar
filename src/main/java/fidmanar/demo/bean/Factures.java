package fidmanar.demo.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

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
    @OneToMany
    private Achats achats;
    @OneToMany
    private Ventes ventes;



}
