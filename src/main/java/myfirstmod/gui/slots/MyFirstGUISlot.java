package myfirstmod.gui.slots;

import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class MyFirstGUISlot extends SlotList {

  public MyFirstGUISlot(IItemHandler itemHandler, int startX, int startY) {
    for (int v = 0; v < 3; v++) {
      for (int h = 0; h < 3; h++) {
        pushSlot(new SlotItemHandler(itemHandler, v * 3 + h, startX + h * 18, startY + v * 18));
      }
    }
  }

}
