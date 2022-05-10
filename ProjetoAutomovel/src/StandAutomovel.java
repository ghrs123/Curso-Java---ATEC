public class StandAutomovel {


     private Automovel[] standVendas;

     private int nTotalAutomoveis = 0;

     private String nomeStand;



     public StandAutomovel(int capacidadeStand, String nome){

         standVendas = new Automovel[capacidadeStand];

         this.nomeStand = nome;

     }


     // Metodo para adicionar um novo automovel ao meu stand

     public void adicionaAutomovel(Automovel novoAutomovel){

         standVendas[nTotalAutomoveis] = novoAutomovel;

         nTotalAutomoveis++;

     }



     public String toString(){


         String texto = "";


         texto = "Nome do Stand: " + nomeStand + "\nNumero total de Automoveis: "

         + nTotalAutomoveis + "\n";
 
       for(int i = 0; i < nTotalAutomoveis; i++){

            texto = texto + standVendas[i].toString() + "\n";

        }


        return texto;

     } 

 
}