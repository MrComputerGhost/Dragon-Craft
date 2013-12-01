package common.net.mrcomputerghost.dragoncraft.configuration;

import static net.minecraftforge.common.Configuration.CATEGORY_GENERAL;

import java.io.File;

import common.net.mrcomputerghost.dragoncraft.lib.BlockIds;
import common.net.mrcomputerghost.dragoncraft.lib.DimensionIds;
import common.net.mrcomputerghost.dragoncraft.lib.ItemIds;
import common.net.mrcomputerghost.dragoncraft.lib.Strings;
import net.minecraftforge.common.Configuration;

public class ConfigurationHandler {

    public static Configuration config;

    public static void init(File configFile) {
        config = new Configuration(configFile);

        /* General configs */
        ConfigurationSettings.DISPLAY_VERSION_RESULT = config.get(CATEGORY_GENERAL, ConfigurationSettings.DISPLAY_VERSION_RESULT_CONFIGNAME, ConfigurationSettings.DISPLAY_VERSION_RESULT_DEFAULT).getBoolean(ConfigurationSettings.DISPLAY_VERSION_RESULT_DEFAULT);
        ConfigurationSettings.LAST_DISCOVERED_VERSION = config.get(CATEGORY_GENERAL, ConfigurationSettings.LAST_DISCOVERED_VERSION_CONFIGNAME, ConfigurationSettings.LAST_DISCOVERED_VERSION_DEFAULT).getString();
        ConfigurationSettings.LAST_DISCOVERED_VERSION_TYPE = config.get(CATEGORY_GENERAL, ConfigurationSettings.LAST_DISCOVERED_VERSION_TYPE_CONFIGNAME, ConfigurationSettings.LAST_DISCOVERED_VERSION_TYPE_DEFAULT).getString();

        //Block Configs
        BlockIds.DRAGONPORTAL = config.getBlock(Configuration.CATEGORY_BLOCK, Strings.DRAGONPORTAL_NAME, BlockIds.DRAGONPORTAL_DEFAULT).getInt(BlockIds.DRAGONPORTAL_DEFAULT);
        BlockIds.DRAGONFIRE = config.getBlock(Configuration.CATEGORY_BLOCK, Strings.DRAGONFIRE_NAME, BlockIds.DRAGONFIRE_DEFAULT).getInt(BlockIds.DRAGONFIRE_DEFAULT);
        
        //Terrain Block Configs
        BlockIds.DRAGONEMERALD = config.getTerrainBlock(Configuration.CATEGORY_BLOCK, Strings.DRAGONEMERALD_NAME, BlockIds.DRAGONEMERALD_DEFAULT, null).getInt(BlockIds.DRAGONEMERALD_DEFAULT);

        //Item Configs
        ItemIds.DRAGONFLINT = config.getItem(Configuration.CATEGORY_ITEM, Strings.DRAGONFLINT_NAME, ItemIds.DRAGONFLINT_DEFAULT).getInt(ItemIds.DRAGONFLINT_DEFAULT);
        
        
        //Dimension Configs
        DimensionIds.DRAGONDEN = config.get(Configuration.CATEGORY_GENERAL, Strings.DRAGONDEN_NAME, DimensionIds.DRAGONDEN_DEFAULT).getInt(DimensionIds.DRAGONDEN_DEFAULT);
    }

    public static void set(String categoryName, String propertyName, String newValue) {

        config.load();
        if (config.getCategoryNames().contains(categoryName)) {
            if (config.getCategory(categoryName).containsKey(propertyName)) {
                config.getCategory(categoryName).get(propertyName).set(newValue);
            }
        }
        config.save();
    }
}
