
package arrayobjeto;


public class Carros {
    
    private String nome;
    private int ano;
    private float preco;
    
    public Carros(String nome , int ano , float preco)
    {
        this.nome = nome;
        this.ano = ano;
        this.preco = preco;
    }
    
    
    
    public String imprimirCarros()
    {
        String dados = "";
        dados += "\nnome :" + this.getNome() + "\nano :" + this.getAno() + "\npreco :" + this.getPreco();
        dados +="\n------------------------------------------------\n";  
        return dados;
    }

    
    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public float getPreco() {
        return preco;
    }
            
    
    
    
    
}
