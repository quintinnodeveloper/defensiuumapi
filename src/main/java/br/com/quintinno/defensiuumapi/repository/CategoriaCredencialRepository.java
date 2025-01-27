package br.com.quintinno.defensiuumapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.quintinno.defensiuumapi.entity.CategoriaCredencialEntity;

@Repository
public interface CategoriaCredencialRepository extends JpaRepository<CategoriaCredencialEntity, Integer> {}
