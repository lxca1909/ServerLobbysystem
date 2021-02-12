package de.lxca1909.lobbysystem;

import de.lxca1909.lobbysystem.commands.Build;
import de.lxca1909.lobbysystem.items.Playerhider;
import de.lxca1909.lobbysystem.listener.Chatsystem;
import de.lxca1909.lobbysystem.listener.Creaturespawn;
import de.lxca1909.lobbysystem.listener.Join;
import de.lxca1909.lobbysystem.listener.MoreListeners;
import de.lxca1909.lobbysystem.utils.CM;
import org.bukkit.*;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private static Main main;
    public static String prefix = "§8[§6Lobbysystem§8]§7 ";

    @Override
    public void onEnable() {
        CM.setupCooldown();

        main = this;
        Bukkit.getConsoleSender().sendMessage(prefix+"Plugin erfolgreich gestartet...");
        ListenerRegister();
        CommandRegister();

    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(prefix+"Plugin gestoppt...");
    }
    public void ListenerRegister(){
        PluginManager plManager = Bukkit.getPluginManager();
        plManager.registerEvents(new Chatsystem(), this);
        plManager.registerEvents(new Join(), this);
        plManager.registerEvents(new Playerhider(), this);
        plManager.registerEvents(new Creaturespawn(), this);
        plManager.registerEvents(new MoreListeners(), this);
    }
    public void CommandRegister(){
        getCommand("build").setExecutor(new Build());
    }

    public static Main getMain() {
        return main;
    }
}
