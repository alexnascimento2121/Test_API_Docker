package br.com.uniciv.test_api;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensagemRepository extends MongoRepository<Mensagem, UUID>{

}
