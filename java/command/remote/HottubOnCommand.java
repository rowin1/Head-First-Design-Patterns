public class HottubOnCommand implements Command {
  Hottub hottub;
  
  public HottubOnCommand(Hottub hottub) {
    this.hottub = hottub;
  }
  
  public void execute() {
    hottub.heat();
    hottub.on();
    hottub.bubblesOn();
  }
}