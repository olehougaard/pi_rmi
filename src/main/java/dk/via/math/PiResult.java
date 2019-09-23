package dk.via.math;

import java.io.Serializable;
import java.math.BigDecimal;

public class PiResult implements Serializable {
    private BigDecimal pi;
    private long timeMs;

    public PiResult(BigDecimal pi, long timeMs) {
        this.pi = pi;
        this.timeMs = timeMs;
    }

    public BigDecimal getPi() {
        return pi;
    }

    public long getTimeMs() {
        return timeMs;
    }
}
