package example.designpattern.creational.factory;

public class FactoryDPTester {

	public static void main(String[] args) {
		
		
		DatabaseFactory sqlServer = new DatabaseFactory();
		IConnection sqlServerConnection = sqlServer.createConnection("MySql");
		System.out.println(sqlServerConnection.getConnectionStatus());
		
		DatabaseFactory oracle = new DatabaseFactory();
		IConnection oracleConnection = oracle.createConnection("Oracle");
		System.out.println(oracleConnection.getConnectionStatus());
		
	}

}
