package Bootcamp.br.com.dio.desafio.dominio;

//Essa classe passou a ser abstract porque contem um metodo abstract;
// Uma classe abstrata não permite a criação de objetos da mesma;
// Essa classe evta a repetição de codigos nas classes filhas
public abstract class Conteudo {
    
    // ##################################################################
    /* 
    * protected - permite os filhos de conteudo acessar a variavel
    * final - representa uma constante cujo valor não pode ser mudado;
    * static - permite o acesso fora dessa classe (Conteudo);
    */
    // ##################################################################
    
    protected static final double XP_PADRAO = 10d;
    
    private String titulo;
    private String descricao;
    
    // ##################################################################
    // Metodo abstract - 
    public abstract double calcularXP();
    // ##################################################################
    
    // ##################################################################
    // Getters and Setters
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
    
    // ##################################################################
    
}
