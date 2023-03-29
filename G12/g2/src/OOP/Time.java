package OOP;

public class Time {
	private int hour, minute, second;

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public Time(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	public Time nextSecond()
	{
		Time nc = new Time(hour, minute, second);
		if(second < 59)
			nc.second++;
		else {
			nc.second = 0;
			if (minute <59)
				nc.minute++;
			else 
			{
				nc.minute = 0;
				if(hour <23)
					nc.hour++;
				else {
					nc.hour = 0;
				}
			}
		}		
		return nc;
	}	
	public Time previousSecond() {
		Time pc = new Time(hour, minute, second);
		if (second > 0)
			pc.second--;
		else {
			pc.second = 59;
			if(minute > 0) {
				pc.minute--;
			} else {
				pc.minute = 59;
				if(hour > 0)
					pc.hour--;
				else 
					pc.hour = 23;
			}
		}
		return pc;
	}
	
	
}
