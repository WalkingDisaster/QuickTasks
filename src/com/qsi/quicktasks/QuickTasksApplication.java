package com.qsi.quicktasks;

import java.util.List;

import com.google.inject.Module;
import com.qsi.quicktasks.services.SayHelloService;
import com.qsi.quicktasks.services.SayHelloServiceImpl;

import roboguice.application.RoboApplication;
import roboguice.config.AbstractAndroidModule;

public class QuickTasksApplication extends RoboApplication {

    @Override
    protected void addApplicationModules(List<Module> modules) {
            modules.add(new QuickTasksModule());
    }
    
    static class QuickTasksModule extends AbstractAndroidModule {
        @Override
        protected void configure() {
        	bind(SayHelloService.class).to(SayHelloServiceImpl.class);
        }
    }
}
