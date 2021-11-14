package springboot.hello.hellospringboot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Hey people you're at the root !";
	}

}
