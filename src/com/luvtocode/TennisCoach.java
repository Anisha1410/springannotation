package com.luvtocode;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach,DisposableBean{
FortuneService fs;
@Value("${foo.email}")
String emailid;

@Autowired
public TennisCoach(FortuneService fs)
{
	this.fs=fs;
}
@Override
public String getDailyWorkout() {
	// TODO Auto-generated method stub
	return "Practice batting for 30 min";
}
@Override
public String getDailyFortune() {
	// TODO Auto-generated method stub
	return fs.getFortune();
}

@PostConstruct
public void customInit()
{
	System.out.println("inside init");
}


public void customDestroy()
{
	System.out.println("inside destroy");
}
@Override
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("inside destroy");
}

	
}
