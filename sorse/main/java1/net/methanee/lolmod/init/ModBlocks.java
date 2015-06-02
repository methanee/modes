package net.methanee.lolmod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.methanee.lolmod.block.BlockClay;
import net.methanee.lolmod.block.BlockLM;
import net.methanee.lolmod.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLM claysdurp = new BlockClay();

    public static void init()
    {
        GameRegistry.registerBlock(claysdurp, "claysdurp");
    }
}
