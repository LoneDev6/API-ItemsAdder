package dev.lone.itemsadder.api;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.jetbrains.annotations.Nullable;

/**
 * Class representing a CustomFurniture of ItemsAdder.
 * <br>This class extends the {@link CustomStack} class.
 */
public class CustomFurniture extends CustomStack
{
    /**
     * Gets a CustomFurniture instance from the provided Armor stand.
     * <br>This may return null if the Armor stand is not part of a furniture.
     * 
     * @param  armorStand
     *         The Armor stand to get the CustomFurniture from.
     * 
     * @return Possibly-null instance of CustomFurniture
     */
    @Nullable
    public static CustomFurniture byAlreadySpawned(ArmorStand armorStand)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Spawns an Armor stand with the furniture of the provided namespace and ID at the provided location and
     * returns a CustomFurniture instance for it.
     * 
     * <p><b>No Barrier block will be spawned if the CustomFurniture is solid!</b>
     * 
     * @param  namespacedId
     *         Namespace and ID of the CustomFurniture in the format {@code namespace:id}
     * @param  location
     *         The Location to spawn the Armor stand with the furniture at.
     * 
     * @return Possibly-null CustomFurniture instance.
     */
    @Nullable
    public static CustomFurniture spawnPreciseNonSolid(String namespacedId, Location location)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Spawns an Armor stand with the furniture of the provided namespace and ID at the provided Block location and
     * returns a CustomFurniture instance for it.
     * <br>This may return null if the provided namespace and ID are invalid.
     *
     * <p><b>No Barrier block will be spawned if the CustomFurniture is solid!</b>
     * 
     * @param  namespacedId
     *         Namespace and ID of the CustomFurniture in the format {@code namespace:id}
     * @param  blockLocation
     *         The Block to spawn the Armor stand with the furniture at.
     * 
     * @return Possibly-null CustomFurniture instance.
     */
    @Nullable
    public static CustomFurniture spawn(String namespacedId, Block blockLocation)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Removes this CustomFurniture and the Armor stand associated with it from the world.
     * 
     * @param dropItem
     *        If an item should be dropped.
     */
    public void remove(boolean dropItem)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Removes this CustomFurniture and the Armor stand associated with it from the world.
     * 
     * @param armorStand
     *        The Armor stand to remove with the CustomFurniture.
     * @param dropItem
     *        If an item should be dropped.
     */
    public static void remove(ArmorStand armorStand, boolean dropItem)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Teleports the Armor stand associated with this CustomFurniture to the target Bukkit Entity.
     * <br>This will also remove any Barrier blocks from its original position, if present.
     * 
     * @param destinationEntity
     *        The Bukkit Entity to teleport towards.
     */
    public void teleport(Entity destinationEntity)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Teleports the Armor stand associated with this CustomFurniture to the provided location.
     * <br>This will also remove any Barrier blocks from its original position, if present.
     *
     * @param location
     *        The location to teleport towards.
     */
    public void teleport(Location location)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the Armor stand associated with this CustomFurniture.
     * <br>This may return null if the Armor stand is not yet spawned in the world.
     * 
     * @return Possibly-null Bukkit Entity instance.
     */
    @Nullable
    public Entity getArmorstand()
    {
        throw new NotActuallyItemsAdderException();
    }
}
