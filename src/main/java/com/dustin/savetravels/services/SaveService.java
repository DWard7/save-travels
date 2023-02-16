package com.dustin.savetravels.services;

import com.dustin.savetravels.models.Save;
import com.dustin.savetravels.repositories.SaveRepository;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveService {
  
  @Autowired
  SaveRepository saveRepository;

  //! CREATE
  public void createSave(Save save){
    saveRepository.save(save);
  }

  //! READ ALL
  public List<Save> allSaves(){
    return saveRepository.findAll();
  }

  //! READ ONE
  public Save oneSave(Long id){
    Optional<Save> optionalSave = saveRepository.findById(id);
    return optionalSave.orElse(null);
  }

  //! UPDATE
  public void updateSave(Save save){
    saveRepository.save(save);
  }

  //! DELETE
  public void deleteSave(Save save){
    saveRepository.delete(save);
  }
}
