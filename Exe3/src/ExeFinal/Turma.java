package ExeFinal;

import java.util.Arrays;

public class Turma {


     private final int NUMERO_MAX_ALUNOS = 3;

     private int numTotalAlunos = 0;


     private String[] turma;


     public Turma() {

         turma = new String[NUMERO_MAX_ALUNOS];

     }


     public void adicionaAluno(String aluno) {

         if (numTotalAlunos >= turma.length)    

         {    

             throw new IllegalArgumentException("Não é possivel inserir o aluno.Turma Cheia");

         }    

         turma[numTotalAlunos++] = aluno;

     }
 
    @Override

     public String toString() {

         return "Turma [NUMERO_MAX_ALUNOS=" + NUMERO_MAX_ALUNOS + ", numTotalAlunos=" + numTotalAlunos + ", turma="

                 + Arrays.toString(turma) + "]";

     }

 
}