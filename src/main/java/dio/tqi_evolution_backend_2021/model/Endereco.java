package dio.tqi_evolution_backend_2021.model;

import javax.persistence.*;

@Entity
@Table(name = "tab_end")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "end_id")
    private Integer id;

    @Column(length = 50, nullable = false)
    private String cidade;

    @Column(length = 50, nullable = false)
    private String pais;

    @Column(length = 50, nullable = false)
    private String estado;

    @Column(length = 50, nullable = false)
    private String rua;

    @Column(length = 10, nullable = false)
    private Integer numero;

    @Column(length = 50, nullable = false)
    private String complemento;

    @Column(length = 50, nullable = false)
    private String referencia;

    @Column(length = 50, nullable = false)
    private String cep;

    @OneToOne
    @JoinColumn(name = "end_user_id", nullable = false)
    private User user;

    public User getUser() {
        return user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
