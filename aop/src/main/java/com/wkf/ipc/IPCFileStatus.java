package com.wkf.ipc;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.Writable;

public class IPCFileStatus implements Writable {
	
	private String name;
	
	public IPCFileStatus(String name){
		this.name = name;
	}

	@Override
	public void readFields(DataInput arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void write(DataOutput arg0) throws IOException {
		// TODO Auto-generated method stub

	}
	
	public void getName(){
		System.out.println(name);
	}

}
