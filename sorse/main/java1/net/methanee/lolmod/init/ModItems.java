package net.methanee.lolmod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.methanee.lolmod.item.ItemClayDurp;
import net.methanee.lolmod.item.ItemLM;
import net.methanee.lolmod.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
     public static final ItemLM claydurp = new ItemClayDurp();

     public static void init()
     {
         GameRegistry.registerItem(claydurp, "claydurp");
     }
}
