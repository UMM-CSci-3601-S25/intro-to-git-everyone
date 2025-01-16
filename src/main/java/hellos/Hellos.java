package hellos;

/**
 * A simple Java program used to demonstrate merge conflicts when
 * multiple people edit the same piece of code.
 */
public class Hellos {

  public String generateOutput() {
    StringBuilder builder = new StringBuilder();

    builder.append(kkSaysHello());
    builder.append(kennySaysHello());
    builder.append(macSaysHello());
    builder.append(nicSaysHello());

    return builder.toString();
  }

  private String macSaysHello() {
    return "Mac says 'hey!'\n";
  }

  private String kennySaysHello() {
    return "Kenny says 'Hi!'\n";
  }

  private String nicSaysHello() {
    return "Nic says 'Howdy!'\n";
  }

  private String kkSaysHello() {
    return "KK says 'Hello!'\n";
  }

}
