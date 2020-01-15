import java.time.Duration;
import java.time.Instant;

/**
 * 
 * @author lhsousa utilizando a biblioteca API JodaTime.
 */
public class DataParaComputadores {

	public static void main(String[] args) {

		// Instant hora data atual pega nos registros do computador tempo real
		Instant agora = Instant.now();
		System.out.println(agora);

		System.out.println();
		System.out.println("Medindo tempo de execução");
		Instant inicio = Instant.now();
		// posso utilizar método de algo que queira executar
		Instant fim = Instant.now();
		
		//Duration serve para medir tempo, segundos...
		Duration duracao = Duration.between(inicio, fim);
		long duracaoEmMilissegundos = duracao.toMillis();
		
		System.out.println(duracaoEmMilissegundos);
	}

}
