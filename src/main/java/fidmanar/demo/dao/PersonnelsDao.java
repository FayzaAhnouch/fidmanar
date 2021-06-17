package fidmanar.demo.dao;

import fidmanar.demo.bean.Personnels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface PersonnelsDao extends JpaRepository<Personnels,Long> {
    Personnels findByDatedembauche(Date datedembauche);
    Personnels findByDatederetraite(Date datederetraite);
    Personnels findBySalairedebase(String salairedebase);

    int deleteByDatedembauche(Date datedembauche);

    int deleteBySalairedebase( String salairedebase);





}
