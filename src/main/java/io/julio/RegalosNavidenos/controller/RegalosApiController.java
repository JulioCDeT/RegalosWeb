package io.julio.RegalosNavidenos.controller;

import io.julio.RegalosNavidenos.model.Regalo;
import io.julio.RegalosNavidenos.repository.RegalosDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RegalosApiController {

    @Autowired
    private RegalosDao regalosDao;

    @PostMapping("/add")
    public String addRegalo(@RequestBody Regalo regalo) {
        regalosDao.save(regalo);
        return "done";
    }

    @GetMapping("/getByDecorado/{decorado}")
    public Regalo getByDecorado(@PathVariable("decorado") String decorado) {
        return regalosDao.findByDecorado(decorado);
    }
}
