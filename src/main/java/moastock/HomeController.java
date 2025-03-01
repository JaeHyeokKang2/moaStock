package moastock;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String home() {
        return "index";
    }

    @GetMapping("/member_index")
    public String member_index() {
        return "member_index";
    }

    @GetMapping("/join")
    public String join() {
        return "member/join";
    }
}
