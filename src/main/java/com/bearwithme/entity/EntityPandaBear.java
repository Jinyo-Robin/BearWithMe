package com.bearwithme.entity;

import com.bearwithme.BearWithMe;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

public class EntityPandaBear extends EntityPolarBear {

    public static final ResourceLocation ENTITIES_PANDA_BEAR = LootTableList.register(new ResourceLocation("bearwithme:entities/panda_bear"));

    public EntityPandaBear (World world)
    {
        super(world);
        this.setSize(1.1F, 1.4F);
    }

    public static void init()
    {
        final int whiteEggColor = 16777215;
        final int blackEggColor = 0;

        EntityRegistry.registerModEntity(
            ENTITIES_PANDA_BEAR,
            EntityPandaBear.class,
            "pandabear",
            3,
            BearWithMe.instance,
            80,
            3,
            true,
            whiteEggColor,
            blackEggColor);
    }

    @Override
    public EntityAgeable createChild (EntityAgeable ageable)
    {
        return new EntityPandaBear(this.getEntityWorld());
    }

    @Override
    public AxisAlignedBB getEntityBoundingBox ()
    {
        return super.getEntityBoundingBox();// .expand(0, 0, 0.4);
    }

    @Override
    protected void applyEntityAttributes ()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(25.0D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(25.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.40D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(6.0D);
    }
    
    @Override
    protected ResourceLocation getLootTable()
    {
        return ENTITIES_PANDA_BEAR;
    }
}
