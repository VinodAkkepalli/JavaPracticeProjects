package example.dp.factory;

public class FactoryDesignPattern {

	public static void main(String[] args) {
		
		
		DatabaseFactory sqlServer = new DatabaseFactory();
		Connection sqlServerConnection = sqlServer.createConnection("MySql");
		System.out.println(sqlServerConnection.getConnectionStatus());
		
		DatabaseFactory oracle = new DatabaseFactory();
		Connection oracleConnection = oracle.createConnection("Oracle");
		System.out.println(oracleConnection.getConnectionStatus());
		
	}

}
