import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
            curso1.setTitulo("Curso Java");
            curso1.setDescricao("Descrevendo curso java");
            curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrevendo curso javascript");
        curso2.setCargaHoraria(4);

        /*exemplo de polimorfismo:
        Conteudo conteudo = new Curso();*/


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrevendo a mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição: Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devHelena = new Dev();
        devHelena.getNome("Helena");
        devHelena.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devHelena.getConteudosInscritos());
        System.out.println("Conteúdos concluídos" + devHelena.getConteudosConcluídos());
        devHelena.progredir();
        System.out.println("_");
        System.out.println("Conteúdos inscritos" + devHelena.getConteudosInscritos());
        System.out.println("Conteúdos concluídos" + devHelena.getConteudosConcluídos());
        System.out.println("XP: " + devHelena.calcularXP());
        System.out.println("XP: " + devHelena.calcularXP());

        System.out.println("_");

        Dev devJoao = new Dev();
        devJoao.getNome("Jão");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("_");
        System.out.println("Conteúdos inscritos" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos" + devJoao.getConteudosConcluídos());
        System.out.println("XP: " + devJoao.calcularXP());

    }
}
