package dio.tqi_evolution_backend_2021.repository;

import dio.tqi_evolution_backend_2021.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT e FROM User e JOIN FETCH e.roles WHERE e.email= :email")
    public User findByEmail(@Param("email") String email);

    @Query("FROM User WHERE email= :email")
    public User findByLogin(@Param("email") String email);

    boolean existsByEmail(String email);
}
