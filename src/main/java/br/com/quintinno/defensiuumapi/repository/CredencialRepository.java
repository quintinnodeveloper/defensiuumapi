package br.com.quintinno.defensiuumapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.quintinno.defensiuumapi.entity.CredencialEntity;

@Repository
public interface CredencialRepository extends JpaRepository<CredencialEntity, Integer> {}
