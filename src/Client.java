
public class Client {

	public static void main(String args[]) {
		Button button = new Button(new MinimizeCommand());
		button.onClick();
	}
}
//注意：命令模式就是把command里面封装一个handler的引用，handler就有点像接收器的感觉了，然后可以选择将封好的command注入到button里面。
//button.onClick()调用command.execute()，command.execute()调用handler.display()。