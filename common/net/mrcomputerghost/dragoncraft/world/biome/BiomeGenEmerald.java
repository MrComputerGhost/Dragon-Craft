package common.net.mrcomputerghost.dragoncraft.world.biome;

import java.util.Random;

import common.net.mrcomputerghost.dragoncraft.api.Blocks;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class BiomeGenEmerald extends BiomeGenBase
{
    private WorldGenMinable emeraldGen;

    public BiomeGenEmerald(int par1)
    {
        super(par1);
        this.spawnableCreatureList.clear();
        this.topBlock = (byte)Blocks.dragonEmerald.get().blockID;
        this.fillerBlock = (byte)Blocks.dragonEmerald.get().blockID;
        this.theBiomeDecorator.coalGen = new WorldGenMinable(Block.oreCoal.blockID, -1);
        this.theBiomeDecorator.goldGen = new WorldGenMinable(Block.oreGold.blockID, -1);
        this.theBiomeDecorator.generateLakes = false;
        this.emeraldGen = new WorldGenMinable(Block.oreEmerald.blockID, 24);
    }

    public void decorate(World par1World, Random par2Random, int par3, int par4)
    {
        super.decorate(par1World, par2Random, par3, par4);
    }
}
