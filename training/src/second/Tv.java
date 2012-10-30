package second;

public class Tv {
	
	int channel;
	int volume;
	Boolean power;
	
	void channelUp(){
		channel++;
	}
	void channelDown(){
		channel--;
	}
	void volumeUp(){
		volume++;
	}
	void volumeDown(){
		volume--;
	}
	void powerOn(){
		power = true;
	}
	void powerOff(){
		power = false;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public Boolean getPower() {
		return power;
	}
	public void setPower(Boolean power) {
		this.power = power;
	}
	
	public Tv(int channel, int volume, Boolean power) {
		super();
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	@Override
	public String toString() {
		return "Tv [channel=" + channel + ", volume=" + volume
				+ ", power=" + power + "]";
	}
}
