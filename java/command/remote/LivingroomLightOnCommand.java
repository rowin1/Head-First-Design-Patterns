public LivingroomLightOnCommand implements Command {
  Light light;
  
  public LivingroomLightOnCommand(Light light) {
    this.light = light;
  }
  
  public void execute() {
    light.on();
  }
}