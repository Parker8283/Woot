package ipsis.woot.misc.anvil;

import ipsis.woot.mod.ModBlocks;
import ipsis.woot.mod.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;

public class AnvilCraftingManagerLoader {

    public static void load() {

        // Die creation

        // Controller creation
        AnvilCraftingManager.get().addRecipe(
                new ItemStack(ModItems.MOB_SHARD_ITEM),
                new ItemStack(ModBlocks.CONTROLLER_BLOCK),
                new ItemStack(Blocks.GLASS)
        );
    }
}
