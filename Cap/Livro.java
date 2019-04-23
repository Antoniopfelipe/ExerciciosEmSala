package Cap;

public class Livro {

	String nome;
	String descricao;
    double valor;
    String isnb;
    Autor autor;
    
    void mostrarDetalhes() {
    	
    	System.out.println("--");
    	System.out.println("Mostrando detalhes do livro");
    	System.out.println("Nome: "+ nome);
    	System.out.println("Descricao: "+descricao);
    	System.out.println("Valor: "+valor);
    	System.out.println("ISNB: "+isnb);
    	System.out.println("--");
    }
	
    
}
