package dio.tqi_evolution_backend_2021.controller;

import dio.tqi_evolution_backend_2021.model.Solicitacao;
import dio.tqi_evolution_backend_2021.service.SolicitacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SolicitacaoController {

    @Autowired
    private SolicitacaoService service;

    @PostMapping("/solicitar")
    public void postSolicitacao(@RequestBody Solicitacao solicitacao){
        service.createSolicitacao(solicitacao);
    }
}
