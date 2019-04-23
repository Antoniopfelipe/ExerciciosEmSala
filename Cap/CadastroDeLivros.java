package Cap;

public class CadastroDeLivros {
	   
	
	   public static void main (String[] args) {
		   
		   Autor autor = new Autor();
		   autor.nome = "Rodrigo Turini";
		   autor.email = "rodrigo.turini@caelum.com.br";
		   autor.cpf = "415.326.569-0";
		   
		   
		   Livro livro = new Livro();
		   livro.nome = "Java 9";
		   livro.descricao = "Recursos";
		   livro.valor = 59.9;
		   livro.isnb = "985-25-56220-46-6";
		   
		   
		   autor.dadosDoAutor();
		   livro.mostrarDetalhes();
		   
		   Autor outroAutor = new Autor();
		   outroAutor.nome = "Thais Marreiro";
		   outroAutor.email = "thsmarreiro1993@gmail.com";
		   outroAutor.cpf = "422.256.788-47";
		   
		   Livro outroLivro = new Livro();
		   outroLivro.nome = "Lógica de programação";
		   outroLivro.descricao = "Crie seus primeiros programas";
		   outroLivro.valor = 66.45;
		   outroLivro.isnb = "978-46-66211-88-0";
		   
		   
		   
		   outroAutor.dadosDoAutor();		   
		   outroLivro.mostrarDetalhes();
		   
		   
	   }

}
