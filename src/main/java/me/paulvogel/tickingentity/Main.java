package me.paulvogel.tickingentity;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {

    public static final String MODID = "tickingentity";
    public static final String MODNAME = "Ticking Entity Crash Mod";
    public static final String VERSION = "1.12.2";

    @Instance
    public static Main instance;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        registerCentaurEntity();
    }

    public static void registerCentaurEntity() {
        EntityRegistry.registerModEntity(
                new ResourceLocation(Main.MODID + ":" + CentaurEntity.ENTITY_CENTAUR_NAME),
                CentaurEntity.class,
                CentaurEntity.ENTITY_CENTAUR_NAME,
                CentaurEntity.ENTITY_CENTAUR_ID,
                Main.instance,
                50,
                1,
                true
        );
    }

}
