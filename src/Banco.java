


import java.util.*;

public class Banco {
	private static List<Pessoa> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		Pessoa people = new Pessoa();
		people.setId(chaveSequencial++);
		people.setNome("Lucas");
		Pessoa people2 = new Pessoa();
		people2.setId(chaveSequencial++);
		people2.setNome("Sabrina");
		lista.add(people);
		lista.add(people2);
	}

	public void adiciona(Pessoa p) {
		p.setId(Banco.chaveSequencial++);
		Banco.lista.add(p);
	}
	
	public List<Pessoa> getPessoa(){
		return Banco.lista;
	}



}
