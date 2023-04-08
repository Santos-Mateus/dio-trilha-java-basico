import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Set;
import java.util.Collections;

public class ExemploOrdenacao {
	public static void main (String args[]){
		
		System.out.println("Meus Livros em Ordem Aleatória");
		
		Map<String, Livro> meusLivros = new HashMap<>(){{
			put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
			put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
			put("Harari, Yuval Noah", new Livro("21 Lições Para o Século", 432));
		}};
		
		for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
			
		System.out.println("\nMeus Livros em Ordem de Inserção");
		
		Map<String, Livro> meusLivros2 = new LinkedHashMap<>(){{
			put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
			put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
			put("Harari, Yuval Noah", new Livro("21 Lições Para o Século", 432));
		}};
		
		for (Map.Entry<String, Livro> livro : meusLivros2.entrySet())
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
			
		System.out.println("\nMeus Livros em Ordem Alfabética de Autores");
		
		Map<String, Livro> meusLivros3 = new TreeMap<>(meusLivros2);
		
		for (Map.Entry<String, Livro> livro : meusLivros3.entrySet())
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
			
		System.out.println("\nMeus Livros em Ordem Alfabética de Nome dos Livros");
		
		Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNome());
		meusLivros4.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros4)
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

		
		

        System.out.println("\nMeus Livros em Ordem de Total de Páginas");
        Set<Map.Entry<String, Livro>> meusLivros5 = new TreeSet<>(new ComparatorPaginas());
		meusLivros5.addAll(meusLivros.entrySet());        
        for (Map.Entry<String, Livro> livro : meusLivros5)
			System.out.println(livro.getKey() + " - " + livro.getValue().getPaginas());

	}
}

class Livro {
	private String nome;
	private Integer paginas;
	
	public Livro(String nome, Integer paginas){
		this.nome = nome;
		this.paginas  = paginas;
	}
	
	public String getNome(){
		return nome;
	}
	
	public Integer getPaginas() {
		return paginas;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		Livro Livro = (Livro) o;
		return nome.equals(Livro.nome) && paginas.equals(Livro.paginas);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, paginas);
	}
	
	@Override
	public String toString(){
		return "Livro{" +
				"nome'" + nome + '\'' +
				", paginas=" + paginas +
				'}';
	}
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());    
    }
}

class ComparatorPaginas implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> p1, Map.Entry<String, Livro> p2) {
        return p1.getValue().getPaginas().compareTo(p2.getValue().getPaginas());    
    }
}