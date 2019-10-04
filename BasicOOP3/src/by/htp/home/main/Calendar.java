package by.htp.home.main;

import java.util.ArrayList;
import java.util.List;

public class Calendar {

	private List<Mount> mounts;

	public Calendar() {
		mounts = new ArrayList<Mount>();
	}

	public void add(Mount newMount) {
		mounts.add(newMount);
	}

	public List<Mount> getMounts() {
		return mounts;
	}

	public void setMounts(List<Mount> mounts) {
		this.mounts = mounts;
	}

	class Mount {
		private List<Week> weeks;
		private String title;

		public Mount(String title) {
			weeks = new ArrayList<Week>();
			this.title = title;
		}

		public void add(Week newWeek) {
			weeks.add(newWeek);
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public List<Week> getWeeks() {
			return weeks;
		}

		public void setWeeks(List<Week> weeks) {
			this.weeks = weeks;
		}
	}

	class Week {
		private List<Day> days;

		public Week() {
			days = new ArrayList<Day>();
		}

		public void add(Day newDay) {
			days.add(newDay);
		}

		public List<Day> getDays() {
			return days;
		}

		public void setDays(List<Day> days) {
			this.days = days;
		}

	}

	class Day {
		private int nunber;
		private TitleDay titleDay;
		private boolean holiday;
		private boolean dayOff;

		public Day(int nunber, TitleDay titleDay, boolean holiday, boolean dayOff) {
			this.nunber = nunber;
			this.titleDay = titleDay;
			this.holiday = holiday;
			this.dayOff = dayOff;
		}

		public int getNunber() {
			return nunber;
		}

		public void setNunber(int nunber) {
			this.nunber = nunber;
		}

		public TitleDay getTitleDay() {
			return titleDay;
		}

		public void setTitleDay(TitleDay titleDay) {
			this.titleDay = titleDay;
		}

		public boolean isHoliday() {
			return holiday;
		}

		public void setHoliday(boolean holiday) {
			this.holiday = holiday;
		}

		public boolean isDayOff() {
			return dayOff;
		}

		public void setDayOff(boolean dayOff) {
			this.dayOff = dayOff;
		}

		@Override
		public String toString() {
			return "Day [nunber=" + nunber + ", titleDay=" + titleDay + ", holiday=" + holiday + ", dayOff=" + dayOff
					+ "]";
		}

	}

}
