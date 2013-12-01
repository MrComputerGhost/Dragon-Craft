package common.net.mrcomputerghost.dragoncraft.block;

import common.net.mrcomputerghost.dragoncraft.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockDC extends Block{
    public BlockDC(int par1, Material par2Material) {
        super(par1, par2Material);
        this.setCreativeTab(common.net.mrcomputerghost.dragoncraft.DragonCraft.tabDC);
    }
    
	public void registerIcons(IconRegister reg) 
	{
		this.blockIcon = reg.registerIcon("DC:dragoncraft"); 
	}
}