package winlyps.healCommand

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class HealCommandExecutor(private val plugin: HealCommand) : CommandExecutor {

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender !is Player) {
            sender.sendMessage("This command can only be used by players.")
            return true
        }

        if (!sender.hasPermission("healcommand.heal") && !sender.isOp) {
            sender.sendMessage("You do not have permission to use this command.")
            return true
        }

        sender.health = sender.maxHealth

        return true
    }
}