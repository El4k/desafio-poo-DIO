package br.com.dio.desafio.dominio;

public class Curso {
    private String titulo;
    private String descrico;
    private int cargaHoraria;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescrico() {
        return descrico;
    }

    public void setDescrico(String descrico) {
        this.descrico = descrico;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descrico='" + descrico + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
