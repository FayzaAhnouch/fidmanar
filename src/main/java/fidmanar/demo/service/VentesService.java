package fidmanar.demo.service;

import fidmanar.demo.bean.Ventes;
import fidmanar.demo.dao.VentesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class VentesService {
    @Autowired
    public VentesDao ventesDao;

    public int save(Ventes ventes) {
        if (ventes.getDate() == null)
            return -1;
        if (ventes.getReference() == 0)
            return -2;
        if (ventes.getMontant() == 0)
            return -3;
        else {
            ventesDao.save(ventes);
            return 1;
        }
    }
        public Ventes findByDate(Date date) {

        return ventesDao.findByDate(date);
        }
         public Ventes findByReference(String reference){
        return ventesDao.findByReference(reference);
        }

         public Ventes findByMontant(String montant) {
            return ventesDao.findByMontant(montant);
        }

        public int deleteByDate(Date date) {
            return ventesDao.deleteByDate(date);
        }

        public int deleteByReference( String reference){
             return ventesDao.deleteByReference(reference);
    }
}


