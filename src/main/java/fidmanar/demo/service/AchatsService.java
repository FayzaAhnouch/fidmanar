package fidmanar.demo.service;

import fidmanar.demo.bean.Achats;
import fidmanar.demo.dao.AchatsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AchatsService {
    @Autowired
    public AchatsDao achatsDao;
    public int save(Achats achats) {

        if (achats.getReference() == null)
            return -1;
        else if (achats.getMontant() == 0)
            return -2;
        else if (achats.getDate() == null)
            return -3;

        Achats tmp =findByReferenceAndDate(achats.getReference(), achats.getDate());
        if (tmp == null) {
            achatsDao.save(achats);
            return 1;
        }

      return -4;
    }
   public Achats findByDate(Date date){
        return achatsDao.findByDate(date);
    }

    public Achats findByMontant(Long montant){
        return achatsDao.findByMontant(montant);
    }

    public Achats findByReference(String reference){
        return achatsDao.findByReference(reference);
    }
    public Achats findByReferenceAndDate(String reference ,Date date){
        return achatsDao.findByReferenceAndDate(reference , date );
    }

    public int deleteByReference(String reference){
        return achatsDao.deleteByReference(reference);
    }
    public List<Achats>findAll(){
        return achatsDao.findAll();
    }







}
