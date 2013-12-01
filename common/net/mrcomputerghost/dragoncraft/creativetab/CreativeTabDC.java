package common.net.mrcomputerghost.dragoncraft.creativetab;

import common.net.mrcomputerghost.dragoncraft.api.Blocks;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabDC extends CreativeTabs {
    public CreativeTabDC(int par1, String par2Str) {
        super(par1, par2Str);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex() {
        return Blocks.dragonEmerald.get().blockID;
    }
}
