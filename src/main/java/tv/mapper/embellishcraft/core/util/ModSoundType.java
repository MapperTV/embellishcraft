package tv.mapper.embellishcraft.core.util;

import java.util.function.Supplier;

import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;

public class ModSoundType extends ForgeSoundType
{

    public ModSoundType(float volumeIn, float pitchIn, Supplier<SoundEvent> breakSoundIn, Supplier<SoundEvent> stepSoundIn, Supplier<SoundEvent> placeSoundIn, Supplier<SoundEvent> hitSoundIn, Supplier<SoundEvent> fallSoundIn)
    {
        super(volumeIn, pitchIn, breakSoundIn, stepSoundIn, placeSoundIn, hitSoundIn, fallSoundIn);
    }
}