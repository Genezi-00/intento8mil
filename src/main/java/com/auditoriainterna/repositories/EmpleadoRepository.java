package com.auditoriainterna.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auditoriainterna.model.Empleado;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
	 List<Empleado> findByArea(String area);
	 Empleado findByDNI(int dNI);
	 
}