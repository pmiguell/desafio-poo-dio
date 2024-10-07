import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java básico");
        curso1.setDescricao("Entendendo os fundamentos do Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java intermediário");
        curso2.setDescricao("Trabalhando com Spring");
        curso2.setCargaHoraria(20);

        Curso curso3 = new Curso();
        curso3.setTitulo("Java avançado");
        curso3.setDescricao("Trabalhando com Design Patterns e AWS");
        curso3.setCargaHoraria(10);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Aqui você aprenderá mais sobre o mundo Java!");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);

        Dev developer1 = new Dev();
        developer1.setNome("João");
        developer1.inscreverNoBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de João: " + developer1.getConteudosInscritos());
        developer1.progredir();
        developer1.progredir();
        developer1.progredir();
        System.out.println("Conteúdos inscritos de João: " + developer1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de João: " + developer1.getConteudosConcluidos());
        System.out.println("XP de João: " + developer1.calcularTotalXp());

        System.out.println("-------------------");

        Dev developer2 = new Dev();
        developer2.setNome("Maria");
        developer2.inscreverNoBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Maria: " + developer2.getConteudosInscritos());
        developer2.progredir();
        System.out.println("Conteúdos inscritos de Maria: " + developer2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Maria: " + developer2.getConteudosConcluidos());
        System.out.println("XP de Maria: " + developer2.calcularTotalXp());
    }
}