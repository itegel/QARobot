package qarobot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yaml.snakeyaml.Yaml;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by itegel on 16/03/2017.
 */
@SpringBootApplication
public class Application {
  public static List<QARule> RULES;

  public static void main(String[] args) {
    yamlTest();
    SpringApplication.run(Application.class, args);
  }

  private static void yamlTest(){
//    List<QARule> rules = new LinkedList();
//    rules.add(new QARule(".*申请.*", "aplly.com"));
//    rules.add(new QARule(".*护士.*", "nurse.com"));
//    rules.add(new QARule(".*百度.*", "百度.com"));

    Yaml yaml = new Yaml();
//    System.out.println(yaml.dump(rules));

    try {
      RULES = (List<QARule>) yaml.load(Application.class.getClassLoader().getResourceAsStream("rules.yaml"));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }


}
