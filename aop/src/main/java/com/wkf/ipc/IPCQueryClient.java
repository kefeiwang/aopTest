package com.wkf.ipc;

import java.net.InetSocketAddress;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

public class IPCQueryClient {

	public static void main(String[] args) {
		try{
			InetSocketAddress addr = new InetSocketAddress("localhost",IPCQueryServer.IPC_PORT);
			IPCQueryStatus status = (IPCQueryStatus)RPC.getProxy(IPCQueryStatus.class, IPCQueryServer.IPC_VER, addr, new Configuration());
			IPCFileStatus fileStatus = status.getFileName("mike");
			fileStatus.getName();
			RPC.stopProxy(status);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
