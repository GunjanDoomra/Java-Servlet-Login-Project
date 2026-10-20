package com.servlet;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class AppListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Web Application Started Successfully!");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Web Application Destroyed Successfully!");
    }
}
