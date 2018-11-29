package ipsis.woot.blocks;

import ipsis.woot.util.WootBlock;
import net.minecraft.block.material.Material;

public class BlockImport extends WootBlock {

    private static final String BASENAME = "import";

    public BlockImport() {
        super(Material.ROCK, BASENAME);
    }

    public static String getBasename() { return BASENAME; }
}
