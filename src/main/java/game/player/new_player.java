package game.player;

import game.system_settings.File.File_load.player_data_load;
import game.system_settings.File.File_save.player_data_save;

import javax.swing.*;

import static game.system_settings.system_variable.player_variable.player_name;

public class new_player {

    public static void new_player() {
        player_data_load.player_data_load();
        JOptionPane.showMessageDialog(null,"새로운 캐릭터를 만듭니다");

        player_name = JOptionPane.showInputDialog(null,"이름을 입력해 주새요");
        player_data_load.player_data_pro.setProperty("player_name",player_name);

        player_data_save.player_data_save();
    }

}
