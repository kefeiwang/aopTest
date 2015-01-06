package com.wkf.ipc;

import java.io.IOException;

public class IPCQueryStatusImpl implements IPCQueryStatus {

	@Override
	public long getProtocolVersion(String arg0, long arg1) throws IOException {
		return IPCQueryServer.IPC_VER;
	}

	@Override
	public IPCFileStatus getFileName(String name) {
		IPCFileStatus status = new IPCFileStatus(name);
		return status;
	}

}
