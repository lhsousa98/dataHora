import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class DataParaHumanos {

	public static void main(String[] args) {

		// Data atual LocalData, tudo que não importa hora uso ele
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje); // 2020-01-14

		// Determinando eu mesmo a data
		System.out.println();
		System.out.println("Colocando data de nascimento");
		LocalDate emissaoRG = LocalDate.of(1998, 9, 26);
		System.out.println(emissaoRG);

		System.out.println();
		System.out.println("Calculando a duração entre periodos");
		LocalDate homemNoEspaco = LocalDate.of(1961, Month.APRIL, 12);
		LocalDate homemNaLua = LocalDate.of(1969, Month.MAY, 25);

		Period periodo = Period.between(homemNoEspaco, homemNaLua);

		System.out.printf("%s anos, %s mês e %s dias %n", periodo.getYears(), periodo.getMonths(), periodo.getDays());

		System.out.println();
		System.out.println("Horário");
		LocalTime horarioDeEntrada = LocalTime.of(9, 0);
		System.out.println(horarioDeEntrada); // 09:00

		// Tudo que for em tempo real utilizar o now
		System.out.println();
		System.out.println("Data e hora");
		LocalDateTime dataHoraAtual = LocalDateTime.now();
		System.out.println(dataHoraAtual);
		System.out.println();
		LocalDateTime aberturaDaCopa = LocalDateTime.of(2014, Month.JUNE, 12, 17, 0);
		System.out.println(aberturaDaCopa); // (formato ISO-8601)
	}
}
