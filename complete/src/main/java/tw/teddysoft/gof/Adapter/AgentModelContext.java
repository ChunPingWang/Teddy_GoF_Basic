/*
 * Copyright 2016 TeddySoft Technology. All rights reserved.
 * 
 */
package tw.teddysoft.gof.Adapter;

import java.util.List;

public interface AgentModelContext {
	void setAgent(Agent agent);
	Agent getAgent();
	void addAcceport(Acceptor acceptor);
	Acceptor getAcceptor(String key);
	List<Acceptor> getAcceptors();
}