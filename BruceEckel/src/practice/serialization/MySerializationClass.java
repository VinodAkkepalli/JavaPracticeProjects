package practice.serialization;

import java.io.Serializable;

public class MySerializationClass implements Serializable {
	
	private String mName;
	private String mAddress;
	
	//this is declared transient, hence will not be serialized
	//If we try to read this value from consumer code, 0 will be returned
	private transient int mLength;
		
	public MySerializationClass() {
	}
	
	public MySerializationClass(String name, String address) {

		mName = name;
		mAddress = address;
		mLength = mName.length();
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmAddress() {
		return mAddress;
	}

	public void setmAddress(String mAddress) {
		this.mAddress = mAddress;
	}

	public int getmLength() {
		return mLength;
	}

	public void setmLength(int mLength) {
		this.mLength = mLength;
	}
}