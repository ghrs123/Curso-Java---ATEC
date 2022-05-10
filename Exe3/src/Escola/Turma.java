package Escola;

public class Turma {
	
	    private Aluno[] aluno;
	
	    private int nAlunos=0;
	
	    private String nomeTurma;
	
	public Turma(String nomeTurma, int tamanhoTurma) {
	
	    this.nomeTurma=nomeTurma;
	
	    aluno = new Aluno[tamanhoTurma];
	
	
	}
	
	public void insereAluno(String nome, String cartaoCidadao) 
	
	{
	
	
	        if(turmaCheia()== false)//if(!turmaCheia())
	
	        {
	
	            aluno[nAlunos]= new Aluno(nome,cartaoCidadao);
	
	            nAlunos++;
	
	       }
	
	}
	
	/*public void insereAlunoComValidacao(String nome, String cartaoCidadao) 
	
	{
	
	        for(int i=0; i< nAlunos; i++) 
	
	        {
	
	            if(cartaoCidadao.equalsIgnoreCase(aluno[i].getCartaoCidadao())) {
	
	                return;
	
	            }
	
	
	        }
	
	        if(turmaCheia()== false)//if(!turmaCheia())
	
	        {
	
	            aluno[nAlunos]= new Aluno(nome,cartaoCidadao);
	
	            nAlunos++;
	
	       }
	
	
	}*/
	
	
	
	
	public boolean turmaCheia() {
	
	    return nAlunos >= aluno.length;
	
	    // A solucao alternativa
	
	    /*if(nAlunos >= aluno.length) {
	
	        return true;
	
	    }
	
	    else {
	
	        return false;
	
	    }*/
	
	}
	
	public void retiraAluno( String cartaoCidadao) {
		for(int i = 0; i<=nAlunos; i++) {
			if( cartaoCidadao.equals(aluno[i].getCartaoCidadao()) ) {
				
				this.aluno[i] = aluno[nAlunos];
				aluno[nAlunos] = null;
				nAlunos--;
				return;
			}
		}
		
	}
	
	
	public String toString() {
	
	    String text;
	
	    text="Turma: " + nomeTurma + "\n" + nAlunos;
	
	    for(int i=0; i< nAlunos; i++) 
	
	    {
	
	        text+=aluno[i].toString();
	
	    }
	
	    return text;
	
	}




}