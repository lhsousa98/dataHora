import java.time.Month;
import java.time.MonthDay;
import java.time.YearMonth;

public class Data_E_Meses {

	public static void main(String[] args) {

		MonthDay natal = MonthDay.of(Month.DECEMBER, 25);
		// Dia importante mundial
		YearMonth copaDoMundo2014 = YearMonth.of(2014, Month.JUNE);
		
		System.out.println(natal);
		System.out.println(copaDoMundo2014);
	}
}
