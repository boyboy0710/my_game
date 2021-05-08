package game.system_settings.system_variable;

import game.system_settings.File_load.play_log_load;

public class system_variable {

    public static boolean play_log;

    public static void system_variable() {

        play_log_load.play_log_load();
        play_log = Boolean.parseBoolean(play_log_load.play_log_pro.getProperty("first_playing"));
    }

}
