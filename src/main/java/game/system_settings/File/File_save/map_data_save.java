package game.system_settings.File.File_save;

import game.system_settings.File.File_load.map_data_load;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class map_data_save {

    public static void map_data_save() {
        try {
            map_data_load.map_data_pro.save( new FileOutputStream("src/main/java/game/game_resources/File/map/map_data.properties"),"");
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "파일 불러오기 오류 -> " + e);
        }
    }

}
