package dev.lone.itemsadder.api.Events;

import dev.lone.itemsadder.api.NotActuallyItemsAdderException;
import org.bukkit.entity.Entity;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CustomEntityDeathEvent extends Event
{
    public CustomEntityDeathEvent(Entity entity, Object internal)
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

    public String getNamespacedID()
    {
        throw new NotActuallyItemsAdderException();
    }

    public Entity getEntity()
    {
        throw new NotActuallyItemsAdderException();
    }

    @Nullable
    public Entity getKiller()
    {
        throw new NotActuallyItemsAdderException();
    }
}