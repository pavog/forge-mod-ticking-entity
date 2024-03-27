package me.paulvogel.tickingentity;

import net.minecraft.entity.passive.EntityCow;
import net.minecraft.world.World;

public class CentaurEntity extends EntityCow {

    public static String ENTITY_CENTAUR_NAME = "centaur";

    public CentaurEntity(World worldIn) {
        super(worldIn);
    }

    @Override
    public void tick() {
        super.tick();

        throw new RuntimeException("This is a test exception");
    }

}