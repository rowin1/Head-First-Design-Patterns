public class LightOnCommand implements Command {
  Light light; // The receiver
  
  public LightOnCommand(Light light) {
    this.light = light; // Pass receiver into Command constructor
  }
  
  public void execute() {
    light.on(); // Calling the action on the receiver
  }
}

// The actions and the receiver are bound together in the command object