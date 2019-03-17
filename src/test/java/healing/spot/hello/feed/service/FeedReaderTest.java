package healing.spot.hello.feed.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import healing.spot.hello.feed.service.FeedReader;

@SpringBootTest
@RunWith(SpringRunner.class)
public class FeedReaderTest {

	@Autowired
	FeedReader feedReader;

	@Test
	public void testRead() throws Exception {
		feedReader.read("http://hanjeongseok.com/feed.xml");
	}

}
