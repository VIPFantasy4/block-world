package a2;

import csse2002.block.world.BlockWorldException;

/**
 * Created by Administrator on 2018/9/28.
 */
public class WorldMapInconsistentException extends BlockWorldException {
    public WorldMapInconsistentException() {
    }

    public WorldMapInconsistentException(String message) {
        super(message);
    }
}