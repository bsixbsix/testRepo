package org.bsix.example.spring3.aspect;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogAspect {
	public void logBefore(JoinPoint point){
		Logger logger = LoggerFactory.getLogger(point.getTarget().getClass());
		logger.debug("方法{}被调用了", point.getSignature().getName());
	}
}
