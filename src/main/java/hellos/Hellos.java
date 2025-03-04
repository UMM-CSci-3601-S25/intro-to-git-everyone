package hellos;

/**
 * A simple Java program used to demonstrate merge conflicts when
 * multiple people edit the same piece of code.
 */
public class Hellos {

  public String generateOutput() {
    StringBuilder builder = new StringBuilder();

    builder.append(abhiSaysHello());
    builder.append(antonSaysHello());
    builder.append(armandoSaysHello());
    builder.append(dylanSaysHello());
    builder.append(elliotSaysHello());
    builder.append(fionaSaysSup());
    builder.append(georgeSaysHello());
    builder.append(haiderSaysCuhh());
    builder.append(jamesSaysHello());
    builder.append(jaydenSaysHello());
    builder.append(johnetteSaysHello());
    builder.append(kkSaysHello());
    builder.append(mahathirSaysHello());
    builder.append(nicSaysHello());
    builder.append(thatcherSaysHello());

    return builder.toString();
  }

  private String armandoSaysHello() {
    return "Armando says 'What's up!'\n";
  }

  private String abhiSaysHello() {
    return "Abhi says 'Hey!'\n";
  }

  private String georgeSaysHello() {
    return "George says 'Kalimera!'\n";
  }

  private String jaydenSaysHello() {
    return "Jayden says 'Hello!'\n";
  }

  private String dylanSaysHello() {
    return "Dylan says 'Howdy!'\n";
  }

  private String elliotSaysHello() {
    return "Elliot says 'Howdy!'\n";
  }

  private String nicSaysHello() {
    return "Nic says 'Howdy!'\n";
  }

  private String kkSaysHello() {
    return "KK says 'Hello!'\n";

  }

  private String thatcherSaysHello() {
    return "Thatcher says 'Holo!'\n";
  }

  private String antonSaysHello() {
    return "Anton says 'Yello!'\n";

  }

  private Object mahathirSaysHello() {
    return "Mahathir says 'Hiya!'\n";
  }

  private String fionaSaysSup() {
    return "Fiona says 'Sup!'\n";
  }

  private String haiderSaysCuhh() {
    return "Haider says 'Cuhh!'\n";
  }

  private String jamesSaysHello() {
    return "James says 'Hello!'\n";
  }

  private String johnetteSaysHello() {
    return "Johnette says 'Hello!'\n";
  }
}
