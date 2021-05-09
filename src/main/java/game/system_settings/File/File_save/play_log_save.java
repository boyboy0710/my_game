package game.system_settings.File.File_save;

import game.system_settings.File.File_load.play_log_load;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class play_log_save {

    public static void play_log_save() {
        try {
            play_log_load.play_log_pro.save( new FileOutputStream("src/main/java/game/game_resources/File/game_system/play_log.properties"),"");
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "파일 불러오기 오류 -> " + e);
        }
    }

}
