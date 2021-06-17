package fidmanar.demo.dao;

import fidmanar.demo.bean.Ventes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface VentesDao extends JpaRepository<Ventes,Long> {
    Ventes findByDate(Date date);
    Ventes findByReference(String reference);
    Ventes findByMontant(String montant);

    int deleteByDate(Date date);

    int deleteByReference( String reference);




}
