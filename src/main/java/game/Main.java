package game;

import game.map.loading_map.loading;
import game.player.join_player;
import game.player.new_player;
import game.system_settings.File.File_load.play_log_load;
import game.system_settings.File.File_save.play_log_save;
import game.system_settings.system_variable.map_variable;
import game.system_settings.system_variable.player_variable;
import game.system_settings.system_variable.system_variable;

import static game.system_settings.system_variable.system_variable.play_log;

public class Main {

    public static void main(String[] args) {

        system_variable.system_variable();
        system_variable.loading = true;
        loading.loading();

        player_variable.player_variable();
        map_variable.map_variable();

        system_variable.loading = false;
        if(play_log == true) {
            play_log = false;
            play_log_load.play_log_load();
            play_log_load.play_log_pro.setProperty("first_playing","false");
            play_log_save.play_log_save();
            new_player.new_player();
        }
        else {
            join_player.join_player();
        }

    }

}
