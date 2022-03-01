import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição Curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCharles = new Dev();
        devCharles.setNome("Charles");
        devCharles.inscreverBootcamp(bootcamp);
        devCharles.progredir();

        Dev devNathalie = new Dev();
        devNathalie.setNome("Nathalie");
        devNathalie.inscreverBootcamp(bootcamp);
        devNathalie.progredir();
        devNathalie.progredir();

        System.out.println("Conteúdos Inscritos " + devCharles.getNome() + ": " + devCharles.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devCharles.getNome() + ": " + devCharles.getConteudosConcluidos());
        System.out.println("XP " + devCharles.getNome() + ": " + devCharles.calcularXp());
        System.out.println("Conteúdos Inscritos " + devNathalie.getNome() + ": " + devNathalie.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devNathalie.getNome() + ": " + devNathalie.getConteudosConcluidos());
        System.out.println("XP " + devNathalie.getNome() + ": " + devNathalie.calcularXp());
    }
}
