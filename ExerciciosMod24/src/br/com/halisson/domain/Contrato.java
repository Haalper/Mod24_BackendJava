package br.com.halisson.domain;

public class Contrato {
    private Long id;
    private String titulo;
    private String descricao;


    public Contrato() {}

    public Contrato(Long id, String titulo, String descricao) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    // toString
    @Override
    public String toString() {
        return "Contrato{id=" + id + ", titulo='" + titulo + "', descricao='" + descricao + "'}";
    }
}
