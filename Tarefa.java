package com.oracle.project;

import java.time.LocalDate;

public class Tarefa {
    private Integer id;
    private String titulo;
    private String descricao;
    private Integer projetoId;
    private Integer responsavelId;
    private String status; // PENDENTE, EM_EXECUCAO, CONCLUIDA
    private LocalDate dataInicioPrevista;
    private LocalDate dataFimPrevista;
    private LocalDate dataInicioReal;
    private LocalDate dataFimReal;

    public Tarefa() {
    }

    public Tarefa(Integer id, String titulo, String descricao, Integer projetoId, Integer responsavelId, String status, LocalDate dataInicioPrevista, LocalDate dataFimPrevista, LocalDate dataInicioReal, LocalDate dataFimReal) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.projetoId = projetoId;
        this.responsavelId = responsavelId;
        this.status = status;
        this.dataInicioPrevista = dataInicioPrevista;
        this.dataFimPrevista = dataFimPrevista;
        this.dataInicioReal = dataInicioReal;
        this.dataFimReal = dataFimReal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getProjetoId() {
        return projetoId;
    }

    public void setProjetoId(Integer projetoId) {
        this.projetoId = projetoId;
    }

    public Integer getResponsavelId() {
        return responsavelId;
    }

    public void setResponsavelId(Integer responsavelId) {
        this.responsavelId = responsavelId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDataInicioPrevista() {
        return dataInicioPrevista;
    }

    public void setDataInicioPrevista(LocalDate dataInicioPrevista) {
        this.dataInicioPrevista = dataInicioPrevista;
    }

    public LocalDate getDataFimPrevista() {
        return dataFimPrevista;
    }

    public void setDataFimPrevista(LocalDate dataFimPrevista) {
        this.dataFimPrevista = dataFimPrevista;
    }

    public LocalDate getDataInicioReal() {
        return dataInicioReal;
    }

    public void setDataInicioReal(LocalDate dataInicioReal) {
        this.dataInicioReal = dataInicioReal;
    }

    public LocalDate getDataFimReal() {
        return dataFimReal;
    }

    public void setDataFimReal(LocalDate dataFimReal) {
        this.dataFimReal = dataFimReal;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
               "id=" + id +
               ", titulo=\'" + titulo + '\'' +
               ", descricao=\'" + descricao + '\'' +
               ", projetoId=" + projetoId +
               ", responsavelId=" + responsavelId +
               ", status=\'" + status + '\'' +
               ", dataInicioPrevista=" + dataInicioPrevista +
               ", dataFimPrevista=" + dataFimPrevista +
               ", dataInicioReal=" + dataInicioReal +
               ", dataFimReal=" + dataFimReal +
               '}';
    }
}


