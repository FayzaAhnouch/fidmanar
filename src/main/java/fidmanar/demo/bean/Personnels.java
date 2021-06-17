package fidmanar.demo.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Personnels {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Date datedembauche;
    private Date datederetraite;

    private long salairedebase;
    @OneToOne
    private CNSS CNSS;




}
