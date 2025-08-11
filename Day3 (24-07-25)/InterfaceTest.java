package Day4;

public class InterfaceTest {

	public static void main(String[] args) {
		Playable playAudio = new AudioPlayer();
		Recordable recordAudio = new AudioPlayer();
		playAudio.play();
		recordAudio.record();
		System.out.println("**********");

		Playable playVideo = new VideoPlayer();
		Streamable streamVideo = new VideoPlayer();
		playVideo.play();
		streamVideo.stream();
		System.out.println("**********");

		Recordable recordCamera = new Camera();
		Streamable streamCamera = new Camera();
		recordCamera.record();
		streamCamera.stream();

	}

}
