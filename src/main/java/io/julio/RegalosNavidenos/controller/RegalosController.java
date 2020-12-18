package io.julio.RegalosNavidenos.controller;

import io.julio.RegalosNavidenos.repository.RegalosDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RegalosController {

    @Autowired
    private RegalosDao regalosDao;

    @GetMapping
    public String indexTiendaRegalos() {
        return "index";
    }

    @GetMapping("/regalos")
    public String getListaRegalos(Model model) {
        model.addAttribute("regalos", regalosDao.findAll());
        return "regalos";
    }
}
