package br.com.quintinno.defensiuumapi.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.quintinno.defensiuumapi.entity.CredencialEntity;
import br.com.quintinno.defensiuumapi.repository.CredencialRepository;

@Service
public class CredencialService {

    private CredencialRepository credencialRepository;

    public CredencialService(CredencialRepository credencialRepository) {
        this.credencialRepository = credencialRepository;
    }

    @Transactional
    public CredencialEntity create(CredencialEntity credencialEntity) {
        return this.credencialRepository.save(credencialEntity);
    }

    public List<CredencialEntity> findAll() {
        return this.credencialRepository.findAll();
    }

}
