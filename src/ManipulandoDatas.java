import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class ManipulandoDatas {

	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();
		// aumentando para +1 dia
		LocalDate amanha = hoje.plusDays(1);

		System.out.println(amanha);

		// Descobrindo números de dias até uma data
		MonthDay natal = MonthDay.of(Month.DECEMBER, 25);
		LocalDate natalDesseAno = natal.atYear(Year.now().getValue());
		long diasAteONatal = LocalDate.now().until(natalDesseAno, ChronoUnit.DAYS);

		System.out.println(diasAteONatal);

		System.out.println();
		System.out.println("Descobrindo a próxima Sexta-feira");
		TemporalAdjuster ajustadorParaProximaSexta = TemporalAdjusters.next(DayOfWeek.FRIDAY);
		LocalDate proximaSexta = LocalDate.now().with(ajustadorParaProximaSexta);
		System.out.println(proximaSexta);
	}

}
