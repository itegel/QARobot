package qarobot;

/**
 * Q&A robot for Dony
 * Created by itegel on 16/03/2017.
 */
public class QARule {
  String rule;
  String jumpUrl;

  public QARule(String rule, String jumpUrl) {
    this.rule = rule;
    this.jumpUrl = jumpUrl;
  }

  public QARule(){
    this.rule = "";
    this.jumpUrl = "";
  }

  public String getRule() {
    return this.rule;
  }

  public String getJumpUrl() {
    return this.jumpUrl;
  }

  public void setRule(String rule) {
    this.rule = rule;
  }

  public void setJumpUrl(String jumpUrl) {
    this.jumpUrl = jumpUrl;
  }

  public String toString() {
    return "qarobot.QARule(rule=" + this.getRule() + ", jumpUrl=" + this.getJumpUrl() + ")";
  }
}
