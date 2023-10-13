package dev.lone.itemsadder.api;

import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.block.Block;
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
     * @param entity The Entity to get the CustomFurniture from.
     * @return Possibly-null instance of CustomFurniture
     */
    @Nullable
    public static CustomFurniture byAlreadySpawned(Entity entity)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets a CustomFurniture instance from the provided Block.
     * <br>This may return null if the Block is not part of a furniture hit-box.
     *
     * @param block The Block to get the CustomFurniture from.
     * @return Possibly-null instance of CustomFurniture
     */
    @Nullable
    public static CustomFurniture byAlreadySpawned(Block block)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Spawns an Armor stand with the furniture of the provided namespace and ID at the provided location and
     * returns a CustomFurniture instance for it.
     *
     * <p><b>No Barrier block will be spawned if the CustomFurniture is solid!</b>
     *
     * @param namespacedId Namespace and ID of the CustomFurniture in the format {@code namespace:id}
     * @param location     The Location to spawn the Armor stand with the furniture at.
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
     * @param namespacedId  Namespace and ID of the CustomFurniture in the format {@code namespace:id}
     * @param blockLocation The Block to spawn the Armor stand with the furniture at.
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
     * @param dropItem if an item should be dropped.
     */
    public void remove(boolean dropItem)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Removes this CustomFurniture and the Armor stand associated with it from the world.
     *
     * @param entity the Entity to remove with the CustomFurniture.
     * @param dropItem   if an item should be dropped.
     */
    public static void remove(Entity entity, boolean dropItem)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Teleports the Armor stand associated with this CustomFurniture to the target Bukkit Entity.
     * <br>This will also remove any Barrier blocks from its original position, if present.
     *
     * @param destinationEntity the Bukkit Entity to teleport towards.
     */
    public void teleport(Entity destinationEntity)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Teleports the Armor stand associated with this CustomFurniture to the provided location.
     * <br>This will also remove any Barrier blocks from its original position, if present.
     *
     * @param location the location to teleport towards.
     */
    public void teleport(Location location)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Replace the model of this furniture with the model of another furniture.
     *
     * @param newFurnitureNamespacedId the namespace and ID of the new furniture model.
     */
    public void replaceFurniture(String newFurnitureNamespacedId)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Replace the model of this furniture with the model of another furniture.
     *
     * @param newFurnitureNamespacedId the namespace and ID of the new furniture model.
     * @param color the new color of this furniture. Will apply only to naturally colorable items.
     */
    public void replaceFurniture(String newFurnitureNamespacedId, Color color)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Replace color of this furniture. Will apply only to naturally colorable items.
     *
     * @param color the new color of this furniture. Will apply only to naturally colorable items.
     */
    public void setColor(Color color)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns the original light level of this CustomFurniture.
     *
     * @return Integer representing the original light level of the CustomFurniture.
     */
    public int getOriginalLightLevel()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Sets the current light level for this CustomFurniture.
     *
     * @param level The light level to set for this CustomFurniture.
     */
    public void setCurrentLightLevel(int level)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the Armor stand associated with this CustomFurniture.
     * <br>This may return null if the Armor stand is not yet spawned in the world.
     *
     * @return Possibly-null Bukkit Entity instance.
     * @deprecated use {@link CustomFurniture#getEntity()} instead.
     */
    @Nullable
    public Entity getArmorstand()
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
    public Entity getEntity()
    {
        throw new NotActuallyItemsAdderException();
    }
}
