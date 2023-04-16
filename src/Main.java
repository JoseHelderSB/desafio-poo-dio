import java.time.LocalDate;

import desafio.dominio.Curso;
import desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Japonês");
        curso1.setDescricao("Curso para aprender japonês");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Coreano");
        curso2.setDescricao("Curso para aprender coreano");
        curso2.setCargaHoraria(8);
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de japonês");
        mentoria.setDescricao("Descrição da mentoria");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }
}
