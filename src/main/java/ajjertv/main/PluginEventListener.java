package ajjertv.main;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public class PluginEventListener implements Listener {
    JavaPlugin plugin;

    public PluginEventListener(JavaPlugin plugin) {
        this.plugin = plugin;
    }

}
