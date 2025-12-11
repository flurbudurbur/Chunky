package org.popcraft.chunky.api.event.task;

import org.popcraft.chunky.event.Event;

/**
 * Event which is fired when a generation task completes.
 *
 * @param world     The world identifier associated with the completed task
 * @param chunks    The number of chunks that were generated
 * @param cancelled Whether the task was cancelled before completion
 */
public record GenerationCompleteEvent(String world, long chunks, boolean cancelled) implements Event {
}
