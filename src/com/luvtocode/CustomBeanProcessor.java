package com.luvtocode;

import java.util.LinkedList;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
@Component
public class CustomBeanProcessor implements DisposableBean, BeanFactoryAware, BeanPostProcessor {
     BeanFactory bean;
     LinkedList<Object> prototypeBeans =new LinkedList<Object>();
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub
		bean=arg0;
	}

	public Object postProcessAfterInitialization(Object Bean,String BeanName)
	{
		if(bean.isPrototype(BeanName))
			prototypeBeans.add(Bean);
		return Bean;
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
         for(Object p:prototypeBeans)
         {
        	 if(p instanceof DisposableBean)
        	 {
        		 ((DisposableBean) p).destroy();
        	 }
         }
	}

}
