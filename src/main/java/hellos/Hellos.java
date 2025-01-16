package hellos;

/**
 * A simple Java program used to demonstrate merge conflicts when
 * multiple people edit the same piece of code.
 */
public class Hellos {

  public String generateOutput() {
    StringBuilder builder = new StringBuilder();

    builder.append(jaydenSaysHello());
    builder.append(KKSaysHello());
    builder.append(mahathirSaysHello());
    builder.append(nicSaysHello());

    return builder.toString();
  }

  private String jaydenSaysHello() {
    return "Jayden says 'Hello!'\n";
  }

  private String KKSaysHello() {
    return "KK says 'Hello!'\n";
  }

  private String mahathirSaysHello() {
    return "Mahathir says 'Hello!'\n";
  }

  private String nicSaysHello() {
    return "Nic says 'Hello!'\n";

  }

}
