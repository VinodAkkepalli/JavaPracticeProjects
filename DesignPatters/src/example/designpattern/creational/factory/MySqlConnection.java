package example.designpattern.creational.factory;

public class MySqlConnection implements IConnection {
	public MySqlConnection(){}

	@Override
	public String getConnectionStatus() {
		return "Connected to " + this.getClass().getName();
	}
}
