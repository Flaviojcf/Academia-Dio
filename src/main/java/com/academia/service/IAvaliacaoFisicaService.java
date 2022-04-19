package com.academia.service;

import java.util.List;

import com.academia.entity.AvaliacaoFisica;
import com.academia.entity.form.AvaliacaoFisicaForm;
import com.academia.entity.form.AvaliacaoFisicaUpdateForm;

public interface IAvaliacaoFisicaService {
 
  AvaliacaoFisica create(AvaliacaoFisicaForm form);

 
  AvaliacaoFisica get(Long id);

 
  List<AvaliacaoFisica> getAll();

  AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);
  void delete(Long id);
}
