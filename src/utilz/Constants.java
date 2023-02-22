package utilz;

public class Constants {

    public class GameVaribles {
        //Windows size
        public static final int GAME_HEIGHT = 720;
        public static final int GAME_WIDTH = 1280;

        //Path to the files
        public static final String PATH_DICTIONARY = "";
        public static final String NAME_AUTHORIZATION_FILE  ="";
        public static final String BUTTON_SPRITES = "";

        public static final String PATH_LOGINS = "logins.json";
    }

    public static class PlayerConstants {

        public static final int MAX_SIZE_PIC_W = 10;
        public static final int MAX_SIZE_PIC_H = 6;

        public static final int ATTACK_1 = 0;
        public static final int ATTACK_2 = 1;
        public static final int IDLE = 2;
        public static final int RUNNING = 3;
        public static final int JUMP = 4;
        public static final int FALLING = 5;

        public static int GetSpriteAmount(int player_action) {
            switch (player_action) {
                case RUNNING:
                case IDLE:
                    return 10;
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
