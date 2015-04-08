package practice.exceptions;

public class MyException extends Exception{
	
	String str="";
	
	public MyException(){}
	public MyException(String msg){
		super(msg);
		this.str = msg;
	}
	
	void getStr(){
		System.out.println("str is = " + str);
	}
}