package com.wkf.ipc;

import org.apache.hadoop.ipc.VersionedProtocol;

public interface IPCQueryStatus extends VersionedProtocol{
	
	public IPCFileStatus getFileName(String name);
}
