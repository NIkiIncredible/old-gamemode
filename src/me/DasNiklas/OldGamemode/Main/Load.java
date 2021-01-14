package me.DasNiklas.OldGamemode.Main;

import me.DasNiklas.OldGamemode.Commands.gamemodeCMD;
import org.bukkit.plugin.java.JavaPlugin;

public class Load {
    
    static JavaPlugin pl = Main.main;
    
    public static void loadListener() {

        // pl.getServer().getPluginManager().registerEvents(new ServerPingEvent(), pl);

    }
    
    public static void loadCMD() {

        pl.getCommand("gamemode").setExecutor(new gamemodeCMD());
    }
}
