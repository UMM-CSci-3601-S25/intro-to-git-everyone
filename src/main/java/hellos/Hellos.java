package hellos;

/**
 * A simple Java program used to demonstrate merge conflicts when
 * multiple people edit the same piece of code.
 */
public class Hellos {

  public String generateOutput() {
    StringBuilder builder = new StringBuilder();

    builder.append(fionaSaysSup());
    builder.append(haiderSaysCuhh());
    builder.append(kkSaysHello());
    builder.append(nicSaysHello());

    return builder.toString();
  }

  private String fionaSaysSup() {
    return "Fiona says 'Sup!'\n";
  }

  private String haiderSaysCuhh() {
    return "Haider says 'Cuhh!'\n";
  }

  private String kkSaysHello() {
    return "KK says 'Hello!'\n";
  }

  private String nicSaysHello() {
    return "Nic says 'Howdy!'\n";
  }

}
