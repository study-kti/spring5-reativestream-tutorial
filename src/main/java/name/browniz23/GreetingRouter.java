package name.browniz23;

import org.springframework.context.annotation.*;
import org.springframework.http.*;
import org.springframework.web.reactive.function.server.*;

@Configuration
public class GreetingRouter {
	@Bean
	public RouterFunction<ServerResponse> route(GreetingHandler greetingHandler) {

		return RouterFunctions
			.route(RequestPredicates.GET("/hello")
			.and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), request -> greetingHandler.hello(request));
	}
}
