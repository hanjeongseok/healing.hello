package healing.spot.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import healing.spot.hello.model.Greet;

@RestController
public class HelloController {

	@RequestMapping("/")
	Greet greet() {
		return new Greet("Hello World");
	}
}
