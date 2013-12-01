package common.net.mrcomputerghost.dragoncraft.block;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;

public class BlockDragonEmerald extends BlockDC {

    public BlockDragonEmerald(int par1) {
        super(par1, Material.grass);
        this.setStepSound(soundStoneFootstep);
        this.setTickRandomly(true);
        this.setHardness(5f);
        this.setResistance(5f);
    }
    
	public void registerIcons(IconRegister reg) 
	{
		this.blockIcon = reg.registerIcon("DC:dragonEmerald"); 
	}
}
