package de.lxca1909.lobbysystem.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player){
            Player p = (Player) sender;
//            p.sendMessage("Test");
            if(args.length == 0){
                p.sendMessage("§cDas reicht nicht. Richtiger Syntax: /changekit <kit>");
            }else if(args.length == 1){
                switch (args[0]){
                    case "ninja":
                        p.sendMessage("uff das geht endlich");
                        break;
                    case "stopmer":
                        p.sendMessage("uff das geht endlich auch");
                        break;
                    case "test":
                        break;
                    default:
                        p.sendMessage("Das ist kein richtiges Kit oder du hast es falsch geschrieben");
                }

            }
        }
        return true;
    }
}
