package fidmanar.demo.service;

import fidmanar.demo.bean.Factures;

import fidmanar.demo.dao.FacturesDao;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
public class FacturesService {
    @Autowired
    public FacturesDao facturesDao;

    public int save(Factures factures){
        if(factures.getDate() == null)
            return -1;
        else if(factures.getReference() == 0)
        return -2;
       else if(factures.getMontant() == 0)
            return -3;
         else if(factures.getType() == null)
            return -4;

         else {
            facturesDao.save(factures);
            return 1;
        }
        }
        public Factures findByReference(String reference){
             return facturesDao.findByReference(reference);
        }
       public Factures findByType(String type){
             return facturesDao.findByType(type);

        }
       public Factures findByDate(Date date){
             return facturesDao.findByDate(date);
        }
        public Factures findByReferenceAndMontant(String reference ,String montant){
             return facturesDao.findByReferenceAndMontant(reference,montant);
        }

        @Transactional
       public int deleteByReference(String reference){
             return facturesDao.deleteByReference(reference);
        }
        @Transactional
       public int deleteByType(String type){
             return facturesDao.deleteByType(type);
        }

        public List<Factures> findAll(){
         return this.facturesDao.findAll();
        }
    }






