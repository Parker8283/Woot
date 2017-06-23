package ipsis.woot.tileentity.ng.power.storage;

import ipsis.woot.tileentity.multiblock.EnumMobFactoryTier;
import net.minecraftforge.energy.IEnergyStorage;

import javax.annotation.Nonnull;

public interface IPowerStation {

    void setTier(EnumMobFactoryTier tier);
    int consume(int power);
    @Nonnull IEnergyStorage getEnergyStorage();
}