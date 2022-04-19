package com.academia.service;

import java.util.List;

import com.academia.entity.Matricula;
import com.academia.entity.form.MatriculaForm;

public interface IMatriculaService {

  Matricula create(MatriculaForm form);

  
  Matricula get(Long id);

 
  List<Matricula> getAll(String bairro);

 
  void delete(Long id);

}
