package fidmanar.demo.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
public class Clients {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nom;
    private String prenom;
    private String profil;
    private String reference;
    private Date date_de_naissance;
    private String code;
    @OneToMany
    private Personnels personnels;
    @OneToMany
    private Achats achats;
    @OneToMany
    private Ventes ventes;



}
