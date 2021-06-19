package fidmanar.demo.service;

import fidmanar.demo.bean.Clients;
import fidmanar.demo.dao.ClientsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ClientsService {
    @Autowired
    public ClientsDao clientsDao;

    public int save(Clients clients) {
        if (clients.getNom() == null || clients.getPrenom() == null)
            return -1;
        else if (clients.getProfil() == null)
            return -2;
        else if (clients.getReference() == null)
            return -3;
        else if (clients.getDate_de_naissance() == null)
            return -4;
        else {
            clientsDao.save(clients);
            return 1;
        }
    }

    public Clients findByReference(String reference) {
        return clientsDao.findByReference(reference);
    }

    public Clients findByCode(String code) {
        return clientsDao.findByCode(code);
    }


   public List<Clients> findByNomAndPrenom(String nom, String prenom) {
        return clientsDao.findByNomAndPrenom(nom, prenom);
    }

    public List<Clients> findAll(){
        return clientsDao.findAll();
    }

    @Transactional
   public int deleteByReference(String reference) {
        return clientsDao.deleteByReference(reference);
    }

    @Transactional
   public int deleteByCode(String code) {
        return clientsDao.deleteByCode(code);
    }

}
