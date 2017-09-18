package soundsystem;

import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 1.runwith ����ʱ����Spring��Ӧ��������
 * 2.@ContextConfiguration ��CDPlaryerConfig�м�������
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
