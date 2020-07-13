
package arrayobjeto;


public class ArrayCarros {
    
    //atributos
    Carros [] vetor;
    int posicao;
    
    
    
    // construtor
    public ArrayCarros(int tamanho)
    {
        vetor = new Carros[tamanho];
        posicao = 0;
    }
    
    
    // metodos
    public void adicionarCarros(Carros c)
    {
        vetor[posicao] = c;
        posicao++;
    }
    
    
    
    public String mostrarCarros()
    {
        String dados = "";
        for(Carros v : vetor)
        {
            dados += v.imprimirCarros();
        }
        return dados;
    }
    
    
    
}
