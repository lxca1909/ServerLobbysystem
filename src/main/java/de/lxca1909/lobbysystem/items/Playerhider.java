package de.lxca1909.lobbysystem.items;

import de.lxca1909.lobbysystem.utils.CM;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Playerhider implements Listener {

    @EventHandler
    public void on(PlayerInteractEvent e) {
        Player p = e.getPlayer();

        ItemStack hideron = new ItemStack(Material.GREEN_DYE);
        ItemMeta hidermeta = hideron.getItemMeta();
        hidermeta.setDisplayName("§aAlle anzeigen");
        hideron.setItemMeta(hidermeta);

        ItemStack hidervip = new ItemStack(Material.YELLOW_DYE);
        ItemMeta hidervipmeta = hidervip.getItemMeta();
        hidervipmeta.setDisplayName("§eNur Vips anzeigen");
        hidervip.setItemMeta(hidervipmeta);

        ItemStack hideroff = new ItemStack(Material.RED_DYE);
        ItemMeta hideroffmeta = hideroff.getItemMeta();
        hideroffmeta.setDisplayName("§cNiemand anzeigen");
        hideroff.setItemMeta(hideroffmeta);

        if (e.getItem() == null) return;
        if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (e.getItem().getType() == Material.RED_DYE) {
                if (CM.checkCooldown(p)) {
                    p.sendMessage("Used");
                    CM.setCooldown(p, 2);
                    for (Player all : Bukkit.getOnlinePlayers()) {
                        p.showPlayer(all);
                    }
                    p.getInventory().setItemInMainHand(hideron);
                } else {
                    p.sendMessage("§cWarte kurz!");
                }
            } else if (e.getItem().getType() == Material.GREEN_DYE) {
                if (CM.checkCooldown(p)) {
                    p.sendMessage("Used");
                    CM.setCooldown(p, 2);
                    for (Player other : Bukkit.getOnlinePlayers()) {
                        if (other != p) {
                            if (other.hasPermission("lobby.viphider")) {
                                p.showPlayer(other);
                            } else {
                                p.hidePlayer(other);
                            }
                        }
                    }
                    p.getInventory().setItemInMainHand(hidervip);
                } else {
                    p.sendMessage("§cWarte kurz!");
                }
            } else if (e.getItem().getType() == Material.YELLOW_DYE) {
                if (CM.checkCooldown(p)) {
                    p.sendMessage("Used");
                    CM.setCooldown(p, 2);
                    for (Player other : Bukkit.getOnlinePlayers()) {
                        p.hidePlayer(other);
                    }
                    p.getInventory().setItemInMainHand(hideroff);
                    if (CM.checkCooldown(p)) {
                        p.sendMessage("Used");
                        CM.setCooldown(p, 2);
                    }
                } else {
                    p.sendMessage("§cWarte kurz!");
                }
            }
        }
    }
}
