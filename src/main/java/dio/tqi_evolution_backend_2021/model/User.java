package dio.tqi_evolution_backend_2021.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tab_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 50, nullable = false)
    private String email;

    @Column(length = 50, nullable = false)
    private String senha;

    //Melhoria: limitar a entrada para receber o CPF e RG com o formato correto
    @Column(length = 50, nullable = false, unique = true)
    private String cpf;

    @Column(length = 50, nullable = false, unique = true)
    private String rg;

    //Melhoria: Tornar Endereço uma tabela separada
    @Column(length = 100, nullable = false)
    private String endereco;

//    @OneToOne
//    @JoinColumn(name = "endereco_end_id")
//    private Endereco endereco;

    @Column(length = 10, nullable = false)
    private Float renda;

//    //Preparando o código para criação de autenticação por token
//    @ElementCollection(fetch = FetchType.EAGER)
//    @CollectionTable(name = "tab_user_roles", joinColumns = @JoinColumn(name = "user_id"))
//    @Column(name = "role_id")
//    private List<String> roles = new ArrayList<>();


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Float getRenda() {
        return renda;
    }

    public void setRenda(Float renda) {
        this.renda = renda;
    }

//    public List<String> getRoles() {
//        return roles;
//    }
//
//    public void setRoles(List<String> roles) {
//        this.roles = roles;
//    }
}
