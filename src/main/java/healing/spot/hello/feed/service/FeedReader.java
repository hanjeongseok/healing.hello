package healing.spot.hello.feed.service;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

import healing.spot.hello.feed.model.FeedChannel;
import healing.spot.hello.feed.model.FeedItem;

@Component
public class FeedReader {

	public FeedChannel read(String rssUrl) {
		if (StringUtils.isEmpty(rssUrl)) {
			return null;
		}

		FeedChannel channel = new FeedChannel();
        try (XmlReader reader = new XmlReader(new URL(rssUrl))) {
            SyndFeed romeFeed = new SyndFeedInput().build(reader);
            channel.setTitle(romeFeed.getTitle());
            channel.setDesc(romeFeed.getDescription());
            channel.setLink(romeFeed.getLink());
            channel.setPubDate(romeFeed.getPublishedDate());

            List<FeedItem> items = new ArrayList<FeedItem>();
            for (SyndEntry entry : romeFeed.getEntries()) {
            	FeedItem item = new FeedItem();
                item.setTitle(entry.getTitle());
                item.setLink(entry.getLink());
                item.setAuth(entry.getAuthor());
                item.setPubDate(entry.getPublishedDate());

                items.add(item);
            }

            channel.setItems(items);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return channel;
	}
}
