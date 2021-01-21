package de.lxca1909.lobbysystem.listener;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginManager;

public class Join implements Listener {

    @EventHandler
    public void on(PlayerJoinEvent e){
        Player p = e.getPlayer();
        e.setJoinMessage("§7[§a+§7] "+p.getName());

        ItemStack navi = new ItemStack(Material.COMPASS);
        ItemMeta navimeta = navi.getItemMeta();
        navimeta.setDisplayName("§eNavigator");
        navi.setItemMeta(navimeta);

        ItemStack hideron = new ItemStack(Material.GREEN_DYE);
        ItemMeta hidermeta = hideron.getItemMeta();
        hidermeta.setDisplayName("§aAlle anzeigen");
        hideron.setItemMeta(hidermeta);


        p.getInventory().setItem(0, navi);
        if(!p.hasPlayedBefore()) {
            p.getInventory().setItem(1, hideron);
        }
        for(Player other : Bukkit.getOnlinePlayers()){

        }
    }
    @EventHandler
    public void on(PlayerQuitEvent e){
        Player p = e.getPlayer();
        e.setQuitMessage("§7[§c-§7] "+p.getName());
    }
}
