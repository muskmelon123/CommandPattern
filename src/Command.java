
public class Command {

	private Handler handler;
	
	protected void setHandler(Handler handler) {
		this.handler = handler;
	}
	
	protected Handler getHandler() {
		return this.handler;
	}
	
	public void execute() {
		handler.display();
	};
}
