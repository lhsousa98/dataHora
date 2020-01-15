import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormatandoDatas {

	public static void main(String[] args) {

		System.out.println("Formatando Horário");
		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		hoje.format(formatador);

		System.out.println(hoje);

		System.out.println();
		System.out.println("Data e Hora Local");

		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter formatador1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)
				.withLocale(new Locale("pt", "br"));
		agora.format(formatador1);
		
		System.out.println(agora);
	}
}
