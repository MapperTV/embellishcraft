package tv.mapper.embellishcraft.util;

import net.minecraft.block.SoundType;
import net.minecraft.util.SoundEvent;

public class ModSoundType extends SoundType
{

    public ModSoundType(float volumeIn, float pitchIn, SoundEvent breakSoundIn, SoundEvent stepSoundIn, SoundEvent placeSoundIn, SoundEvent hitSoundIn, SoundEvent fallSoundIn)
    {
        super(volumeIn, pitchIn, breakSoundIn, stepSoundIn, placeSoundIn, hitSoundIn, fallSoundIn);
    }

}
