package dio.tqi_evolution_backend_2021.service;

import dio.tqi_evolution_backend_2021.model.Solicitacao;
import dio.tqi_evolution_backend_2021.repository.SolicitacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SolicitacaoService {
    @Autowired
    private SolicitacaoRepository repository;

    public void createSolicitacao (Solicitacao solicitacao){
        repository.save(solicitacao);
    }
}
