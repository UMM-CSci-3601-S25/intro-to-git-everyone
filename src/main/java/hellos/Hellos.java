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
    builder.append(georgeSaysHello());


    builder.append(kkSaysHello());
    builder.append(nicSaysHello());
    builder.append(thatcherSaysHello());

    return builder.toString();
  }
  private String armandoSaysHello(){
    return "Armando says 'What's up!'\n";
  }

  private String abhiSaysHello() {
    return "Abhi says 'Hey!'\n";
  }

  private String georgeSaysHello() {
    return "George says 'Kalimera!'\n";
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

}
