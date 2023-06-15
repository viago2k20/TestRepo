class App {
  //Извлекаем имя из адреса электронной почты
public static String extractNameFromEmail (String email) {
  int atIndex = email.indexOf('@');
  System.out.println(atIndex);
  return (atIndex != -1) ? email.substring(0, atIndex) : email;
}

  public static void main(String[] args) {
    String email = "johndoe@example.com";
    String name = extractNameFromEmail(email);
    System.out.println(name);

    String email1 = "example.com";
    String name1 = extractNameFromEmail(email1);
    System.out.println(name1);

    String email2 = "den@qwerty@example.com";
    String name2 = extractNameFromEmail(email2);
    System.out.println(name2);

  }
}
