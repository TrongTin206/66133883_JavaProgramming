
public class Time {
	private int hour;
    private int minute;
    private int second;

    public Time(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int h) {
        hour = h;
    }

    public void setMinute(int m) {
        minute = m;
    }

    public void setSecond(int s) {
        second = s;
    }

    public void setTime(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
    }

    public Time nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    public Time previousSecond() {
        second--;
        if (second < 0) {
            second = 59;
            minute--;
            if (minute < 0) {
                minute = 59;
                hour--;
                if (hour < 0) {
                    hour = 23;
                }
            }
        }
        return this;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
