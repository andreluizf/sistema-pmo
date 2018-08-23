package com.sistema.pmo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.pmo.model.Area;

public interface AreaRepository extends JpaRepository<Area, Long> {

	List<Area> findByNome(String nome);

	List<Area> findByStatus(Boolean status);

}