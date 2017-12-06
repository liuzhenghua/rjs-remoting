package com.rjs.remoting.provider;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import com.rjs.remoting.config.ProviderConfig;

/**
 * Provider工厂
 * @author LiuZhenghua
 * 2017年12月6日 下午9:46:16
 * @param <T>
 */
public class ProviderFacotryBean<T> extends ProviderConfig<T> implements FactoryBean<T>, InitializingBean {

	private static final long serialVersionUID = 2140329710030371213L;

	@Override
	public T getObject() throws Exception {
		return getServiceProxyObject();
	}
	
	@Override
	public Class<?> getObjectType() {
		return getServiceInterface();
	}
	
	@Override
	public boolean isSingleton() {
		return true;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		//1.启动Netty客户端
		//2.将provider元数据注册到注册中心
	}
    
    
}
