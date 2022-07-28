package Bootcamp.br.com.dio.desafio.dominio;

public class Curso {
    
    /* IMPORTANTE: 
    ** Encapsulamento - Generate methods getters and setters; 
    **When using the acess modifier as private only this classe access this attribute; 
    */


    // ##################################################################
    // This constructor isn't necessary, cause already create by java
    public Curso(){
    }
    // ##################################################################
    
    // ##################################################################
    //Attibutes
    private String titulo;
    private String descricao;
    private int cargaHoraria;
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
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    // ##################################################################
    
    // ##################################################################
    @Override
    public String toString() {
        return "Curso: {" + 
        "Titulo: " + titulo + 
        ", Descrição: " + descricao +
        ", Carga Horaria: " + cargaHoraria +
        "}";
    }
    // ##################################################################
    
}
