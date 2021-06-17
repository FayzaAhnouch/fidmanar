package fidmanar.demo.dao;

import fidmanar.demo.bean.Clients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClientsDao extends JpaRepository<Clients, Long> {

    Clients findByReference(String reference);

    Clients findByCode(String code);

    List<Clients> findByNomAndPrenom(String nom ,String prenom);

    int deleteByReference(String reference);

    int deleteByCode(String code);





}
