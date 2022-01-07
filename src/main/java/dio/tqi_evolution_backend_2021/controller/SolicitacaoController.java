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

    //End-poind para criação de uma nova solicitação onde deve passar um objeto do tipo solicitação, limitado para usuários
    @PostMapping("/solicitacao_criar")
    public Solicitacao postSolicitacao(@RequestBody Solicitacao solicitacao){
        return service.createSolicitacao(solicitacao);
    }

    // Listar todas as solictações, limitado apenas usuários master
    @GetMapping("/solicitacao_listar")
    public List<Solicitacao> getSolicitacoes(){
        return service.findAll();
    }

    //Listar a solicitação de acordo com o id, limitar o acesso para master
    @GetMapping("/solicitacao_listar_id/{id}")
    public Optional<Solicitacao> getById(@PathVariable Integer id){
        return service.findById(id);
    }

    //Listar todas as solicitações do usuario id
    @GetMapping("/solicitacao_listar_id_user/{id}")
    public List<Solicitacao> getSolicitacaoIdUser(@PathVariable Integer id){
        return service.findByUserId(id);
    }

    //Listar a solicitações pelo id e pelo id do usuario, para limitar o acesso do usuário apenas a suas solicitações
    @GetMapping("/solicitacao_listar_id_and_id_user/{id}&{id_user}")
    public List<Solicitacao> getSolicitacaoIdAndIdUser(@PathVariable Integer id, @PathVariable Integer id_user){
        return service.findByIdAndIdUser(id, id_user);
    }

    //Listar a solicitações pelo id da solicitação e pelo login do usuario, para limitar o acesso do usuário apenas a suas solicitações
    @GetMapping("/solicitacao_listar_id_and_email/{id}&{email}")
    public List<Solicitacao> getSolicitacaoIdAndEmail(@PathVariable Integer id, @PathVariable String email){
        return service.findByIdAndEmail(id, email);
    }

    //listar solicitações pelo email do usuário
    @GetMapping("/solicitacao_email_user/{email}")
    public List<Solicitacao> getSolicitacaoEmailUser(@PathVariable String email){
        return service.findByUserEmail(email);
    }
}
