package org.bsix.example.spring3.service;

import org.bsix.example.spring3.dao.ILogMsgDao;
import org.bsix.example.spring3.entity.LogMsg;

public class LogMsgService implements ILogMsgService {
	private ILogMsgDao logMsgDao;

	public ILogMsgDao getLogMsgDao() {
		return logMsgDao;
	}

	public void setLogMsgDao(ILogMsgDao logMsgDao) {
		this.logMsgDao = logMsgDao;
	}

	@Override
	public void add(LogMsg logMsg) {
		logMsgDao.add(logMsg);
	}
	
	

}
