package Day4;

public class AudioPlayer implements Playable, Recordable {

	public void play() {
		System.out.println("AudioPlayer playing audio.");
	}

	public void record() {
		System.out.println("AudioPlayer recording audio.");
	}
}