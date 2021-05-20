package dev.lone.itemsadder.api;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.jetbrains.annotations.Nullable;

public class CustomFurniture extends CustomStack
{
    /**
     * Gets a furniture from an already spawned armorstand in the world.
     * @param armorStand
     * @return Returns null if the armorstand is not a furniture.
     */
    @Nullable
    public static CustomFurniture byAlreadySpawned(ArmorStand armorStand)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Spawns the armorstand precisely on a location. WARNING: no barrier will be spawned if the furniture is solid.
     * @param namespacedId
     * @param location
     * @return
     */
    @Nullable
    public static CustomFurniture spawnPreciseNonSolid(String namespacedId, Location location)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Spawns the armorstand precisely on a location.
     * @param namespacedId
     * @param blockLocation
     * @return
     */
    @Nullable
    public static CustomFurniture spawn(String namespacedId, Block blockLocation)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Removes the armorstand entity from world completely
     * @param dropItem
     */
    public void remove(boolean dropItem)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Removes the armorstand entity from world completely
     * @param armorStand
     * @param dropItem
     */
    public static void remove(ArmorStand armorStand, boolean dropItem)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Teleports the armorstand entity, if needed it removes also the solid barrier block.
     * @param destinationEntity
     */
    public void teleport(Entity destinationEntity)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Teleports the armorstand entity, if needed it removes also the solid barrier block.
     * @param location
     */
    public void teleport(Location location)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Get the armorstand
     * @return null if it's not spawned in world
     */
    @Nullable
    public Entity getArmorstand()
    {
        throw new NotActuallyItemsAdderException();
    }
}
