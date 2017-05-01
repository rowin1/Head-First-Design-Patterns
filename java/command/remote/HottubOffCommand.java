public class HottubOffCommand implements Command {
  Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.cool();
		hottub.off();
    hottub.bubblesOff();
	}
}