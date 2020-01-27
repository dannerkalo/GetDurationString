package getdurationstring;

import java.util.Date;

public class GetDuration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Playing with method overlod
		System.out.print(getDurationString(65,45));
	}

	private static String getDurationString(long minutes, long seconds) {

		if ((minutes < 0) || ((seconds < 0) || (seconds > 59))) {
			return "Invalid Value";
		}

		long hours = (minutes / 60);
		long minutez = (minutes % 60);
		String duration = hours + "h\n" + minutez + "m\n" + seconds + "s";

		return duration;
	}

	private static String getDurationString(long seconds) {

		if (seconds < 0) {
			return "Invalid Value";
		}

		long minutez = (seconds / 60);
		long remainingSeconds = (seconds % 60);
		String duration = getDurationString(minutez, remainingSeconds);

		return duration;
	}

}
