package example.designpattern.creational.factory;

public class OracleConnection implements IConnection {

	public OracleConnection(){}

	@Override
	public String getConnectionStatus() {
		return "Connected to " + this.getClass().getName();
	}
}
