package dio.tqi_evolution_backend_2021.dto;

import javax.persistence.criteria.CriteriaBuilder;

public class Sessao {
    private String email;
    private Integer id_user;
    private String token;

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
