package fidmanar.demo.service;

import fidmanar.demo.bean.Factures;
import fidmanar.demo.bean.Ventes;
import fidmanar.demo.dao.VentesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

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

        @Transactional
        public int deleteByDate(Date date) {
            return ventesDao.deleteByDate(date);
        }

        @Transactional
        public int deleteByReference( String reference){
             return ventesDao.deleteByReference(reference);
    }

    public List<Ventes> findAll(){
        return this.ventesDao.findAll();
    }
}


