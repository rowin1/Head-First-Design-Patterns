public class SimpleRemoteControl { // Invoker class. Invoker has a reference to command object
  Command slot; // We have one slot to hold our command, which will control one device.
  
  public SimpleRemoteControl() {}
  
  public void setCommand(Command command) {
    slot = command;
  }
  
  public void buttonWasPressed() {
    slot.execute();
  }
}