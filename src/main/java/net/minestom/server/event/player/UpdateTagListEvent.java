package net.minestom.server.event.player;

import net.minestom.server.event.Event;
import net.minestom.server.network.packet.server.common.TagsPacket;
import org.jetbrains.annotations.NotNull;

@Deprecated
public class UpdateTagListEvent implements Event {

    private final TagsPacket packet;

    public UpdateTagListEvent(@NotNull TagsPacket packet) {
        this.packet = packet;
    }

    @NotNull
    public TagsPacket getTags() {
        return packet;
    }
}
