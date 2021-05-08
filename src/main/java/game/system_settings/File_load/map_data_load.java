package game.system_settings.File_load;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class map_data_load {

    public static Properties map_data_pro = new Properties();

    public static void map_data_load() {

        try {
            map_data_pro.load(new FileInputStream("src/main/java/game/game_resources/File/map/map_data.properties"));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "파일 불러오기 오류 -> " + e);
        }

    }

}
