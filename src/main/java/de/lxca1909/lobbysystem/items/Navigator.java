package de.lxca1909.lobbysystem.items;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class Navigator implements Listener {

    @EventHandler
    public void on(PlayerInteractEvent e){
        Player p = e.getPlayer();
        if(e.getItem() == null)return;
        if(e.getItem().getType() == Material.COMPASS){

        }
    }
}