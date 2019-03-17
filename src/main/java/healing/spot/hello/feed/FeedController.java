package healing.spot.hello.feed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import healing.spot.hello.feed.service.FeedReader;

@RestController
@RequestMapping("/feed")
public class FeedController {

	@Autowired
	FeedReader feedReader;

	@GetMapping
	void getFeeds() {
		feedReader.read("http://hanjeongseok.com/feed.xml");
	}
}
