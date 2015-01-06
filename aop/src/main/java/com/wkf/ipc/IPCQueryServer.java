package com.wkf.ipc;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;
import org.apache.hadoop.ipc.RPC.Server;

public class IPCQueryServer {

	public static final int IPC_PORT = 32121;
	
	public static final long IPC_VER = 54321L;
	
	public static void main(String[] args) {
		try{
			IPCQueryStatusImpl queryService = new IPCQueryStatusImpl();
			Server server = RPC.getServer(queryService, "0.0.0.0", IPC_PORT, new Configuration());
			server.start();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
