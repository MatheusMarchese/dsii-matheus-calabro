import java.util.Date;

public class EscolaMain {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Jose Francisco", "123.456.789-00", new Date(), "12345");
        Professor professor = new Professor("Maria Silva", "987.654.321-00", new Date(), 3500.00, "Matemática");
        Funcionario funcionario = new Funcionario("João Santos", "456.123.789-00", new Date(), 2000.00, "Secretário", new Date());

        System.out.println("Nome: " + aluno.nome + " | Valor gasto com 100 cópias: R$" + aluno.tirarCopias(100));
        System.out.println("Nome: " + professor.nome + " | Valor gasto com 100 cópias: R$" + professor.tirarCopias(100));
        System.out.println("Nome: " + funcionario.nome + " | Valor gasto com 100 cópias: R$" + funcionario.tirarCopias(100));
    }
}