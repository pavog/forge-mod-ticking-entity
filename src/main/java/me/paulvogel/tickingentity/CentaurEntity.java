package me.paulvogel.tickingentity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class CentaurEntity extends Entity {

    public static String ENTITY_CENTAUR_NAME = "centaur";

    public static final EntityType<CentaurEntity> CENTAUR_ENTITY_TYPE = EntityType
            .register(Main.MODID + ":" + CentaurEntity.ENTITY_CENTAUR_NAME,
                    EntityType.Builder
                            .create(CentaurEntity.class, CentaurEntity::new)
                            .tracker(256, 20, false)
            );

    public CentaurEntity(World world) {
        super(CentaurEntity.CENTAUR_ENTITY_TYPE, world);
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
    protected void readAdditional(NBTTagCompound compound) {

    }

    @Override
    protected void writeAdditional(NBTTagCompound compound) {

    }
}