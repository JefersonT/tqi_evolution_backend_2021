package dio.tqi_evolution_backend_2021.controller;

import dio.tqi_evolution_backend_2021.model.Solicitacao;
import dio.tqi_evolution_backend_2021.service.SolicitacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class SolicitacaoController {

    @Autowired
    private SolicitacaoService service;

    @PostMapping("/solicitar")
    public Solicitacao postSolicitacao(@RequestBody Solicitacao solicitacao){
        return service.createSolicitacao(solicitacao);
    }

    @GetMapping("/solicitacoes")
    public List<Solicitacao> getSolicitacoes(){
        return service.findAll();
    }

    @GetMapping("/solicitacao/{id}")
    public Optional<Solicitacao> getById(@PathVariable Integer id){
        return service.findById(id);
    }
}
