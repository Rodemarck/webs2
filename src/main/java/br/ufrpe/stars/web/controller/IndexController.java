package br.ufrpe.stars.web.controller;

import java.util.HashMap;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("/")
    public int index(){
        return 15;
    }
    @PostMapping("/ponto")
    public Ponto ponto(@RequestBody Ponto p){
        System.out.println("recebi um p =" + p);
        p.x *= 2;
        p.y += 5;
        return p;
    }
    
    public HashMap<String,List<String>> evaluate(@RequestBody Dados dados){
        
    }
}
