package com.academia.service;

import java.util.List;

import com.academia.entity.Aluno;
import com.academia.entity.AvaliacaoFisica;
import com.academia.entity.form.AlunoForm;
import com.academia.entity.form.AlunoUpdateForm;

public interface IAlunoService {

  Aluno create(AlunoForm form);

 
  Aluno get(Long id);

 
  List<Aluno> getAll(String dataDeNascimento);

 
  Aluno update(Long id, AlunoUpdateForm formUpdate);

 
  void delete(Long id);

 
  List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);


}
