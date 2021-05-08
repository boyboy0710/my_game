package game;

import game.player.join_player;
import game.player.new_player;
import game.system_settings.system_variable.map_variable;
import game.system_settings.system_variable.player_variable;
import game.system_settings.system_variable.system_variable;

import static game.system_settings.system_variable.system_variable.play_log;

public class Main {

    public static void main(String[] args) {

        system_variable.system_variable();
        player_variable.player_variable();
        map_variable.map_variable();

        if(play_log == true) {
            new_player.new_player();
        }
        else {
            join_player.join_player();
        }

    }

}
