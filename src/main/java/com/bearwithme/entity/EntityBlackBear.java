package com.bearwithme.entity;


import com.bearwithme.BearWithMe;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityBlackBear extends EntityPolarBear {

    public static final ResourceLocation ENTITIES_BLACK_BEAR = LootTableList.register(new ResourceLocation("bearwithme:entities/black_bear"));

    public EntityBlackBear (World worldIn)
    {
        super(worldIn);
        this.setSize(1.3F, 1.4F);
    }
    
    public static void init()
    {
        final int blackEggColor = 0;
        final int brownEggColor = 6442291;

        EntityRegistry.registerModEntity(
            ENTITIES_BLACK_BEAR,
            EntityBlackBear.class,
            "blackbear",
            2,
            BearWithMe.instance,
            80,
            3,
            true,
            blackEggColor,
            brownEggColor);
    }

    @Override
    public EntityAgeable createChild (EntityAgeable ageable)
    {
        return new EntityBlackBear(this.getEntityWorld());
    }

    @Override
    protected void applyEntityAttributes ()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(50.0D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(25.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(8.0D);
    }

	@Override
    protected ResourceLocation getLootTable()
    {
        return ENTITIES_BLACK_BEAR;
    }
}
