public class App
{
    public static void main(String[] args)
    {
        Pessoa primeiraPessoa = new Pessoa("João", 1.75, 73.5, "012345678");
        Pessoa segundaPessoa = new Pessoa("Pedro", 1.57, 74, "123456789");
        Pessoa terceiraPessoa = new Pessoa("Ana", 1.89, 63, "523195322");
        System.out.println(primeiraPessoa.getNome() + " - " + primeiraPessoa.getPeso());
        primeiraPessoa.ingereComida(.5);
        System.out.println(primeiraPessoa.getNome() + " - " + primeiraPessoa.getPeso());
        System.out.println(primeiraPessoa.compararPesos(primeiraPessoa, segundaPessoa));
        System.out.println(primeiraPessoa.compararPesos(primeiraPessoa, terceiraPessoa));
        System.out.println(primeiraPessoa.compararPesos(terceiraPessoa));
    }
}