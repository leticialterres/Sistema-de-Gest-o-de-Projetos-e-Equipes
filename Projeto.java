import java.time.LocalDate;
public class Projeto {
    private Integer id;
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataTerminoPrevisto;
    private String status; // PLANEJADO, EM_ANDAMENTO, CONCLUIDO, CANCELADO
    private Integer gerenteId;

    public Projeto() {
    }

    public Projeto(Integer id, String nome, String descricao, LocalDate dataInicio, LocalDate dataTerminoPrevisto, String status, Integer gerenteId) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataTerminoPrevisto = dataTerminoPrevisto;
        this.status = status;
        this.gerenteId = gerenteId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataTerminoPrevisto() {
        return dataTerminoPrevisto;
    }

    public void setDataTerminoPrevisto(LocalDate dataTerminoPrevisto) {
        this.dataTerminoPrevisto = dataTerminoPrevisto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getGerenteId() {
        return gerenteId;
    }

    public void setGerenteId(Integer gerenteId) {
        this.gerenteId = gerenteId;
    }

    @Override
    public String toString() {
        return "Projeto{" +
               "id=" + id +
               ", nome=\'" + nome + '\'' +
               ", descricao=\'" + descricao + '\'' +
               ", dataInicio=" + dataInicio +
               ", dataTerminoPrevisto=" + dataTerminoPrevisto +
               ", status=\'" + status + '\'' +
               ", gerenteId=" + gerenteId +
               '}';
    }
}


