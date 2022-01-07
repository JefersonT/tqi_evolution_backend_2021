package dio.tqi_evolution_backend_2021.service;

import dio.tqi_evolution_backend_2021.model.Solicitacao;
import dio.tqi_evolution_backend_2021.repository.SolicitacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

@Service
public class SolicitacaoService {
    @Autowired
    private SolicitacaoRepository repository;

    public Solicitacao createSolicitacao (Solicitacao solicitacao){
        solicitacao.setData_solicitacao(new Date());
        long diff = solicitacao.getData_pri_parcela().getTime() - solicitacao.getData_solicitacao().getTime();
        TimeUnit time = TimeUnit.DAYS;
        long difference = time.convert(diff, TimeUnit.MILLISECONDS);
        if ( difference > 90){
            solicitacao.setData_pri_parcela(null);
            return repository.save(solicitacao);
        }
        return repository.save(solicitacao);
    }

    public List<Solicitacao> findAll(){
        return repository.findAll();
    }

    public Optional<Solicitacao> findById(Integer id){
        return repository.findById(id);
    }
}
