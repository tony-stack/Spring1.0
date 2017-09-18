package soundsystem;

import org.springframework.stereotype.Component;

/**
 * component表示该类为组件类，Spring要为这个类创建Bean
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
