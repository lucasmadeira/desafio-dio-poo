import br.com.lucasmadeira.dominio.*;

public class Main {
    public static void main(String[] args)  {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java 11");
        curso1.setDescricao("Curso de java 11");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Maven");
        curso2.setDescricao("Curso de Maven");
        curso2.setCargaHoraria(4);

        Conteudo mentoria = new Mentoria();
        mentoria.setTitulo("Abstraindo um bootcamp usando Orientacao Objetos");
        mentoria.setDescricao("Abstraindo um bootcamp usando Orientacao Objetos");



        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java developer");
        bootcamp.setDescricao("Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Java Developer 1");
        dev1.inscreverBootcamp(bootcamp);

        Dev dev2 = new Dev();
        dev2.setNome("Java Developer 2");
        dev2.inscreverBootcamp(bootcamp);

        while(dev1.getConteudosInscritos().isEmpty() == false || dev2.getConteudosInscritos().isEmpty() ==false){
            System.out.println("Conteudos Inscritos dev1:"+ dev1.getConteudosInscritos());
            System.out.println("Conteudos Concluidos dev1:"+ dev1.getConteudosConcluidos());

            System.out.println("Conteudos Inscritos dev2:"+ dev2.getConteudosInscritos());
            System.out.println("Conteudos Concluidos dev2:"+ dev2.getConteudosConcluidos());

            dev1.progredir();
            dev2.progredir();

            System.out.println("XP dev1:"+ dev1.calcularTotalXP());
            System.out.println("XP dev2:"+ dev2.calcularTotalXP());
        }

    }
}
