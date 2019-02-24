package ipsis.woot.mod;

import ipsis.woot.Woot;
import ipsis.woot.debug.ItemDebug;
import ipsis.woot.tools.ItemHammer;
import net.minecraftforge.registries.ObjectHolder;

public class ModItems {

    @ObjectHolder((Woot.MODID + ":" + ItemDebug.BASENAME))
    public static final ItemDebug debugItem = null;

    @ObjectHolder((Woot.MODID + ":" + ItemHammer.BASENAME))
    public static final ItemHammer hammerItem = null;

}