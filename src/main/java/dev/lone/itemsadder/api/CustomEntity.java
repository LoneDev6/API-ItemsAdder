package dev.lone.itemsadder.api;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

/**
 * Class representing a custom entity in ItemsAdder
 */
public class CustomEntity
{
    /**
     * Spawns a CustomEntity and returns the created CustomEntity instance, or null if Namespace and ID are invalid.
     *
     * @param namespacedId Namespace and ID in the format {@code namespace:id} to get the CustomEntity from.
     * @param location     the Location to spawn the CustomEntity at.
     * @return Possibly-null CustomEntity instance.
     */
    @Nullable
    public static CustomEntity spawn(String namespacedId, Location location)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets a CustomEntity instance through a Bukkit Entity.
     * <br>This returns null if the provided Entity doesn't belong to a CustomEntity.
     *
     * @param entity The Bukkit Entity to get the CustomEntity from.
     * @return Possibly-null CustomEntity instance.
     */
    @Nullable
    public static CustomEntity byAlreadySpawned(Entity entity)
    {
        throw new NotActuallyItemsAdderException();
    }

    public static boolean isCustomEntity(Entity entity)
    {
        throw new NotActuallyItemsAdderException();
    }

    public static boolean isCustomEntity(UUID uuid)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the Bukkit Entity associated with this CustomEntity.
     *
     * @return The Bukkit Entity associated with the CustomEntity.
     */
    public Entity getEntity()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the Bukkit EntityType associated with this CustomEntity.
     *
     * @return The Bukkit EntityType associated with the CustomEntity.
     */
    public EntityType getType()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the Namespace and ID in the format {@code namespace:id} for this CustomEntity.
     *
     * @return String representing the namespace and ID of the CustomEntity.
     */
    public String getNamespacedID()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the Namespace for this CustomEntity.
     *
     * @return String representing the namespace of the CustomEntity.
     */
    public String getNamespace()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the ID of this CustomEntity.
     *
     * @return String representing the ID of the CustomEntity.
     */
    public String getId()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Sends respawn packets to the specified player
     * @param player the player to send packets to
     */
    public void respawn(Player player)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Plays an animation and executes an action after it's finished
     * @param name the animation name
     * @param callback the action to be executed after the animation is finished
     * @return true if the animation was played, otherwise false
     */
    public boolean playAnimation(String name, @Nullable Runnable callback)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Plays an animation
     * @param name the animation name
     * @return true if the animation was played, otherwise false
     */
    public boolean playAnimation(String name)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Stops the currently playing animation
     */
    public void stopAnimation()
    {
        throw new NotActuallyItemsAdderException();
    }

    public boolean isPlayingAnimation(String name)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Completely removes this entity from the world
     */
    public void destroy()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Check if this entity has any mount bone and can be mounted by players
     * @return true if it can be mounted, otherwise false
     */
    public boolean hasMountBones()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Adds a passenger to this entity to the first available mount slot
     * @param player the player to mount
     * @return
     */
    public boolean addPassenger(Player player)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Ejects this player only if it's on a custom entity.
     * @param player the player to eject
     */
    public static void removePassenger(Player player)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Plays red color animation and sets entity on fire if needed
     * @param fire if the fire animation must be played or not
     */
    public void playDamageEffect(boolean fire)
    {
        throw new NotActuallyItemsAdderException();
    }
}
