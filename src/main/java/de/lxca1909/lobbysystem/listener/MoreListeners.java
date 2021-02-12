package de.lxca1909.lobbysystem.listener;

import de.lxca1909.lobbysystem.commands.Build;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPhysicsEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class MoreListeners implements Listener {

    @EventHandler
    public void on(PlayerInteractEvent e){
        if(e.getClickedBlock() == null)return;
        if(e.getAction() == Action.PHYSICAL || e.getClickedBlock().getType() == Material.OAK_TRAPDOOR || e.getClickedBlock().getType() == Material.SPRUCE_TRAPDOOR){
            if(e.getPlayer().hasPermission("lobby.interact")){
                e.setCancelled(false);
            }else {
                e.setCancelled(true);
            }
        }
        e.setCancelled(true);
    }
    @EventHandler
    public void on(BlockBreakEvent e){
        if(!Build.allowed.contains(e.getPlayer())){
            e.setCancelled(true);
        }
    }
    @EventHandler
    public void on(BlockPlaceEvent e){
        if(!Build.allowed.contains(e.getPlayer())){
            e.setCancelled(true);
        }
    }
}
