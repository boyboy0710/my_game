package game.system_settings.File.File_load;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class play_log_load {

    public static Properties play_log_pro = new Properties();

    public static void play_log_load() {

        try {
            play_log_pro.load(new FileInputStream("src/main/java/game/game_resources/File/game_system/play_log.properties"));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "파일 불러오기 오류 -> " + e);
        }

    }

}
