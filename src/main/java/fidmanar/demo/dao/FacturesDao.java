package fidmanar.demo.dao;

import fidmanar.demo.bean.Factures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface FacturesDao extends JpaRepository<Factures,Long> {
    Factures findByReference(String reference);
    Factures findByType(String type);
    Factures findByDate(Date date);
    Factures findByReferenceAndMontant(String reference ,String montant);

    int deleteByReference(String reference);
    int deleteByType(String type);





}
