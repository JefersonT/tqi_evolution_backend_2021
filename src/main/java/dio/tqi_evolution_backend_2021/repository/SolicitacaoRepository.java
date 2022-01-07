package dio.tqi_evolution_backend_2021.repository;

import dio.tqi_evolution_backend_2021.model.Solicitacao;
import dio.tqi_evolution_backend_2021.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SolicitacaoRepository extends JpaRepository<Solicitacao, Integer> {
        @Query("FROM Solicitacao WHERE user_id = :user_id")
        public List<Solicitacao> findByIdUser(@Param("user_id") Integer user_id);

        //limitando a busco por id do usuário
        @Query("FROM Solicitacao WHERE id = :id and user_id = :user_id")
        public List<Solicitacao> findByIdAndUser(@Param("id") Integer id, @Param("user_id") Integer user_id);
}
