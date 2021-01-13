package dev.lone.itemsadder.api;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.jetbrains.annotations.Nullable;

public class CustomMob
{
    @Nullable
    public static CustomMob spawn(String namespacedId, Location location)
    {
        throw new NotActuallyItemsAdderException();
    }

    @Nullable
    public static CustomMob byAlreadySpawned(Entity entity)
    {
        throw new NotActuallyItemsAdderException();
    }

    public Entity getEntity()
    {
        throw new NotActuallyItemsAdderException();
    }

    public EntityType getType()
    {
        throw new NotActuallyItemsAdderException();
    }

    public String getNamespacedID()
    {
        throw new NotActuallyItemsAdderException();
    }

    public String getNamespace()
    {
        throw new NotActuallyItemsAdderException();
    }

    public String getName()
    {
        throw new NotActuallyItemsAdderException();
    }

    public String getId()
    {
        throw new NotActuallyItemsAdderException();
    }
}
