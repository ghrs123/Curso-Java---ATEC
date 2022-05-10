public class TesteEnumerados {
 
    public static void main(String[] args) {


         DiaSemana dia = DiaSemana.valueOf("SEGUNDA");


         DiaSemana[] arrayDiasSemana = DiaSemana.values();
 
        for(int i = 0; i < arrayDiasSemana.length; i++){

             System.out.println(arrayDiasSemana[i] + "-" + arrayDiasSemana[i].getDiaEmIngles()  + "-"

                     + arrayDiasSemana[i].getDiaEmEspanhol() );

         }


         System.out.println(dia.getDiaNumero() + " " + dia.getDiaEmEspanhol());
       // DiaSemana novo = DiaSemana.valueOf("TERÇA");
     }
 
}