package team.sutekina.voiden;
import org.bukkit.generator.ChunkGenerator;

import org.bukkit.plugin.java.JavaPlugin;


public class Voiden extends JavaPlugin {
    @Override
    public void onEnable() {
    	
    }
    
    @Override
    public void onDisable() {
        // TODO Insert logic to be performed when the plugin is disabled
    }
    
    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        return new CustomChunkGenerator();
    }
}
