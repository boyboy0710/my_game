package game.system_settings.system_variable;

import game.system_settings.File_load.player_data_load;

public class player_variable {

    static String player_name;

    public static void player_variable() {

        player_data_load.player_data_load();
        player_name = player_data_load.player_data_pro.getProperty("player_name");


    }

}
