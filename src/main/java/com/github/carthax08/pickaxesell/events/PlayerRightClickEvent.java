package com.github.carthax08.pickaxesell.events;

import com.github.carthax08.pickaxesell.PickaxeSell;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;


public class PlayerRightClickEvent implements Listener {
    PickaxeSell plugin;
    public PlayerRightClickEvent(PickaxeSell main){
        plugin = main;
    }
    @EventHandler
    public void playerRightClickEvent(PlayerInteractEvent e){
        if(e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)){
            if(e.getPlayer().getItemInHand().getType().equals(Material.DIAMOND_PICKAXE)) {
               e.getPlayer().performCommand("sellall basic");
            }
        }
    }
}
