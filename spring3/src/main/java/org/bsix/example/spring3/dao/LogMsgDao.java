package org.bsix.example.spring3.dao;

import org.bsix.example.spring3.entity.LogMsg;

public class LogMsgDao implements ILogMsgDao {

	@Override
	public void add(LogMsg logMsg) {
		System.out.println("增加了" + logMsg);
	}

}
