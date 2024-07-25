package net.minestom.demo.commands;

import net.kyori.adventure.text.Component;
import net.minestom.server.command.CommandSender;
import net.minestom.server.command.builder.Command;
import net.minestom.server.command.builder.CommandContext;
import net.minestom.server.entity.Entity;
import net.minestom.server.entity.Player;

import java.util.Collection;

import static net.minestom.server.command.builder.arguments.ArgumentType.Float;
import static net.minestom.server.command.builder.arguments.ArgumentType.Literal;

public class FindCommand extends Command {
    public FindCommand() {
        super("find");

        this.addSyntax(
                this::executorEntity,
                Literal("entity"),
                Float("range")
        );
    }

    private void executorEntity(CommandSender sender, CommandContext context) {
        Player player = (Player) sender;
        float range = context.get("range");

        Collection<Entity> entities = player.getInstance().getNearbyEntities(player.getPosition(), range);

        player.sendMessage(Component.text("Search result: "));

        for (Entity entity : entities) {
            player.sendMessage(Component.text("    " + entity.getEntityType() + ": "));
            player.sendMessage(Component.text("        Meta: " + entity.getEntityMeta()));
            player.sendMessage(Component.text("        Position: " + entity.getPosition()));
        }

        player.sendMessage(Component.text("End result"));
    }
}
