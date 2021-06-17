package fidmanar.demo.dao;

import fidmanar.demo.bean.CNSS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface CNSSDao extends JpaRepository<CNSS,Long> {
    CNSS findByNumerocnss(String numerocnss);
    CNSS findByReference(String reference);
    CNSS findByDatede(Date datede);
    CNSS findByActivite(String activite);
    CNSS findByNumerocnssAndReference(String numerocnss , String reference );

    int deleteByReference(String reference);
    int deleteByNumerocnss(String numeroCnss);








}
