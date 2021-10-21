package spindl.spindlapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

  @GetMapping("/pub")
  public String pub() {
    return "Hello traveller you look weary!";
  }

}