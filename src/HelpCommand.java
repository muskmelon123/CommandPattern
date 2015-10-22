
public class HelpCommand extends Command{
	
	public HelpCommand() {
		super.setHandler(new HelperHandler());
	}
	
	public void execute() {
		super.execute();
	}
}
