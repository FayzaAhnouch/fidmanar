package fidmanar.demo.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class CNSS {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long numerocnss;
    private Date datede;
    private String activite;
    private String reference;
    @OneToOne
    private Personnels personnels;


}
