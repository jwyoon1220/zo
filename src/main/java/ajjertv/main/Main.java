package ajjertv.main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;



public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info(ChatColor.AQUA + "[Plugin is Enable]");
        getServer().getPluginManager().registerEvents(new Event(), this);
        getServer().getPluginManager().registerEvents(new PluginEventListener(this), this);
        getCommand("zo").setExecutor(new Zombie());
        getCommand("Bob").setExecutor(new Bob());
        getCommand("Aob").setExecutor(new Le());
        getCommand("Cbob").setExecutor(new Cbob());
    }

    @Override
    public void onDisable() {
        getLogger().info(ChatColor.AQUA + "[Plugin is Disable]");
    }

}
