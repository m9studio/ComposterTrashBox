package ru.m9studio.ComposterTrashBox;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ComposterTrashBox extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        PluginListener listener = new PluginListener();
        Bukkit.getPluginManager().registerEvents(listener, this);
    }
}
