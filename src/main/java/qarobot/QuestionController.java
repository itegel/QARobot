package qarobot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by itegel on 16/03/2017.
 */
@RestController
public class QuestionController {

  @RequestMapping("/question")
  public String greeting(@RequestParam(value = "wd", defaultValue = "hello") String wd) {
    for (QARule rule : Application.RULES) {
      if (wd.matches(rule.getRule())) {
        return rule.getJumpUrl();
      }
    }
    return "https://www.baidu.com/s?wd=" + wd;
  }

}
