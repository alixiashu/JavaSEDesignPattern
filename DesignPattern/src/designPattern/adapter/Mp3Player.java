package designPattern.adapter;

public class Mp3Player implements MediaPlayer{
	
	
	/*  Mp3Player 本事具有播放mp3的能力（功能函数），
	 	现在需要其实现播放mp4和vlc的能力，且已经有了Mp4Player和VlcPlayer
		这两个类，这时候可以将mp3Player里加一个适配器，将Mp4Player和VlcPlayer
		加到Mp3Player里
		
		适配器的经典例子
		比如你的插坐是二口的，如果你的电器插头有三个口怎么办，
		只能找一个适配器
		这样插头就插在适配器上，适配器再插到插头上。
	*/
	public void play(String pathName) {
		System.out.println("mp3 file playing...");
	}
	@Override
	public void play(String audioType, String pathName) {
		if(audioType.equalsIgnoreCase("mp3")) {
			play(pathName);
			return;
		}
		//适配器部分
		MediaAdapter adapter = new MediaAdapter(audioType);
		adapter.play(audioType, pathName);
		
	}

}
