module com.example.reactiveserver {
    requires spring.web;
    requires reactor.core;
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires spring.context;
    requires spring.webflux;
    requires com.example.common;
    requires lombok;
    exports com.example.reactiveserver;
}