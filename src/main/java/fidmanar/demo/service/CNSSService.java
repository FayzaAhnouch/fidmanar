package fidmanar.demo.service;

import fidmanar.demo.bean.CNSS;
import fidmanar.demo.dao.CNSSDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
public class CNSSService {
    @Autowired
    public CNSSDao cnssDao;

    public int save(CNSS cnss) {
        if (cnss.getReference() == null)
            return -1;
        if (cnss.getNumerocnss() == 0)
            return -2;
        if (cnss.getDatede() == null)
            return -3;
        if (cnss.getActivite() == null)
            return -4;
    else {
           cnssDao.save(cnss);
            return 1;

        }
    }
     public CNSS findByNumeroCnss(String numeroCnss){
        return cnssDao.findByNumerocnss(numeroCnss);
    }
   public CNSS findByReference(String reference){
        return cnssDao.findByReference(reference);
    }
   public CNSS findBydatede(Date datede){
        return cnssDao.findByDatede(datede);

    }
   public CNSS findByActivite(String activite){
        return cnssDao.findByActivite(activite);
    }
   public CNSS findByNumerocnssAndReference(String numerocnss , String reference ){
        return  cnssDao.findByNumerocnssAndReference( numerocnss ,reference);
    }

    @Transactional
   public int deleteByReference(String reference){
        return cnssDao.deleteByReference(reference);
    }
    @Transactional
   public int deleteByNumeroCnss(String numeroCnss){
        return cnssDao.deleteByNumerocnss(numeroCnss);
    }

    public List<CNSS> findAll() {
        return this.cnssDao.findAll();
    }
}