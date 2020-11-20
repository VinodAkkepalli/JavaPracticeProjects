package example.designpattern.creational.factory;

public class DatabaseFactory {
	
	public DatabaseFactory() {}
	
	public IConnection createConnection(String dbName){
		if(dbName.equals("Oracle")){
			return new OracleConnection();
		}else if(dbName.equals("MySql")){
			return new MySqlConnection();
		}else{
			return new SqlServerConnection();
		}
		
	}
}
