package me.paulvogel.tickingentity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

import static me.paulvogel.tickingentity.Main.MODID;

public class CentaurEntity extends Entity {

    public static String ENTITY_CENTAUR_NAME = "centaur";

    public static final EntityType<CentaurEntity> CENTAUR_ENTITY_TYPE = (EntityType<CentaurEntity>) EntityType
            .Builder
            .<CentaurEntity>create(CentaurEntity::new, EntityClassification.MISC)
            .setCustomClientFactory((spawnEntity, world) -> new CentaurEntity(world))
            .build(MODID + ":" + CentaurEntity.ENTITY_CENTAUR_NAME)
            .setRegistryName(new ResourceLocation(MODID, CentaurEntity.ENTITY_CENTAUR_NAME));


    public CentaurEntity(World world) {
        super(CentaurEntity.CENTAUR_ENTITY_TYPE, world);
    }

    public CentaurEntity(EntityType<CentaurEntity> type, World world) {
        super(type, world);
    }

    @Override
    public void tick() {
        super.tick();

        throw new RuntimeException("This is a test exception");
    }

    @Override
    protected void registerData() {

    }

    @Override
    protected void readAdditional(CompoundNBT compoundNBT) {

    }

    @Override
    protected void writeAdditional(CompoundNBT compoundNBT) {

    }

    @Override
    public IPacket<?> createSpawnPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }
}