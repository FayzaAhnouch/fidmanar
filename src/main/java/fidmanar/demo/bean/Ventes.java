package fidmanar.demo.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Ventes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long montant;
    private Date date;
    private long reference;
    @ManyToOne
    private Factures factures;
    @ManyToOne
    private Clients clients;




}
