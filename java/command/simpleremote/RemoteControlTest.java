public class RemoteControlTest { // This is our Client in Command Pattern-Speak
  
  public static void main(String[] args) {
    SimpleRemoteControl remote = new SimpleRemoteControl(); // The remote is our Invoker; it will be passed a command object with 'setCommand' that can be used to make requests
    Light light = new Light(); // Create object that will be receiver
    LightOnCommand lightOn = new LightOnCommand(light); // create a command and pass the Receiver to it
    
    GarageDoor garageDoor = new GarageDoor();
    GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
    
    remote.setCommand(lightOn); // Pass the command to the Invoker.
    remote.buttonWasPressed();
    
    remote.setCommand(garageOpen);
    remote.buttonWasPressed();
  }
}