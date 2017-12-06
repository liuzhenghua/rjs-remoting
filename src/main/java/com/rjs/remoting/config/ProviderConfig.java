package com.rjs.remoting.config;

import java.io.Serializable;

/**
 * 服务提供者相关配置
 * @author LiuZhenghua
 * 2017年12月6日 下午9:42:31
 * @param <T>服务提供者的接口
 */
public class ProviderConfig<T> implements Serializable {
	
	private static final long serialVersionUID = 3414635614000104710L;
	//服务接口
    private Class<? extends T> serviceInterface;
    //服务实现
    private T serviceObject;
    //服务端口
    private String serverPort;
    //服务超时时间
    private long timeout;
    //服务代理对象,暂时没有用到
    private T serviceProxyObject;
    //服务提供者唯一标识
    private String appKey;
    //服务分组组名
    private String groupName = "default";
    //服务提供者权重,默认为1 ,范围为[1-100]
    private int weight = 1;
    //服务端线程数,默认10个线程
    private int workerThreads = 10;
    
    public Class<?> getServiceInterface() {
		return serviceInterface;
	}
	public void setServiceInterface(Class<? extends T> serviceInterface) {
		this.serviceInterface = serviceInterface;
	}
	public T getServiceObject() {
		return serviceObject;
	}
	public void setServiceObject(T serviceObject) {
		this.serviceObject = serviceObject;
	}
	public String getServerPort() {
		return serverPort;
	}
	public void setServerPort(String serverPort) {
		this.serverPort = serverPort;
	}
	public long getTimeout() {
		return timeout;
	}
	public void setTimeout(long timeout) {
		this.timeout = timeout;
	}
	public T getServiceProxyObject() {
		return serviceProxyObject;
	}
	public void setServiceProxyObject(T serviceProxyObject) {
		this.serviceProxyObject = serviceProxyObject;
	}
	public String getAppKey() {
		return appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWorkerThreads() {
		return workerThreads;
	}
	public void setWorkerThreads(int workerThreads) {
		this.workerThreads = workerThreads;
	}
	
	
}
