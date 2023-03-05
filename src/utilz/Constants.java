package utilz;

public class Constants {

    public class GameVaribles {
        //Windows size
//        public static final int GAME_HEIGHT = 720;
//        public static final int GAME_WIDTH = 1280;

        //Path to the files
        public static final String PATH_DICTIONARY = "";
        public static final String NAME_AUTHORIZATION_FILE = "";
        public static final String BUTTON_SPRITES = "";

        public static final String PATH_LOGINS = "logins.json";
    }

    /**
     * Constants for load data player
     * MAX_SIZE_PIC_W,MAX_SIZE_PIC_H = max count sprite for assets-1
     */
    public static class PlayerConstants {

        public static final int MAX_SIZE_PIC_W = 9;
        public static final int MAX_SIZE_PIC_H = 6;

        public static final int SIZE_W = 120;
        public static final int SIZE_H = 60;

        public static final int ATTACK_1 = 1;
        public static final int ATTACK_2 = 2;
        public static final int IDLE = 3;
        public static final int RUNNING = 4;
        public static final int JUMP = 5;
        public static final int FALLING = 6;

        public static int GetSpriteAmount(int player_action) {
            switch (player_action) {
                case RUNNING:
                case IDLE:
                    return 5; //подумать -перепутаны x \\\/// y
                case ATTACK_2:
                    return 6;
                case ATTACK_1:
                    return 4;
                case JUMP:
                case FALLING:
                    return 3;
                default:
                    return 1;

            }
        }

    }

}
