package Bootcamp.br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    
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
    private int cargaHoraria;
    // ##################################################################

    // ##################################################################
    // Implementando o metodo abstrato herdado de conteudo. 
    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }
    // ##################################################################
    
    // ##################################################################
    //Methods getter and setter   
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
        "Titulo: " + getTitulo() + 
        ", Descrição: " + getDescricao() +
        ", Carga Horaria: " + cargaHoraria +
        "}";
    }
    // ##################################################################
   
    
}
