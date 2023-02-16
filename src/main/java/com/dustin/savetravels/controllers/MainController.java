package com.dustin.savetravels.controllers;

import com.dustin.savetravels.models.Save;
import com.dustin.savetravels.services.SaveService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

  @Autowired
  SaveService saveService;

  //! CREATE
  @PostMapping("/addExpense")
  public String createSave(
    @Valid @ModelAttribute("save") Save save,
    BindingResult result
  ) {
    if (result.hasErrors()) {
      return "expenses.jsp";
    } else {
      saveService.createSave(save);
      return "redirect:/expenses";
    }
  }

  //! READ ALL
  @GetMapping("/expenses")
  public String index(@ModelAttribute("save") Save save, Model model) {
    List<Save> saves = saveService.allSaves();
    // System.out.println(saves);
    model.addAttribute("saves", saves);
    return "expenses.jsp";
  }

  //! READ ONE
  @GetMapping("/expenses/{id}")
  public String show(@PathVariable("id") Long id, Model model) {
    Save save = saveService.oneSave(id);
    model.addAttribute("save", save);
    return "show.jsp";
  }

  //! UPDATE
  @GetMapping("/expenses/edit/{id}")
  public String edit(@PathVariable("id") Long id, Model model) {
    Save save = saveService.oneSave(id);
    model.addAttribute("save", save);
    return "edit.jsp";
  }

  @PutMapping("/expenses/{id}")
  public String update(
    @Valid @ModelAttribute("save") Save save,
    BindingResult result
  ) {
    if (result.hasErrors()) {
      return "edit.jsp";
    }
      saveService.updateSave(save);
      return "redirect:/expenses";
  }

  //! DELETE
  @DeleteMapping("/expenses/{id}")
  public String delete(@PathVariable("id") Long id) {
    Save save = saveService.oneSave(id);
    saveService.deleteSave(save);
    return "redirect:/expenses";
  }
}
