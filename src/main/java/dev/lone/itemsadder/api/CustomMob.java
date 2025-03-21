package dev.lone.itemsadder.api;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.jetbrains.annotations.Nullable;

@Deprecated
public class CustomMob
{
    @Nullable
    public static CustomMob spawn(String namespacedId, Location location)
    {
        throw new AssertionError("Deprecated. This feature was removed in 4.0.10");
    }

    @Nullable
    public static CustomMob byAlreadySpawned(Entity entity)
    {
        throw new AssertionError("Deprecated. This feature was removed in 4.0.10");
    }

    public Entity getEntity()
    {
        throw new AssertionError("Deprecated. This feature was removed in 4.0.10");
    }

    public EntityType getType()
    {
        throw new AssertionError("Deprecated. This feature was removed in 4.0.10");
    }

    public String getNamespacedID()
    {
        throw new AssertionError("Deprecated. This feature was removed in 4.0.10");
    }

    public String getNamespace()
    {
        throw new AssertionError("Deprecated. This feature was removed in 4.0.10");
    }

    public String getName()
    {
        throw new AssertionError("Deprecated. This feature was removed in 4.0.10");
    }

    public String getId()
    {
        throw new AssertionError("Deprecated. This feature was removed in 4.0.10");
    }
}