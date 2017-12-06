package hello;

import org.springframework.context.ApplicationListener;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.web.socket.messaging.SessionConnectEvent;

public class SubscribeEventListener  implements ApplicationListener<SessionConnectEvent> {

	@Override
	public void onApplicationEvent(SessionConnectEvent event) {
		// TODO Auto-generated method stub
		
		StompHeaderAccessor headerAccessor = StompHeaderAccessor.wrap(event.getMessage());
		System.out.println("sessionId: " + headerAccessor.getSessionId());
		
		
//		System.out.println(headerAccessor.getSessionAttributes().get("sessionId").toString());
		
		
	}

//	@Override
//	public void onApplicationEvent(ApplicationEvent event) {
//		// TODO Auto-generated method stub
//		StompHeaderAccessor headerAccessor = StompHeaderAccessor.wrap(event.g.getSource()); 
//		System.out.println(headerAccessor.getSessionAttributes().get("sessionId").toString());
//	}

}
