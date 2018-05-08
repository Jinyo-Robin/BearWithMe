package com.bearwithme.entity;

import com.bearwithme.BearWithMe;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityGrizzlyBear extends EntityPolarBear {

    public static final ResourceLocation ENTITIES_GRIZZLY_BEAR = LootTableList.register(new ResourceLocation("bearwithme:entities/grizzly_bear"));

    public EntityGrizzlyBear (World worldIn)
    {
        super(worldIn);
        this.setSize(1.3F, 1.4F);
    }


    public static void init()
    {
        final int brownEggColor = 6442291;
        final int blackEggColor = 0;

        EntityRegistry.registerModEntity(
            ENTITIES_GRIZZLY_BEAR,
            EntityGrizzlyBear.class,
            "grizzlybear",
            1,
            BearWithMe.instance,
            80,
            3,
            true,
            brownEggColor,
            blackEggColor);
    }

    @Override
    public EntityAgeable createChild (EntityAgeable ageable)
    {

        return new EntityGrizzlyBear(this.getEntityWorld());
    }

    @Override
    protected void applyEntityAttributes ()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(40.0D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(25.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(7.0D);
    }
    
    @Override
    protected ResourceLocation getLootTable()
    {
        return ENTITIES_GRIZZLY_BEAR;
    }
}