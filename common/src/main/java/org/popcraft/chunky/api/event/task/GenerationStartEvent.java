package org.popcraft.chunky.api.event.task;

import org.popcraft.chunky.event.Cancellable;

/**
 * Event fired before a generation task starts.
 * Can be cancelled to prevent the default task from running.
 */
public class GenerationStartEvent extends Cancellable {
    private final String world;
    private final String shape;
    private final double centerX;
    private final double centerZ;
    private final double radiusX;
    private final double radiusZ;
    private final String pattern;

    public GenerationStartEvent(final String world, final String shape, final double centerX, final double centerZ,
                                final double radiusX, final double radiusZ, final String pattern) {
        this.world = world;
        this.shape = shape;
        this.centerX = centerX;
        this.centerZ = centerZ;
        this.radiusX = radiusX;
        this.radiusZ = radiusZ;
        this.pattern = pattern;
    }

    public String world() {
        return world;
    }

    public String shape() {
        return shape;
    }

    public double centerX() {
        return centerX;
    }

    public double centerZ() {
        return centerZ;
    }

    public double radiusX() {
        return radiusX;
    }

    public double radiusZ() {
        return radiusZ;
    }

    public String pattern() {
        return pattern;
    }
}
