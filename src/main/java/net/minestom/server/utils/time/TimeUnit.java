package net.minestom.server.utils.time;

import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public interface TimeUnit {
    TemporalUnit DAY = ChronoUnit.DAYS;
    TemporalUnit HOUR = ChronoUnit.HOURS;
    TemporalUnit MINUTE = ChronoUnit.MINUTES;
    TemporalUnit SECOND = ChronoUnit.SECONDS;
    TemporalUnit MILLISECOND = ChronoUnit.MILLIS;
    TemporalUnit SERVER_TICK = Tick.SERVER_TICKS;
    TemporalUnit CLIENT_TICK = Tick.CLIENT_TICKS;
}
