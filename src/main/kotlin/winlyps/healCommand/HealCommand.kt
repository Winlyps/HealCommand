package winlyps.healCommand

import org.bukkit.plugin.java.JavaPlugin

class HealCommand : JavaPlugin() {

    override fun onEnable() {
        // Register the command executor
        getCommand("heal")?.setExecutor(HealCommandExecutor(this))

        logger.info("HealCommand plugin has been enabled!")
    }

    override fun onDisable() {
        logger.info("HealCommand plugin has been disabled!")
    }
}