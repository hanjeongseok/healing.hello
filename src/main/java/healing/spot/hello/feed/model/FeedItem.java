package healing.spot.hello.feed.model;

import java.util.Date;

import lombok.Data;

@Data
public class FeedItem {

	private String title;
	private String link;
	private String auth;
	private Date pubDate;
}
