package dev.lone.itemsadder.api.Events;

import dev.lone.itemsadder.api.CustomFurniture;
import dev.lone.itemsadder.api.NotActuallyItemsAdderException;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

abstract class FurnitureEvent extends PlayerEvent implements Cancellable
{
    public FurnitureEvent(@NotNull Player who)
    {
        super(who);
        throw new NotActuallyItemsAdderException();
    }

    @Override
    public boolean isCancelled()
    {
        throw new NotActuallyItemsAdderException();
    }

    @Override
    public void setCancelled(boolean cancelled)
    {
        throw new NotActuallyItemsAdderException();
    }

    @Nullable
    public CustomFurniture getFurniture()
    {
        throw new NotActuallyItemsAdderException();
    }

    @Nullable
    public String getNamespacedID()
    {
        throw new NotActuallyItemsAdderException();
    }

    public Entity getBukkitEntity()
    {
        throw new NotActuallyItemsAdderException();
    }
}