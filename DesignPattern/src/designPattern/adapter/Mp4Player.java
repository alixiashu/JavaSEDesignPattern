package designPattern.adapter;

public class Mp4Player implements AdvancedMediaPlayer{

	@Override
	public void playMp4(String filePath) {
		System.out.println("Play mp4 file...");
	}

	@Override
	public void playVlc(String filePath) {
		// TODO Auto-generated method stub
	}

}
