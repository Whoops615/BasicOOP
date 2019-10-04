package by.htp.home.main;

import by.htp.home.main.Calendar.Day;
import by.htp.home.main.Calendar.Mount;
import by.htp.home.main.Calendar.Week;

public class Main {

	public static void main(String[] args) {

		Calendar c = new Calendar();

		Week w1 = c.new Week();
		w1.add(c.new Day(1, TitleDay.MONDAY, true, false));
		w1.add(c.new Day(2, TitleDay.THURSDAY, false, false));
		w1.add(c.new Day(3, TitleDay.WEDNESDAY, false, false));
		w1.add(c.new Day(4, TitleDay.THURSDAY, false, false));
		w1.add(c.new Day(5, TitleDay.FRIDAY, false, false));
		w1.add(c.new Day(6, TitleDay.SATURDAY, false, true));
		w1.add(c.new Day(7, TitleDay.SUNDAY, true, true));

		Week w2 = c.new Week();
		w2.add(c.new Day(8, TitleDay.MONDAY, false, false));
		w2.add(c.new Day(9, TitleDay.THURSDAY, false, false));
		w2.add(c.new Day(10, TitleDay.WEDNESDAY, false, false));
		w2.add(c.new Day(11, TitleDay.THURSDAY, false, false));
		w2.add(c.new Day(12, TitleDay.FRIDAY, false, false));
		w2.add(c.new Day(13, TitleDay.SATURDAY, false, true));
		w2.add(c.new Day(14, TitleDay.SUNDAY, false, true));

		Week w3 = c.new Week();
		w3.add(c.new Day(15, TitleDay.MONDAY, false, false));
		w3.add(c.new Day(16, TitleDay.THURSDAY, false, false));
		w3.add(c.new Day(17, TitleDay.WEDNESDAY, false, false));
		w3.add(c.new Day(18, TitleDay.THURSDAY, false, false));
		w3.add(c.new Day(19, TitleDay.FRIDAY, false, false));
		w3.add(c.new Day(20, TitleDay.SATURDAY, false, true));
		w3.add(c.new Day(21, TitleDay.SUNDAY, false, true));

		Week w4 = c.new Week();
		w4.add(c.new Day(22, TitleDay.MONDAY, false, false));
		w4.add(c.new Day(23, TitleDay.THURSDAY, false, false));
		w4.add(c.new Day(24, TitleDay.WEDNESDAY, false, false));
		w4.add(c.new Day(25, TitleDay.THURSDAY, false, false));
		w4.add(c.new Day(26, TitleDay.FRIDAY, false, false));
		w4.add(c.new Day(27, TitleDay.SATURDAY, false, true));
		w4.add(c.new Day(28, TitleDay.SUNDAY, false, true));

		Mount m1 = c.new Mount("Januare");
		m1.add(w1);
		m1.add(w2);
		m1.add(w3);
		m1.add(w4);

		Week w5 = c.new Week();
		w5.add(c.new Day(1, TitleDay.MONDAY, false, false));
		w5.add(c.new Day(2, TitleDay.THURSDAY, false, false));
		w5.add(c.new Day(3, TitleDay.WEDNESDAY, false, false));
		w5.add(c.new Day(4, TitleDay.THURSDAY, false, false));
		w5.add(c.new Day(5, TitleDay.FRIDAY, false, false));
		w5.add(c.new Day(6, TitleDay.SATURDAY, false, true));
		w5.add(c.new Day(7, TitleDay.SUNDAY, false, true));

		Week w6 = c.new Week();
		w6.add(c.new Day(8, TitleDay.MONDAY, false, false));
		w6.add(c.new Day(9, TitleDay.THURSDAY, false, false));
		w6.add(c.new Day(10, TitleDay.WEDNESDAY, false, false));
		w6.add(c.new Day(11, TitleDay.THURSDAY, false, false));
		w6.add(c.new Day(12, TitleDay.FRIDAY, false, false));
		w6.add(c.new Day(13, TitleDay.SATURDAY, false, true));
		w6.add(c.new Day(14, TitleDay.SUNDAY, false, true));

		Week w7 = c.new Week();
		w7.add(c.new Day(15, TitleDay.MONDAY, false, false));
		w7.add(c.new Day(16, TitleDay.THURSDAY, false, false));
		w7.add(c.new Day(17, TitleDay.WEDNESDAY, false, false));
		w7.add(c.new Day(18, TitleDay.THURSDAY, false, false));
		w7.add(c.new Day(19, TitleDay.FRIDAY, false, false));
		w7.add(c.new Day(20, TitleDay.SATURDAY, false, true));
		w7.add(c.new Day(21, TitleDay.SUNDAY, false, true));

		Week w8 = c.new Week();
		w8.add(c.new Day(22, TitleDay.MONDAY, false, false));
		w8.add(c.new Day(23, TitleDay.THURSDAY, true, false));
		w8.add(c.new Day(24, TitleDay.WEDNESDAY, false, false));
		w8.add(c.new Day(25, TitleDay.THURSDAY, false, false));
		w8.add(c.new Day(26, TitleDay.FRIDAY, false, false));
		w8.add(c.new Day(27, TitleDay.SATURDAY, false, true));
		w8.add(c.new Day(28, TitleDay.SUNDAY, false, true));

		Mount m2 = c.new Mount("February");
		m2.add(w5);
		m2.add(w6);
		m2.add(w7);
		m2.add(w8);
		
		c.add(m1);
		c.add(m2);
		
		print(c);

	}

	public static void print(Calendar c) {
		for (Mount m : c.getMounts()) {
			System.out.println(m.getTitle());
			System.out.println("------------------------------------------------------------------------------");
			for (Week w : m.getWeeks()) {
				for (Day d : w.getDays()) {
					System.out.println(d.toString());
				}
			}
		}
	}

}
