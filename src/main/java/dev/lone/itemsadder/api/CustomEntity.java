package dev.lone.itemsadder.api;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.util.Consumer;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Set;
import java.util.UUID;

/**
 * Class representing a custom entity in ItemsAdder
 */
public class CustomEntity
{
    /**
     * Returns a list of all the registered entities identifiers in the format {@code namespace:id}
     * @return a list of Namespaces and IDs in the format {@code namespace:id}
     */
    public static Set<String> getNamespacedIdsInRegistry()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns true if the registry contains an entity with the specified namespaced id in the format {@code namespace:id}
     * @param namespacedId Namespace and ID in the format {@code namespace:id}
     * @return true if it contains the namespaced id, otherwise false
     */
    public static boolean isInRegistry(String namespacedId)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Spawns a CustomEntity and returns the created CustomEntity instance, or null if Namespace and ID are invalid.
     *
     * @param namespacedId Namespace and ID in the format {@code namespace:id} to get the CustomEntity from.
     * @param location     the Location to spawn the CustomEntity at.
     * @param viewers the list of players which can see this entity.
     * @param frustumCulling if this entity needs to be frozen if not visible by the player.
     * @param function a function which is executed when the base entity is going to be spawned, executed at the same time of
     *                 the Spigot API function: https://hub.spigotmc.org/javadocs/spigot/org/bukkit/RegionAccessor.html#spawn%28org.bukkit.Location%2Cjava.lang.Class%2Cboolean%2Corg.bukkit.util.Consumer%29=
     * @return Possibly-null CustomEntity instance.
     */
    @Nullable
    public static CustomEntity spawn(String namespacedId,
                                     Location location,
                                     List<Player> viewers,
                                     boolean frustumCulling,
                                     @Nullable Consumer<LivingEntity> function)
    {
        throw new NotActuallyItemsAdderException();
    }

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

    public Location getLocation()
    {
        throw new NotActuallyItemsAdderException();
    }

    public void teleport(Location location)
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

    public void addViewer(Player player)
    {
        throw new NotActuallyItemsAdderException();
    }

    public void removeViewer(Player player)
    {
        throw new NotActuallyItemsAdderException();
    }

    public void setFrustumCulling(boolean cull)
    {
        throw new NotActuallyItemsAdderException();
    }

    public boolean getFrustumCulling()
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
     * Check if a custom entity model has an animation registered by its name
     * @param entityNamespacedId the custom entity identifier in the format {@code namespace:id}
     * @param animationName the animation name
     * @return true if the animation exists, otherwise false
     */
    public static boolean hasAnimation(String entityNamespacedId, String animationName)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Check if this custom entity model has an animation registered
     * @param name the animation name
     * @return true if the animation exists, otherwise false
     */
    public boolean hasAnimation(String name)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Get all custom entity model animations registered by its name
     * @param entityNamespacedId the custom entity identifier in the format {@code namespace:id}
     * @return a list of the animations registered for a custom entity
     */
    public static List<String> getAnimationsNames(String entityNamespacedId)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Get all custom entity model animations for this custom entity
     * @return a list of the animations registered for a custom entity
     */
    public List<String> getAnimationsNames()
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
     * Plays red color animation and sets entity on fire if needed
     * @param fire if the fire animation must be played or not
     */
    public void playDamageEffect(boolean fire)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Changes color of every bone of this custom entity.
     * @param color the color, can be obtained with tools like this: https://minecraftcommand.science/armor-color
     */
    public void setColorAllBones(int color)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Set enchant effect to every bone of this custom entity.
     * @param enchanted true if enchanted, otherwise false.
     */
    public void setEnchantedAllBones(boolean enchanted)
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
     * @param passenger the player to mount
     * @return true if successful, otherwise false
     */
    public boolean addPassenger(LivingEntity passenger)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Ejects this player only if it's on a custom entity.
     * @param passenger the player to eject
     */
    public static void removePassenger(LivingEntity passenger)
    {
        throw new NotActuallyItemsAdderException();
    }

    public Set<LivingEntity> getPassengers()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * @param passenger passenger {@link Entity} to check
     * @return {@code true} if this passenger rides the customEntity, otherwise {@code false}
     */
    public boolean hasPassenger(LivingEntity passenger)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * @return {@code true} if there is at least one passenger, otherwise {@code false}
     */
    public boolean hasPassenger()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Sets the passenger of the specified {@link MountBone}
     *
     * @param passenger passenger to set
     * @param ordinal index of the {@link MountBone}
     * @return {@code true} if the passenger was successfully set
     * @throws IllegalArgumentException if there is no {@link MountBone} with such index
     */
    public boolean setPassenger(LivingEntity passenger, int ordinal) throws IllegalArgumentException, IndexOutOfBoundsException
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * @return all bones of the current {@link CustomEntity}
     */
    public Set<Bone> getBones()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * @return all mount bones of the current {@link CustomEntity}
     */
    public Set<MountBone> getMountBones()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * @param index bone index within the {@link CustomEntity}
     * @return {@link Bone} at the specified index
     * @throws IndexOutOfBoundsException if there is no bone with such index
     */
    public Bone getBone(int index) throws IndexOutOfBoundsException
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the {@link MountBone} currently ridden by the specified passenger if so
     *
     * @param passenger passenger to check
     * @return Optional of the {@link MountBone}. Not empty if there is such passenger
     */
    @Nullable
    public MountBone getMountBoneByPassenger(LivingEntity passenger)
    {
        throw new NotActuallyItemsAdderException();
    }

    public static class Bone
    {
        /**
         * @return the number of the bone as it is specified within the {@link CustomEntity}.
         * The number remains the same for the same bone independent of {@link CustomEntity} instances if
         * their namespaced id is the same
         */
        public int getOrdinal()
        {
            throw new NotActuallyItemsAdderException();
        }

        /**
         * Seems to be available to get (at least with server events)
         *
         * @return the internal id of the bone custom entity
         */
        public int getId()
        {
            throw new NotActuallyItemsAdderException();
        }

        /**
         * @return current bone location in the world
         */
        public Location getLocation()
        {
            throw new NotActuallyItemsAdderException();
        }

        /**
         * Get color of this bone.
         * @return int color of this bone.
         */
        public int getColor()
        {
            throw new NotActuallyItemsAdderException();
        }

        /**
         * Changes color of this bone.
         * @param color the color, can be obtained with tools like this: https://minecraftcommand.science/armor-color
         */
        public void setColor(int color)
        {
            throw new NotActuallyItemsAdderException();
        }

        /**
         * Get if that bone has the enchant effect.
         * @return true if the bone has the enchant effect, otherwise false.
         */
        public boolean getEnchanted()
        {
            throw new NotActuallyItemsAdderException();
        }

        /**
         * Set enchant effect to this bone.
         * @param enchanted true if enchanted, otherwise false.
         */
        public void setEnchanted(boolean enchanted)
        {
            throw new NotActuallyItemsAdderException();
        }
    }

    public static class MountBone extends Bone
    {
        /**
         * @return May be null if the bone is not occupied
         */
        @Nullable
        LivingEntity getPassenger()
        {
            throw new NotActuallyItemsAdderException();
        }

        /**
         * Sets or replaces the passenger of the mount bone
         *
         * @param entity passenger to set
         */
        boolean setPassenger(LivingEntity entity)
        {
            throw new NotActuallyItemsAdderException();
        }

        void removePassenger()
        {
            throw new NotActuallyItemsAdderException();
        }
    }
}
