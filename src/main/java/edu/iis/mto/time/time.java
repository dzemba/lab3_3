package edu.iis.mto.time;
import org.joda.time.DateTime;
public class time implements fakeTime {
	@Override
	public DateTime now() {
		return new DateTime();
	}

}