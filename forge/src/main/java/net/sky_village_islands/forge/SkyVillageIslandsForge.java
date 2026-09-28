package net.sky_village_islands.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import net.sky_village_islands.SkyVillageIslands;

;

@Mod(SkyVillageIslands.MOD_ID)
public final class SkyVillageIslandsForge {
    public SkyVillageIslandsForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(SkyVillageIslands.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        SkyVillageIslands.init();
    }
}
