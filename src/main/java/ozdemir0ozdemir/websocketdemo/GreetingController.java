package ozdemir0ozdemir.websocketdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
class GreetingController {

    private static final Logger log = LoggerFactory.getLogger(GreetingController.class);

    @MessageMapping("/greetings")
    @SendTo("/topic/greetings")
    Greeting greeting(HelloMessage message) {
        var payload = new Greeting("Greeting, %s".formatted(HtmlUtils.htmlEscape(message.name())));
        log.info("Greeting: {}", payload);
        return payload;
    }

    @MessageMapping("/messages")
    @SendTo("/chat/messages")
    Greeting message(HelloMessage message) {
        var payload = new Greeting("Message, %s".formatted(HtmlUtils.htmlEscape(message.name())));
        log.info("Message: {}", payload);
        return payload;
    }
}
