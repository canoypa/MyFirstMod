package myfirstmod.blocks;

import myfirstmod.common.MyFirstMod;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumBlockRenderType;

public abstract class BlockBasicContainer extends BlockContainer {

  protected BlockBasicContainer(String name) {
    super(Material.IRON);

    setRegistryName(MyFirstMod.MODID, name);
    setTranslationKey(MyFirstMod.MODID + "." + name);
    setCreativeTab(MyFirstMod.tabMyFirstMod);
    setSoundType(SoundType.STONE);
  }

  @Override
  public EnumBlockRenderType getRenderType(IBlockState state) {
    return EnumBlockRenderType.MODEL;
  }

}