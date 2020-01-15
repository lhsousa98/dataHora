import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DataComFusoHorario {

	public static void main(String[] args) {

		// utilizando recursos da classe ZoneDateTime

		ZoneId fusoHorarioDeSaoPaulo = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime agoraEmSaoPaulo = ZonedDateTime.now(fusoHorarioDeSaoPaulo);
		System.out.println("Fuso hor�rio SP => " + agoraEmSaoPaulo);

		System.out.println();
		System.out.println("Simulando tempo de v�o");

		ZoneId fusoHorarioDeSaoPaulo1 = ZoneId.of("America/Sao_Paulo");
		ZoneId fusoHorarioDeNovaYork = ZoneId.of("America/New_York");

		LocalDateTime saidaDeSaoPauloSemFusoHorario = LocalDateTime.of(2014, Month.APRIL, 4, 22, 30);
		LocalDateTime chegadaEmNovaYorkSemFusoHorario = LocalDateTime.of(2014, Month.APRIL, 5, 7, 10);

		ZonedDateTime saideDeSaoPauloComFusoHorario = ZonedDateTime.of(saidaDeSaoPauloSemFusoHorario,
				fusoHorarioDeSaoPaulo1);
		System.out.println(saideDeSaoPauloComFusoHorario);

		System.out.println();
		ZonedDateTime chegadaEmNovaYorkComFusoHorario = ZonedDateTime.of(chegadaEmNovaYorkSemFusoHorario,
				fusoHorarioDeNovaYork);
		System.out.println(chegadaEmNovaYorkComFusoHorario);

		// Dura��o do v�o
		System.out.println();
		Duration duracaoDoVoo = Duration.between(saideDeSaoPauloComFusoHorario, chegadaEmNovaYorkComFusoHorario);
		System.out.println(duracaoDoVoo); // PT9H40M

		System.out.println();
		System.out.println("Sem hor�rio de ver�o");
		ZoneId fusoHorarioDeSaoPaulo2 = ZoneId.of("America/Sao_Paulo");

		LocalDateTime fimDoHorarioDeVerao2013SemFusoHorario = LocalDateTime.of(2019, Month.FEBRUARY, 15, 23, 00);

		ZonedDateTime fimDoHorarioDeVerao2013ComFusoHorario = fimDoHorarioDeVerao2013SemFusoHorario
				.atZone(fusoHorarioDeSaoPaulo2);
		System.out.println(fimDoHorarioDeVerao2013ComFusoHorario);

		// C�digo continua sendo o mesmo por�m com uma hora a mais
		System.out.println();
		System.out.println("Com hor�rio de ver�o");
		ZonedDateTime maisUmaHora = fimDoHorarioDeVerao2013ComFusoHorario.plusHours(1);
		System.out.println(maisUmaHora);
	}

}
