package com.jaded.sistemagestionproyectos.repository;

import com.jaded.sistemagestionproyectos.model.empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IempresaRepoC  extends JpaRepository<empresa, Integer> {
}
