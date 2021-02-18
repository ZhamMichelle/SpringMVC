package zham.mvc.kz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/main")
    public String mainMethod(){
        return "what a wonderful life";
    }
}
