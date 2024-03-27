package me.paulvogel.tickingentity;

import net.minecraft.entity.passive.EntityCow;
import net.minecraft.world.World;

public class CentaurEntity extends EntityCow {

    public static String ENTITY_CENTAUR_NAME = "centaur";
    public static int ENTITY_CENTAUR_ID = 201;

    public CentaurEntity(World worldIn) {
        super(worldIn);
    }

    @Override
    public void onUpdate() {
        super.onUpdate();

        throw new RuntimeException("This is a test exception");
    }
}
