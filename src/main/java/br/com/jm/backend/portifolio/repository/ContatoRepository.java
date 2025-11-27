package br.com.jm.backend.portifolio.repository;

import br.com.jm.backend.portifolio.model.ContatoModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContatoRepository extends MongoRepository<ContatoModel,String> {
}
