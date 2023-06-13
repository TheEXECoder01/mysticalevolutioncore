package me.coder.mysticalevolution;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(REFERENCES.MODID)
public class Mysticalevolution {
    public Mysticalevolution() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    }
}
