package net.minestom.demo.commands;

import net.kyori.adventure.text.Component;
import net.minestom.server.command.builder.Command;
import net.minestom.server.entity.Player;
import net.minestom.server.instance.LightingChunk;

public class RelightCommand extends Command {
    public RelightCommand() {
        super("relight");
        setDefaultExecutor((source, args) -> {
            if (source instanceof Player player) {
                long start = System.currentTimeMillis();
                source.sendMessage(Component.text("Relighting..."));

                var relit = LightingChunk.relight(player.getInstance(), player.getInstance().getChunks());
                source.sendMessage(Component.text(
                        "Relighted " +
                        player.getInstance().getChunks().size() +
                        " chunks in " + (System.currentTimeMillis() - start) + "ms"));

                relit.forEach(chunk -> chunk.sendChunk(player));
                source.sendMessage(Component.text("Chunks received"));
            }
        });
    }
}