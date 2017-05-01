public LivingroomLightOffCommand implements Command {
  Light light;
  
  public LivingroomLightOffCommand(Light light) {
    this.light = light;
  }
  
  public void execute() {
    light.off();
  }
}