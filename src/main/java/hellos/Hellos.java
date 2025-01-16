package hellos;

/**
 * A simple Java program used to demonstrate merge conflicts when
 * multiple people edit the same piece of code.
 */
public class Hellos {

  public String generateOutput() {
    StringBuilder builder = new StringBuilder();
    builder.append(antonSaysHello());
    builder.append(armandoSaysHello());

    builder.append(fionaSaysSup());
    builder.append(haiderSaysCuhh());

    builder.append(dylanSaysHello());
    builder.append(elliotSaysHello());

    builder.append(dylanSaysHello());
    builder.append(elliotSaysHello());
    builder.append(jaydenSaysHello());
    builder.append(kkSaysHello());
    builder.append(mahathirSaysHello());
    builder.append(nicSaysHello());
    builder.append(thatcherSaysHello());

    return builder.toString();
  }

  private String armandoSaysHello() {
    return "Armando says 'What's up!'\n";
  }

  private String fionaSaysSup() {
    return "Fiona says 'Sup!'\n";
  }

  private String haiderSaysCuhh() {
    return "Haider says 'Cuhh!'\n";

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

  private String nicSaysHello() {
    return "Nic says 'Howdy!'\n";

  private String mahathirSaysHello() {
    return "Mahathir says 'Hello!'\n";
  }


  private String thatcherSaysHello() {
    return "Thatcher says 'Holo!'\n";
  }

  private String antonSaysHello() {
    return "Anton says 'Yello!'\n";

  }

}
