public class Automovel {


     // variaveis de instância = atributos

     private int km;

     private String cor;

     private String matricula;


     private static int totalAutomoveis = 0;



     // método construtor

     public Automovel(int km, String cor, String matricula){         


         this.km = km;

         this.cor = cor;

         this.matricula = matricula;

         this.totalAutomoveis ++;

     }


     public static int getTotalAutomoveis(){

         return totalAutomoveis;

     }



     /*Metodos getters*/


     /* getter para devolver a matricula*/

     public String getMatricula(){

         return matricula;

     }



     public String getCor(){

         return cor;

     }


     public int getKm(){

         return km;

     }



     //Setter


     public void setMatricula(String novaMatricula){

         matricula = novaMatricula;

     }


     public void setKm(int km){

         this.km = km;

     }




     // metodo = Operação

     void circular(int kilometros){


         km = km + kilometros; 

         // km += kilometros;


     }
 
 
    

     public String toString(){

         return "Matricula: " + matricula + "\nCor: " + cor + "\nKM:" + km ;

     }
 
}