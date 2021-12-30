package exercises.questionsANDanswers.replit.oop;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class TvClass {
	int channel = 1;
	int volumeLevel = 1;
	boolean on = false;
	String brand = "undefined";

	public TvClass() {
	    System.out.println("Creating TV object using no args-constructor");
	  }

	public TvClass(String brand) {
	    this.brand = brand;
	    System.out.println("Creating TV object using 1 arg - constructor");
	  }

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if (channel > 0 && channel <= 120 && this.isOn()) {
			this.channel = channel;
		} else {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) {
		if (volumeLevel >= 1 && volumeLevel <= 7 && this.isOn()) {
			this.volumeLevel = volumeLevel;
		} else {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void channelUp() {
		++channel;
	}

	public void channelDown() {
		--channel;
	}

	public void volumeUp() {
		++volumeLevel;
	}

	public void volumeDown() {
		--volumeLevel;
	}

	public boolean isOn() {
		return on;
	}

	public void turnOn() {
		if (this.isOn()) {
			System.out.println("TV is already ON");
		} else {
			on = true;
		}
	}

	public void turnOff() {
		if (this.isOn()) {
			on = false;
		} else {
			System.out.println("TV is already OFF");
		}
	}

	@Override
	public String toString() {
		return "TV{" + "channel=" + channel + ", volumeLevel=" + volumeLevel + ", on=" + on + ", brand='" + brand + '\''
				+ '}';
	}
}
