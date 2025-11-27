package br.com.jm.backend.portifolio.services;

import br.com.jm.backend.portifolio.model.ContatoModel;
import br.com.jm.backend.portifolio.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ContatoServiceImpl implements IServiceContato{

    @Autowired
    private ContatoRepository dao;

    @Override
    public ContatoModel salvarContato(ContatoModel novo) {
        //novo.setCreatedAt(LocalDateTime.now().toString());
        return dao.save(novo);
    }
}
