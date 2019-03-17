package healing.spot.hello.feed.model;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class FeedChannel {

	private String title;
	private String desc;
	private String link;
	private Date pubDate;

	private List<FeedItem> items;
}
