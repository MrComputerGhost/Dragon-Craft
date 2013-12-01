package common.net.mrcomputerghost.dragoncraft.core.util;

import java.util.logging.Level;
import java.util.logging.Logger;

import common.net.mrcomputerghost.dragoncraft.lib.Reference;

import cpw.mods.fml.common.FMLLog;

public class LogHelper {
    private static Logger eeLogger = Logger.getLogger(Reference.MOD_ID);

    public static void init() {

        eeLogger.setParent(FMLLog.getLogger());
    }

    public static void log(Level logLevel, String message) {

        eeLogger.log(logLevel, message);
    }
}
