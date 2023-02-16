package com.dustin.savetravels.repositories;

import com.dustin.savetravels.models.Save;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface SaveRepository extends CrudRepository<Save, Long> {
  List<Save> findAll();
  
}
