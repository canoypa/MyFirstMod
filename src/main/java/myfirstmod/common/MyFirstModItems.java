package myfirstmod.common;

import myfirstmod.items.ItemGuiTest;
import myfirstmod.items.ItemMyFirstItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;

@ObjectHolder(ModInfo.MODID)
public class MyFirstModItems {

  public static final Item MY_FIRST_ITEM = null;

  public static final void registerItems(IForgeRegistry<Item> registry) {
    final Item[] items = {

        init(new ItemMyFirstItem(), "my_first_item", MyFirstMod.tabMyFirstMod),
        init(new ItemGuiTest(), "gui_test", MyFirstMod.tabMyFirstMod) };

    registry.registerAll(items);
  }

  public static final void registerItemBlocks(IForgeRegistry<Item> registry) {
    final Item[] blockItems = {
        new ItemBlock(MyFirstModBlocks.MY_FIRST_BLOCK)
            .setRegistryName(MyFirstModBlocks.MY_FIRST_BLOCK.getRegistryName()),
        new ItemBlock(MyFirstModBlocks.MY_FIRST_GUI_BLOCK)
            .setRegistryName(MyFirstModBlocks.MY_FIRST_GUI_BLOCK.getRegistryName()) };

    registry.registerAll(blockItems);
  }

  private static final Item init(Item item, String registryName, CreativeTabs tab) {
    return item.setRegistryName(ModInfo.MODID, registryName).setTranslationKey(ModInfo.MODID + "." + registryName)
        .setCreativeTab(tab);
  }

}
