
 public class App {
 
    public static void main(String[] args) {


         Automovel objCarroPreto =  new Automovel(10000,"Preto","98-LC-08");


         //System.out.println("Impressão do Objeto: \n" + objCarroPreto.toString());
 
        


         //System.out.println(objCarroPreto.getMatricula() + " " + objCarroPreto.getKm());



         Automovel objCarroVermelho =  new Automovel(20500,"Vermelho","00-MM-12");



         System.out.println("Numero total de Automoveis: " + Automovel.getTotalAutomoveis());


         System.out.println(Math.pow(2, 3));


         /*

         objCarroVermelho.setKm(0);


         System.out.println("Km do Carro Vermelho: " + objCarroVermelho.getKm() );

         */

     }
 
}