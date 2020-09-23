package example.designpattern.creational.factory;

// this can be made interface also, making the connection factory classes implementing this interface 
public abstract class Connection {
	
	public Connection(){}
	
	public String getConnectionStatus(){
		return "Connected to " + this.getClass().getName();
	}
}
