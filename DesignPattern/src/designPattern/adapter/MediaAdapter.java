package designPattern.adapter;

public class MediaAdapter implements MediaPlayer{
	
	AdvancedMediaPlayer advancedMediaPlayer = null;
	
	public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("mp4")) 
			advancedMediaPlayer = new Mp4Player();
		else
			advancedMediaPlayer = new VlcPlayer();
	}
	@Override
	public void play(String audioType, String pathName) {
		if(audioType.equalsIgnoreCase("mp4")) 
			advancedMediaPlayer.playMp4(pathName);
		else 
			advancedMediaPlayer.playVlc(pathName);
		
	}

}
