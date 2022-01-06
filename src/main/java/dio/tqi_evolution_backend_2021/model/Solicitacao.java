package dio.tqi_evolution_backend_2021.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tab_solicitacao")
public class Solicitacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "solicitacao_id")
    private Integer id;

    @Column(length = 10, nullable = false)
    private Float valor;

    @Column(length = 50, nullable = false)
    private Date data_solicitacao;

    @Column(length = 50, nullable = false)
    private Date data_pri_parcela;

    @Column(length = 2, nullable = false)
    private Integer qtd_parcelas;//limitar a 60 parcelas


    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
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

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Date getData_solicitacao() {
        return data_solicitacao;
    }

    public void setData_solicitacao(Date data_solicitacao) {
        this.data_solicitacao = data_solicitacao;
    }

    public Date getData_pri_parcela() {
        return data_pri_parcela;
    }

    public void setData_pri_parcela(Date data_pri_parcela) {
        this.data_pri_parcela = data_pri_parcela;
    }

    public Integer getQtd_parcelas() {
        return qtd_parcelas;
    }

    public void setQtd_parcelas(Integer qtd_parcelas) {
        this.qtd_parcelas = qtd_parcelas;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
