package fidmanar.demo.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Achats {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;
    private long montant;
    private Date date;
    private String reference;
    @ManyToOne
    private Factures factures;
    @ManyToOne
    private Clients clients;





}
