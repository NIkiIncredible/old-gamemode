package me.DasNiklas.OldGamemode.Commands;

import me.DasNiklas.OldGamemode.Main.Main;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gamemodeCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender.hasPermission("oldGamemdoe.change")) {
            if(args.length == 2) {
                Player p = Bukkit.getPlayer(args[1]);

                if(args[0].equalsIgnoreCase("c") || args[0].equalsIgnoreCase("creative") || args[0].equalsIgnoreCase("1")) {
                    p.setGameMode(GameMode.CREATIVE);
                } else if(args[0].equalsIgnoreCase("s") || args[0].equalsIgnoreCase("survival") || args[0].equalsIgnoreCase("0")) {
                    p.setGameMode(GameMode.SURVIVAL);
                } else if(args[0].equalsIgnoreCase("spec") || args[0].equalsIgnoreCase("SPECTATOR") || args[0].equalsIgnoreCase("3")) {
                    p.setGameMode(GameMode.SPECTATOR);
                } else if(args[0].equalsIgnoreCase("a") || args[0].equalsIgnoreCase("adventure") || args[0].equalsIgnoreCase("2")) {
                    p.setGameMode(GameMode.ADVENTURE);
                } else {
                    sender.sendMessage("Dies ist kein gültiger Gamemode.");
                    return false;
                }

                sender.sendMessage("Gamemode zu " + p.getGameMode() + " gewechselt");
                p.sendMessage("Gamemode zu " + p.getGameMode() + " gewechselt");


            } else if(args.length == 1) {
                if(sender instanceof Player) {
                    Player p = (Player) sender;
                    if(args[0].equalsIgnoreCase("c") || args[0].equalsIgnoreCase("creative") || args[0].equalsIgnoreCase("1")) {
                        p.setGameMode(GameMode.CREATIVE);
                    } else if(args[0].equalsIgnoreCase("s") || args[0].equalsIgnoreCase("survival") || args[0].equalsIgnoreCase("0")) {
                        p.setGameMode(GameMode.SURVIVAL);
                    } else if(args[0].equalsIgnoreCase("spec") || args[0].equalsIgnoreCase("SPECTATOR") || args[0].equalsIgnoreCase("3")) {
                        p.setGameMode(GameMode.SPECTATOR);
                    } else if(args[0].equalsIgnoreCase("a") || args[0].equalsIgnoreCase("adventure") || args[0].equalsIgnoreCase("2")) {
                        p.setGameMode(GameMode.ADVENTURE);
                    } else {
                        sender.sendMessage("Dies ist kein gültiger Gamemode.");
                        return false;
                    }
                    p.sendMessage("Gamemode zu " + p.getGameMode() + " gewechselt");
                } else {
                    sender.sendMessage("Du bist kein Spieler!");
                }
            } else {
                sender.sendMessage("Benutzung: /gamemode <Spielmodus> [Spieler]");
            }
        } else {
            sender.sendMessage(Main.NoPerm);
        }

        return false;
    }
}
