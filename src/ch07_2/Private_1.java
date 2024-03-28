package ch07_2;

public class Private_1 {
    //private이 붙은 변수나 메소드는 해당 클래스 안에서만 접근가능
    private String secret;

  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }
}
  //필드변수들은 기본적으로 private을 사용한다 (중요상태 등을 함부로 노출하지 않는다)

