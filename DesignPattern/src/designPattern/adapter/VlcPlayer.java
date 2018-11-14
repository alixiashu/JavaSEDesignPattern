package designPattern.adapter;

public class VlcPlayer implements AdvancedMediaPlayer{

	@Override
	public void playMp4(String filePath) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playVlc(String filePath) {
		System.out.println("play vlc file...");
	}

}
