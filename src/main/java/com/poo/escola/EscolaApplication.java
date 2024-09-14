package com.poo.escola;

import com.poo.escola.entidade.Aluno;
import com.poo.escola.entidade.Disciplina;
import com.poo.escola.entidade.Menu;
import com.poo.escola.entidade.Professor;
import com.poo.escola.entidade.Secretaria;
import com.poo.escola.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EscolaApplication {

	public static void main(String[] args)  {
		SpringApplication.run(EscolaApplication.class, args);

		Disciplina.popularDisciplinas();
		Secretaria.semearSecretario();
		Aluno.popularAlunos();
		Professor.semearProfessores();
		Menu.menuFinal();

		//na hora de escolher o indice, lembre-se numero 1 pra indice 0 e assim por diante.
		//na hora de lançar a nota como professor va no seedTeacher pega o login que é o email,
		//e a senha, depois pra lançar a nota passando pelos indices mande-a com virgula 9,2 por exemplo
		//e nao 9.2 pois se nao retorna nulo.

		//depois de umas 3 horas pra descobrir o erro do por que o arquivo nao era lido
		//descobrimos que era pq chama name na gravação e na leitura chamava email
		//porem ele nao queria ler tambem por que faltava chamar o this.notes que tava errado
		//3 horas de pensamento e ranger de dentes por pouca coisa, e tambem tinha que instanciar lista
		//de notas tanto em disciplina quanto em aluno.

	}


}
