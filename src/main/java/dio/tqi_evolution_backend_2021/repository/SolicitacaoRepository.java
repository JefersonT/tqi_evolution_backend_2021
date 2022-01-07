package dio.tqi_evolution_backend_2021.repository;

import dio.tqi_evolution_backend_2021.model.Solicitacao;
import dio.tqi_evolution_backend_2021.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SolicitacaoRepository extends JpaRepository<Solicitacao, Integer> {
//        @Query("SELECT * FROM tab_solicitacao WHERE user_id= (:user_id")
//        public Solicitacao findByIdUser(@Param("user_id") User user_id);
}
