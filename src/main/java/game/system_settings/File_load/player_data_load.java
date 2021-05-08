package game.system_settings.File_load;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class player_data_load {

    public static Properties player_data_pro = new Properties();

    public static void player_data_load() {

        try {
            player_data_pro.load(new FileInputStream("src/main/java/game/game_resources/File/player/player_data.properties"));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "파일 불러오기 오류 -> " + e);
        }
        
    }

}
