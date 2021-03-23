package lab3;

import java.time.LocalDate;
import java.time.Period;


public class Exercise3_9 {
	static void dateDuration(LocalDate dd)
	{
		LocalDate sysDate=LocalDate.now();
		Period p=Period.between(sysDate, dd);
		System.out.println("Years " +p.getYears());
		System.out.println("Months " +p.getMonths());
		System.out.println("Days " +p.getDays());
    }

	public static void main(String[] args) {
		 LocalDate date1 = LocalDate.of(2022,6,21); 
		dateDuration(date1);
		}

}
