public class Pessoa
{
    private String nome;
    private double altura;
    private double peso;
    private String cartaoCidadao;
    public Pessoa(String nome, double altura, double peso, String cartaoCidadao)
    {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.cartaoCidadao = cartaoCidadao;
    }
    public String getNome()
    {
        return nome;
    }
    public double getAltura()
    {
        return altura;
    }
    public double getPeso()
    {
        return peso;
    }
    public String getCartaoCidadao()
    {
        return cartaoCidadao;
    }
    public void ingereComida(double pesoComida)
    {
        peso += pesoComida;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public void setAltura(double altura)
    {
        this.altura = altura;
    }
    public void setPeso(double peso)
    {
        this.peso = peso;
    }
    public void setCartaoCidadao(String cartaoCidadao)
    {
        this.cartaoCidadao = cartaoCidadao;
    }
    public boolean compararPesos(Pessoa pessoa1, Pessoa pessoa2)
    {
        return pessoa1.getPeso() == pessoa2.getPeso();
    }
    public boolean compararPesos(Pessoa pessoa)
    {
        return pessoa.getPeso() == this.peso;
    }
}