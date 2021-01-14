package me.DasNiklas.OldGamemode.Main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static String prefix =  "§cServer §8◆ §7";
    public static String NoPerm = prefix + "§cDu hast darauf keine Rechte!";
    public static Main main;

    @Override
    public void onEnable() {

        Bukkit.getConsoleSender().sendMessage(prefix + "§aPlugin wurde aktiviert");
        main = this;

        Load.loadListener();
        Load.loadCMD();

    }

    @Override
    public void onDisable() {

        Bukkit.getConsoleSender().sendMessage(prefix + "§cPlugin wurde deaktiviert");

    }

}
