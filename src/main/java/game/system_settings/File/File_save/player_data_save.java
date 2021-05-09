package game.system_settings.File.File_save;

import game.system_settings.File.File_load.player_data_load;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class player_data_save {

    public static void player_data_save() {
        try {
            player_data_load.player_data_pro.save( new FileOutputStream("src/main/java/game/game_resources/File/player/player_data.properties"),"");
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "파일 불러오기 오류 -> " + e);
        }
    }

}
