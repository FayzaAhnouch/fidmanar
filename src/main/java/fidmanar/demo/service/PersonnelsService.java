package fidmanar.demo.service;
import fidmanar.demo.bean.Personnels;
import fidmanar.demo.dao.PersonnelsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
public class PersonnelsService {
    @Autowired
    public PersonnelsDao personnelsDao;
    public int save(Personnels personnels) {
        if (personnels.getSalairedebase() == 0)
            return -1;
        if (personnels.getDatedembauche() == null)
            return -2;
        if (personnels.getDatederetraite() == null)
            return -3;
    else {
           personnelsDao.save(personnels);
            return 1;
        }
    }

        public Personnels findByDatedembauche(Date datedembauche){
            return personnelsDao.findByDatedembauche(datedembauche );

        }
       public Personnels findByDatederetraite(Date datederetraite) {
            return personnelsDao.findByDatederetraite(datederetraite);
        }
       public Personnels findBySalairedebase(String salairedebase) {
            return personnelsDao.findBySalairedebase(salairedebase);
        }

        @Transactional
       public int deleteByDatedembauche(Date datedembauche) {
            return personnelsDao.deleteByDatedembauche(datedembauche);
        }

        @Transactional
         public int deleteBySalairedebase( String salairedebase) {
            return personnelsDao.deleteBySalairedebase(salairedebase);
        }


    public List<Personnels> findall() {
        return personnelsDao.findAll();
    }
}

