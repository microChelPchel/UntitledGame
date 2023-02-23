package utilz;

import javax.imageio.ImageIO;
//TODO: убрать  везде *
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class LoadSave {

    //TODO: RENAME
    public static final String PLAYER_ATLAS = "1.png";
    //TODO:съехало надо обрезать или подрпавить, если хочешь можешь поставить его на задний фон
    public static final String BACKGROUND_IMG = "background.png";

    public static final String LEVEL_ONE_DATA = "";

    public static BufferedImage GetSpriteAtlas(String fileName) {
        BufferedImage img = null;
        InputStream is = LoadSave.class.getResourceAsStream("/" + fileName);
        try {
            img = ImageIO.read(is);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return img;
    }

    //TODO: добавить с 1ым уровнем ---не делать пока что
    //нужно разобраться как делать уровни - сначала сделать логику движения и авторизации хотя бы
    public static int[][] GetLevelData() {
        BufferedImage img = GetSpriteAtlas(LEVEL_ONE_DATA);
        int[][] lvlData = new int[img.getHeight()][img.getWidth()];

        for (int j = 0; j < img.getHeight(); j++)
            for (int i = 0; i < img.getWidth(); i++) {
                Color color = new Color(img.getRGB(i, j));
                int value = color.getRed();
                if (value >= 48)
                    value = 0;
                lvlData[j][i] = value;
            }
        return lvlData;

    }

}
