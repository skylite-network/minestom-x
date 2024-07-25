package net.minestom.server.command;

import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.identity.Identified;
import net.minestom.server.entity.Player;
import net.minestom.server.tag.Taggable;

/**
 * Represents something which can send commands to the server.
 * <p>
 * Main implementations are {@link Player} and {@link ConsoleSender}.
 */
public interface CommandSender extends Audience, Taggable, Identified {

}
