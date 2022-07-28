package Bootcamp.br;

import java.time.LocalDate;

import Bootcamp.br.com.dio.desafio.dominio.Bootcamp;
import Bootcamp.br.com.dio.desafio.dominio.Curso;
import Bootcamp.br.com.dio.desafio.dominio.Dev;
import Bootcamp.br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        
        
        // ##################################################################
        //Criando uma instancia de Curso, chamada de curso1;
        //Atrbuindo um titulo e uma descrição ao Curso. Pra isso usa o metodo set;
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso 1 - Java");
        curso1.setDescricao("Entenda POO");
        curso1.setCargaHoraria(8);
        // ##################################################################
        
        // ##################################################################
        //Criando uma instancia de Curso, chamada de curso2;
        //Atrbuindo um titulo e uma descrição ao Curso. Pra isso usa o metodo set;
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso 2 - Python");
        curso2.setDescricao("Entenda Python");
        curso2.setCargaHoraria(10);
        // ##################################################################


        // ##################################################################
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria sobre POO");
        mentoria.setData(LocalDate.now()); //atribui a data da criação do momento que foi criada;
        // ##################################################################
        
        // ##################################################################
        //Importante: Objetos não podem ser instanciados a partir de uma classe abstrata; 
        //Conteudo cont - new Conteudo();
        // Para isso se usa o POLIMORFISMO;
        //Conteudo conteudo = new Curso();
        
        // ##################################################################
        
        // ##################################################################
        //Printing created Curses
        System.out.println(" ### RELAÇÃO DE CURSO(S) ###\n");
        System.out.println("--------------------------------------------");
        System.out.println("# " + curso1);
        System.out.println("--------------------------------------------");
        System.out.println("# " + curso2);
        System.out.println("--------------------------------------------\n");
        // ##################################################################
        
        // ##################################################################
        //Imprimindo dados da mentoria;
        System.out.println(" ### RELAÇÃO DE MENTORIA(S) ###\n");
        System.out.println(mentoria);
        System.out.println("--------------------------------------------");
        // ##################################################################
        
        
        // ##################################################################
        // Criando um bootcamp;
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        // ##################################################################
        
        // ##################################################################
        // Inserindo Devs
        System.out.println("\n--------------------------------------------");
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        devCamila.progredir();
        devCamila.progredir();

        System.out.println("Conteudos Inscritos de " + devCamila.getNome() + "\n" + devCamila.getConteudosInscritos());
        System.out.println("Conteudos  Concluidos de " + devCamila.getNome() + "\n" + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXP());
        
        System.out.println("--------------------------------------------");
        
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        
        System.out.println("Conteudos Inscritos de " + devJoao.getNome() + "\n" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos de " + devJoao.getNome() + "\n" + devJoao.getConteudosConcluidos());
        System.out.println("--------------------------------------------");
        System.out.println("XP: " + devJoao.calcularTotalXP());
        // ##################################################################
    }
}
