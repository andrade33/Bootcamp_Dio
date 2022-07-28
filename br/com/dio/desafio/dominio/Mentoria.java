package Bootcamp.br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    // ##################################################################
    
    //Attibutes 
    /*Classe java que possibilita trabalhar com datas*/
    private LocalDate data; ;
    // ##################################################################

    // ##################################################################
    //Construtor vazio
    public Mentoria(){
    }
    // ##################################################################

    // ##################################################################
    //Implementand o metodo abstato herdado de Conteudo;
    @Override
    public double calcularXP() {
        return XP_PADRAO + 20;
    }
    // ##################################################################

    // ##################################################################
    //Methods getter and setter
    
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
        "Titulo: " + getTitulo() + 
        ", Descrição: " + getDescricao() +
        ", Data: " + data + 
        "}";
    }
    // ##################################################################
}
