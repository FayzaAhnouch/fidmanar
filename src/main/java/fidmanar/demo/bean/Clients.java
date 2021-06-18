package fidmanar.demo.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


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
    private List<Personnels> personnels;
    @OneToMany(mappedBy = "clients")
    private List<Achats> achats;

    @OneToMany(mappedBy = "clients")
    private List<Ventes> ventes;

}
