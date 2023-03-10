public class ProgramarTurma{
    public static void main(String[] args){

        Turma ads = new Turma();
        ads.semestre = 3;
        ads.numSala = 208;
        ads.alaPredio = "2-b";
        ads.numTurma = 1;

        ads.aluno.nome = "Geovane";
        ads.aluno.cpf = "111.111.111-11";
        ads.aluno.idade = 18;
        System.out.println(ads.numTurma);
        System.out.println(ads.aluno.nome);
    }
}