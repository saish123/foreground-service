package com.sawant.foreground_service;

public class Constants {
 
 
    public interface ACTION {
        public static String MAIN_ACTION = "com.sawant.foreground_service.main";
        public static String INIT_ACTION = "com.sawant.foreground_service.init";
        public static String PREV_ACTION = "com.sawant.foreground_service.prev";
        public static String PLAY_ACTION = "com.sawant.foreground_service.play";
        public static String NEXT_ACTION = "com.sawant.foreground_service.next";
        public static String STARTFOREGROUND_ACTION = "com.marothiatechs.foregroundservice.action.startforeground";
        public static String STOPFOREGROUND_ACTION = "com.marothiatechs.foregroundservice.action.stopforeground";
    }
 
    public interface NOTIFICATION_ID {
        public static int FOREGROUND_SERVICE = 101;
    }
}