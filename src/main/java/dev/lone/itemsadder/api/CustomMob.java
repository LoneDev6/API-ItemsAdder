package dev.lone.itemsadder.api;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.jetbrains.annotations.Nullable;

/**
 * Class representing a custom mob in ItemsAdder
 */
public class CustomMob
{
    /**
     * Spawns a CustomMob and returns the created CustomMob instance, or null if Namespace and ID are invalid.
     * 
     * @param  namespacedId
     *         Namespace and ID in the format {@code namespace:id} to get the CustomMob from.
     * @param  location
     *         The Location to spawn the CustomMob at.
     * 
     * @return Possibly-null CustomMob instance.
     */
    @Nullable
    public static CustomMob spawn(String namespacedId, Location location)
    {
        throw new NotActuallyItemsAdderException();
    }
    
    /**
     * Gets a CustomMob instance through a Bukkit Entity.
     * <br>This returns null if the provided Entity doesn't belong to a CustomMob. // TODO: Check if that is correct
     * 
     * @param  entity
     *         The Bukkit Entity to get the CustomMob from.
     * 
     * @return Possibly-null CustomMob instance.
     */
    @Nullable
    public static CustomMob byAlreadySpawned(Entity entity)
    {
        throw new NotActuallyItemsAdderException();
    }
    
    /**
     * Gets the Bukkit Entity associated with this CustomMob.
     * 
     * @return The Bukkit Entity associated with the CustomMob.
     */
    public Entity getEntity()
    {
        throw new NotActuallyItemsAdderException();
    }
    
    /**
     * Gets the Bukkit EntityType associated with this CustomMob.
     * 
     * @return The Bukkit EntityType associated with the CustomMob.
     */
    public EntityType getType()
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
     * Gets the Namespace for this CustomMob.
     * 
     * @return String representing the namespace of the CustomMob.
     */
    public String getNamespace()
    {
        throw new NotActuallyItemsAdderException();
    }
    
    /**
     * Gets the name of this CustomMob.
     * 
     * @return String representing the name of the CustomMob.
     */
    public String getName()
    {
        throw new NotActuallyItemsAdderException();
    }
    
    /**
     * Gets the ID of this CustomMob.
     * 
     * @return String representing the ID of the CustomMob.
     */
    public String getId()
    {
        throw new NotActuallyItemsAdderException();
    }
}
