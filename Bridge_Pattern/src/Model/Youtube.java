package Model;

import Bridge.VideoProcessor;

public class Youtube extends Video{

	public Youtube(VideoProcessor processor) {
		
		super(processor);
		
	}

	@Override
	public void play(String videoFile) {
		
		processor.process(videoFile);
		
	}
}
