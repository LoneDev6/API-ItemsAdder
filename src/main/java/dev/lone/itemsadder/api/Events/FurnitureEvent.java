package dev.lone.itemsadder.api.Events;

import dev.lone.itemsadder.api.CustomFurniture;
import dev.lone.itemsadder.api.NotActuallyItemsAdderException;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Abstract class representing a FurnitureEvent in the ItemsAdder API.
 * This event is triggered by a player interacting with custom furniture.
 */
abstract class FurnitureEvent extends PlayerEvent
{
    /**
     * Constructs a new FurnitureEvent.
     *
     * @param who The player who triggered the event.
     * @throws NotActuallyItemsAdderException Always thrown to indicate this is a placeholder.
     */
    public FurnitureEvent(@NotNull Player who)
    {
        super(who);
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the custom furniture associated with this event.
     *
     * @return The custom furniture, or null if not applicable.
     * @throws NotActuallyItemsAdderException Always thrown to indicate this is a placeholder.
     */
    @Nullable
    public CustomFurniture getFurniture()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the namespaced ID of the custom furniture.
     *
     * @return The namespaced ID, or null if not applicable.
     * @throws NotActuallyItemsAdderException Always thrown to indicate this is a placeholder.
     */
    @Nullable
    public String getNamespacedID()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the Bukkit entity associated with this event.
     *
     * @return The Bukkit entity.
     * @throws NotActuallyItemsAdderException Always thrown to indicate this is a placeholder.
     */
    public Entity getBukkitEntity()
    {
        throw new NotActuallyItemsAdderException();
    }
}