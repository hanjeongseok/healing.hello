package healing.spot.hello.rss;

import java.net.URL;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

@Component
public class FeedReader {

	public void read(String rssUrl) {
		if (StringUtils.isEmpty(rssUrl)) {
			return;
		}

        try {
            try (XmlReader reader = new XmlReader(new URL(rssUrl))) {
                SyndFeed feed = new SyndFeedInput().build(reader);
                System.out.println(feed.getTitle());
                System.out.println("***********************************");
                for (SyndEntry entry : feed.getEntries()) {
                    System.out.println(entry);
                    System.out.println("***********************************");
                }
                System.out.println("Done");
            }
        }  catch (Exception e) {
            e.printStackTrace();
        }
	}
}
