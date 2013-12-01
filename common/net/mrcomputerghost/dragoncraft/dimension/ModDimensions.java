package common.net.mrcomputerghost.dragoncraft.dimension;

import common.net.mrcomputerghost.dragoncraft.lib.DimensionIds;

import net.minecraftforge.common.DimensionManager;

public class ModDimensions {
    
    public static void init() {
        registerProviderType();
        registerDimension();
    }
    
    public static void registerProviderType() {
        DimensionManager.registerProviderType(DimensionIds.DRAGONDEN, WorldProviderDragonDen.class, false);
    }
    
    public static void registerDimension() {
        DimensionManager.registerDimension(DimensionIds.DRAGONDEN, DimensionIds.DRAGONDEN);
    }
}
