package example.designpattern.creational.factory;

public class SqlServerConnection implements IConnection {
	
	public SqlServerConnection(){}

	@Override
	public String getConnectionStatus() {
		return "Connected to " + this.getClass().getName();
	}
}
