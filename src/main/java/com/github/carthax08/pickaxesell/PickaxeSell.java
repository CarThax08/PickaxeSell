package com.github.carthax08.pickaxesell;

import com.github.carthax08.pickaxesell.commands.MainCommand;
import com.github.carthax08.pickaxesell.events.PlayerRightClickEvent;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class PickaxeSell extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Checking for QuickSell...");
        if(!getServer().getPluginManager().isPluginEnabled("QuickSell")){
            getServer().getConsoleSender().sendMessage("QuickSell is not detected! Disabling.");
            getServer().getConsoleSender().sendMessage("Why would you install this without QuickSell though? It ONLY works with QuickSell");
            getServer().getPluginManager().disablePlugin(this);
        }else{
            getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "QuickSell is detected.");
            getCommand("psver").setExecutor(new MainCommand(this));
            getServer().getPluginManager().registerEvents(new PlayerRightClickEvent(this), this);
            getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "PickaxeSell by CarThax08 has finished starting. Please enjoy!");
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
