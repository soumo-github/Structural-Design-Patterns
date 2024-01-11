package Main;

import Bridge.HDProcressor;
import Bridge.Video720p;
import Bridge.VideoProcessor;
import Model.Netflix;
import Model.Video;
import Model.Youtube;

public class Main {

	public static void main(String[] args) {
		
		VideoProcessor vpr = new Video720p();
		Video v = new Netflix(vpr);
		v.play("21 Guns");
		
	}

}
