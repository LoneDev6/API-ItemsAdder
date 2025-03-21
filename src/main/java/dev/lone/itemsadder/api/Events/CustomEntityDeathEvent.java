package dev.lone.itemsadder.api.Events;

import dev.lone.itemsadder.api.NotActuallyItemsAdderException;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Event called when a custom entity is killed.
 */
public class CustomEntityDeathEvent extends Event
{
    public CustomEntityDeathEvent(LivingEntity entity, Object internal)
    {
        throw new NotActuallyItemsAdderException();
    }

    @NotNull
    public HandlerList getHandlers()
    {
        throw new NotActuallyItemsAdderException();
    }

    @NotNull
    public static HandlerList getHandlerList()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the Namespace and ID in the format {@code namespace:id} for this CustomMob.
     *
     * @return String representing the namespace and ID of the CustomMob.
     */
    public String getNamespacedID()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the Bukkit Entity associated with this CustomMob.
     *
     * @return The Bukkit Entity associated with the CustomMob.
     */
    public LivingEntity getEntity()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the Bukkit Entity which killed the CustomMob.
     *
     * @return Possibly-null Bukkit Entity, it's very unlikely to be tho. It happens only if the CustomMob is misconfigured.
     */
    @Nullable
    public Player getKiller()
    {
        throw new NotActuallyItemsAdderException();
    }
}