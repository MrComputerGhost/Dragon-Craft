package common.net.mrcomputerghost.dragoncraft;

import java.io.File;

import common.net.mrcomputerghost.dragoncraft.block.ModBlocks;
import common.net.mrcomputerghost.dragoncraft.configuration.ConfigurationHandler;
import common.net.mrcomputerghost.dragoncraft.core.handlers.VersionCheckTickHandler;
import common.net.mrcomputerghost.dragoncraft.core.util.LogHelper;
import common.net.mrcomputerghost.dragoncraft.core.util.VersionHelper;
import common.net.mrcomputerghost.dragoncraft.creativetab.CreativeTabDC;
import common.net.mrcomputerghost.dragoncraft.dimension.ModDimensions;
import common.net.mrcomputerghost.dragoncraft.item.ModItems;
import common.net.mrcomputerghost.dragoncraft.lib.Reference;
import common.net.mrcomputerghost.dragoncraft.world.biome.ModBiomes;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = "DragonCraft", name = "DragonCraft", version = "V.0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class DragonCraft {
    

    public static CreativeTabs tabDC = new CreativeTabDC(CreativeTabs.getNextID(), Reference.MOD_ID);
    public static final EnumToolMaterial EnumToolLapis = EnumHelper.addToolMaterial("EDRAGONSCALE", 3, 700, 15.0F, 2.0F, 33);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // Initialise the log helper
        LogHelper.init();

        //Initialise the Configuration
        ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.CHANNEL_NAME + File.separator + Reference.MOD_ID + ".cfg"));

        // Conduct the version check and log the result
        VersionHelper.execute();

        // Initialise the Version Check Tick Handler (Client only)
        TickRegistry.registerTickHandler(new VersionCheckTickHandler(), Side.CLIENT);

        ModBlocks.init();

        ModItems.init();

        ModBiomes.init();

        ModDimensions.init();
    }

    @EventHandler
    public void load(FMLInitializationEvent event) {

        //Creative Tab Name
        LanguageRegistry.instance().addStringLocalization("itemGroup.DC", "Dragon Craft");
    }
}