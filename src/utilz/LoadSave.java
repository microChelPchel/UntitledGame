package utilz;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class LoadSave {

    public static final String PLAYER_ATLAS = "player_sprites.png";

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

    //TODO: добавить с 1ым уровнем
//    public static int[][] GetLevelData() {
//        BufferedImage img = GetSpriteAtlas(LEVEL_ONE_DATA);
//        int[][] lvlData = new int[img.getHeight()][img.getWidth()];
//
//        for (int j = 0; j < img.getHeight(); j++)
//            for (int i = 0; i < img.getWidth(); i++) {
//                Color color = new Color(img.getRGB(i, j));
//                int value = color.getRed();
//                if (value >= 48)
//                    value = 0;
//                lvlData[j][i] = value;
//            }
//        return lvlData;
//
//    }

}
