package aula;

import com.google.gson.Gson;

public class Main {
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Almada", "012", 31);
		
		Gson gson = new Gson();
		
		String strJson = gson.toJson(pessoa);
		
		System.out.println(strJson);
		
		String mikael = "{\"nome\":\"Mikael\",\"cpf\":\"123\",\"idade\":20}\n"
				+ "";
		
		Pessoa pessoa2 = gson.fromJson(mikael, Pessoa.class);
		
		System.out.println(pessoa2);
	}
}
