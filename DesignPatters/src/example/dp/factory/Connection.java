package example.dp.factory;

public abstract class Connection {
	
	public Connection(){}
	
	public String getConnectionStatus(){
		return "Connected to " + this.getClass().getName();
	}
}
