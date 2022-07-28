package Bootcamp.br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    // ##################################################################
    //Attibutes
    private String titulo;
    private String descricao;
    
    /*Classe java que possibilita trabalhar com datas*/
    private LocalDate data; ;
    // ##################################################################

    // ##################################################################
    //Construtor vazio
    public Mentoria(){
    }
    // ##################################################################

    // ##################################################################
    //Methods getter and setter
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
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    // ##################################################################
    
    // ##################################################################
    @Override
    public String toString() {
        return "Mentoria: {" + 
        "Titulo: " + titulo + 
        ", Descrição: " + descricao +
        ", Data: " + data + 
        "}";
    }
    // ##################################################################
}
