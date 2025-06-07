
public class TesteAluno {
    public static void main(String[] args) {
    Aluno aluno1 = new Aluno();
    aluno1.nome= "Letícia";
    aluno1.nota1 = 9;
    aluno1.nota2 = 8;

    Aluno aluno2 = new Aluno();
    aluno2.nome = "Alice";
    aluno2.nota1 = 10;
    aluno2.nota2 = 6;

        System.out.println(aluno1.nome + " tem média: " + aluno1.calcularMedia());
        System.out.println(aluno2.nome + " tem média: " + aluno2.calcularMedia());
    }
}