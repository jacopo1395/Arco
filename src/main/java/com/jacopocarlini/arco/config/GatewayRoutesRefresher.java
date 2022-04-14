//package com.jacopocarlini.arco.config;
//
//import org.springframework.cloud.gateway.event.RefreshRoutesEvent;
//import org.springframework.context.ApplicationEventPublisher;
//import org.springframework.context.ApplicationEventPublisherAware;
//import org.springframework.stereotype.Component;
//
//@Component
//public class GatewayRoutesRefresher implements ApplicationEventPublisherAware {
//
//    ApplicationEventPublisher publisher;
//
//    @Override
//    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
//        publisher = applicationEventPublisher;
//    }
//
//    public void refreshRoutes() {
//        publisher.publishEvent(new RefreshRoutesEvent(this));
//    }
//}
