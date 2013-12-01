package common.net.mrcomputerghost.dragoncraft.item;

import common.net.mrcomputerghost.dragoncraft.lib.ItemIds;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModItems {
    public static Item emeraldScaleSword;
    public static Item dragonFlint;
    
    public static void init() {
        initializeItems();
        registerItems();
    }
    
    public static void initializeItems() {
        dragonFlint = (new ItemDragonFlint(ItemIds.DRAGONFLINT));
    }
    
    public static void initializeItems() {
        emeraldScaleSword = (new ItemEmeraldScaleSword(ItemIds.EMERALDSCALESWORD));
    }
    
    public static void registerItems() {
        LanguageRegistry.addName(dragonFlint, "Dragon Flint");
    }
    
    
    public static void registerItems() {
        LanguageRegistry.addName(emeraldScaleSword, "Emerald Scale Sword");
    }
}
