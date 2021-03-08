package com.daw.testheroku.models.dao;

import com.daw.testheroku.models.entity.Alumno;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAlumnoDAO  extends JpaRepository<Alumno,Long>{

}
    

