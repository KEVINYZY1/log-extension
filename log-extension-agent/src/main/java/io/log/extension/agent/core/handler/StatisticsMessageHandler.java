package io.log.extension.agent.core.handler;

import io.log.extension.api.DefaultMessage;

public class StatisticsMessageHandler extends AbstractMessageHandler{

	@Override
	public void doHandle(DefaultMessage message) {
//		StorageConcurrentMap storage = StorageConcurrentMap.getInstance();
//		storage.getStaticstics();
		StorageConcurrentMap.handleMessage(message);
	}

}
