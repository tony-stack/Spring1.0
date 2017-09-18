package soundsystem;

import org.springframework.stereotype.Component;

/**
 * component��ʾ����Ϊ����࣬SpringҪΪ����ഴ��Bean
 * @author molai
 *
 */
@Component
public class SgtPeppers implements CompactDisc{
	private String title = "Sgt. Pepper's Lonely Herats Club Band";
	private String artist = "The Beatles";
	
	public void play() {
		System.out.print("Playing " + title + " by " + artist + "\n");
	}
}
