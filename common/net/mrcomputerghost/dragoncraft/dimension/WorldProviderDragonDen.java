package common.net.mrcomputerghost.dragoncraft.dimension;

import common.net.mrcomputerghost.dragoncraft.lib.DimensionIds;
import common.net.mrcomputerghost.dragoncraft.world.biome.ModBiomes;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.DimensionManager;

public class WorldProviderDragonDen extends WorldProvider {

    public void registerWorldChunkManager() {
        this.worldChunkMgr = new WorldChunkManagerHell(ModBiomes.emerald, 0.5f, 0.0f);
        this.hasNoSky = false;
        this.dimensionId = DimensionIds.DRAGONDEN;
    }

    public static WorldProvider getProviderForDimension(int par0) {
        return DimensionManager.createProviderFor(DimensionIds.DRAGONDEN);
    }

    public String getSaveFolder() {
        return "DIM_DEN";
    }

    public String getWelcomeMessage() {
        return "Entering the Dragon Den";
    }

    public String getDepartMessage() {
        return "Leaving the Dragon Den";
    }
    
    @Override
    public IChunkProvider createChunkGenerator() {
        return new ChunkProviderDragonDen(worldObj, worldObj.getSeed(), true);
    }

    public boolean canRespawnHere() {
        return true;
    }

    public double getMovementFactor() {
        return 0.125;
    }

    public float getCloudHeight() {
        return 160.0F;
    }

    public String getDimensionName() {
        return "The Dragon Den";
    }
}