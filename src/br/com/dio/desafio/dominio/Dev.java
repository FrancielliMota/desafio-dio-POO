package br.com.dio.desafio.dominio;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new HashSet<>();
    private Set<Conteudo> conteudosConcluídos = new HashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){};
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);

    public void progredir(){};
        this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluídos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
    }   else{
            System.err.println("Matrícula não realizada no módulo");
    }
    public double calcularXP(){
            return this.conteudosConcluídos
                    .stream()
                    .mapToDouble(Conteudo::calcularXP)
                    .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluídos() {
        return conteudosConcluídos;
    }

    public void setConteudosConcluídos(Set<Conteudo> conteudosConcluídos) {
        this.conteudosConcluídos = conteudosConcluídos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluídos, dev.conteudosConcluídos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluídos);
    }
}
