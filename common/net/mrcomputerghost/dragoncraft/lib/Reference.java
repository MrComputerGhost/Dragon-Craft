package common.net.mrcomputerghost.dragoncraft.lib;

public class Reference {
    public static final boolean DEBUG_MODE = false;

    /* General Mod related constants */
    public static final String MOD_ID = "DC";
    public static final String MOD_NAME = "DragonCraft";
    public static final String VERSION_NUMBER = "0.0.2";
    public static final String CHANNEL_NAME = MOD_ID;
    public static final String DEPENDENCIES = "required-after:Forge@[7.8.0.684,)";
    public static final String FINGERPRINT = "@FINGERPRINT@";
    public static final int SECOND_IN_TICKS = 20;
    public static final int SHIFTED_ID_RANGE_CORRECTION = 256;
    public static final String SERVER_PROXY_CLASS = "net.yellbana.dragoncraft.core.proxy.CommonProxy";
    public static final String CLIENT_PROXY_CLASS = "net.yellbana.dragoncraft.core.proxy.ClientProxy";
    public static final int VERSION_CHECK_ATTEMPTS = 3;
}
