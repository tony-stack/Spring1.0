package soundsystem;

import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 1.runwith 测试时创建Spring的应用上下文
 * 2.@ContextConfiguration 在CDPlaryerConfig中加载配置
 * @author molai
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {
	
	/*@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();*/
	
	@Autowired
	private CompactDisc cd;
	
	@Autowired
	private MediaPlayer player;
	
	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
	}
	
	/*@Test
	public void play() {
		player.play();
		asssertEquals("Playing Sgt. Pepper's Lonely Hearts Club band by The Beatles\n", log.getLog());
	}*/
}
