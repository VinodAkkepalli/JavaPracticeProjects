package example.dp.factory;

public class DatabaseFactory {
	
	public DatabaseFactory() {}
	
	public Connection createConnection(String dbName){
		//return "test connection to database " + this.dbName + " is successful!!";
		if(dbName.equals("Oracle")){
			return new OracleConnection();
		}else if(dbName.equals("MySql")){
			return new MySqlConnection();
		}else{
			return new SqlServerConnection();
		}
		
	}
}
