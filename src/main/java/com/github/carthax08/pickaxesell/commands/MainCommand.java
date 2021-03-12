package com.github.carthax08.pickaxesell.commands;

import com.github.carthax08.pickaxesell.PickaxeSell;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MainCommand implements CommandExecutor {
    PickaxeSell plugin;
    public MainCommand(PickaxeSell main){
        plugin = main;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(ChatColor.GREEN + "Getting version... Please wait...");
        sender.sendMessage(ChatColor.GREEN + "PickaxeSell version 1.0 is running.");
        return true;
    }
}
