public class App2 {
 
    public static void main(String[] args) {


         StandAutomovel standAbdulay = new StandAutomovel(50,"Stand Adbdulay");


         Automovel carroDuarte = new Automovel(10000,"Cinzento","95-ZE-09");


         standAbdulay.adicionaAutomovel(carroDuarte);


         Automovel carroMariana = new Automovel(2500,"Branco","65-MA-87");


         standAbdulay.adicionaAutomovel(carroMariana);


         System.out.println(standAbdulay);
 
    }
 
}