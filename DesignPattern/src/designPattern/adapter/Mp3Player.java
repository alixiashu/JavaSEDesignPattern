package designPattern.adapter;

public class Mp3Player implements MediaPlayer{
	
	
	/*  Mp3Player ���¾��в���mp3�����������ܺ�������
	 	������Ҫ��ʵ�ֲ���mp4��vlc�����������Ѿ�����Mp4Player��VlcPlayer
		�������࣬��ʱ����Խ�mp3Player���һ������������Mp4Player��VlcPlayer
		�ӵ�Mp3Player��
		
		�������ľ�������
		������Ĳ����Ƕ��ڵģ������ĵ�����ͷ����������ô�죬
		ֻ����һ��������
		������ͷ�Ͳ����������ϣ��������ٲ嵽��ͷ�ϡ�
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
		//����������
		MediaAdapter adapter = new MediaAdapter(audioType);
		adapter.play(audioType, pathName);
		
	}

}
