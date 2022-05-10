import java.util.ArrayList;
import java.util.List;
public class AulaArrayList {

	public static void main(String[] args) {
		
		String [] arrayInt = new String[10];
		
		arrayInt[0] = "Gustavo";
		
		/*ArrayList*/
		
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Gustavo");
		arrayList.add("Maria");
		arrayList.add("Pedro");
		arrayList.add(0,"Guilherme");
		arrayList.add(2,"Pedro");
		arrayList.add("Maria");
		//arrayList.clear(); -  Limpa o conteudo do array
		//arrayList.remove(2);
		//arrayList.remove(0);
		//System.out.println(arrayList.get(0));
		System.out.println(arrayList.size()); //numero de elementos que a lista possui
		
		arrayList.set(0, "João");
		
		for(String e: arrayList) {
			System.out.print(e + " ");
		}
	}

}
