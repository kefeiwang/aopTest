package com.wkf.instrument;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;

public class Agent {
	public static void premain(String agentArgs, Instrumentation inst){
		ClassFileTransformer t = new Transformer();//实例化转换器
		inst.addTransformer(t);//将转换器注册到jvm的Instrumentation中
	}
}
