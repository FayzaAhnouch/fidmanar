package fidmanar.demo.dao;

import fidmanar.demo.bean.Achats;
import org.hibernate.exception.DataException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface AchatsDao extends JpaRepository<Achats,Long> {
  Achats findByDate(Date date);

  Achats findByMontant(Long montant);

  Achats findByReference(String reference);
  Achats findByReferenceAndDate(String reference ,Date date);

  int deleteByReference(String reference);





}
