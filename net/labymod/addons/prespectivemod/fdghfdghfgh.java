//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package net.labymod.addons.prespectivemod;

import net.minecraft.entity.player.*;
import net.minecraft.entity.*;
import java.util.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraft.item.*;
import org.lwjgl.input.*;
import net.minecraft.client.entity.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class fdghfdghfgh extends fdghgfdjhgikhyoj
{
    public static ghjkmgvhjlkihjop dfghdfghfgjghj;
    private boolean AimBot;
    public static ghjkmgvhjlkihjop fdghfdghfdghfdgh;
    private boolean Team;
    public static ghjkmgvhjlkihjop dfghdfghdfghdfghdfghdfgh;
    public static fghjnfcgfhyhin fdghdfghdfghfdghdfghdfghdfgh;
    public static fghjnfcgfhyhin dfghfghvbcn;
    
    public static boolean IiIiiIiiiIIIIIiIIiIiIii11112611(final Entity entity, float n) {
        n *= 0.5;
        final double n2 = ((fdghfdghfgh.mc.thePlayer.rotationYaw - IiIiiIiiiIIIIIiIIiIiIii11112(entity)) % 360.0 + 540.0) % 360.0 - 180.0;
        return (n2 > 0.0 && n2 < n) || (-n < n2 && n2 < 0.0);
    }
    
    public boolean IiIiiIiiiIIIIIiIIiIiIii111(final Entity entity) {
        return !(entity instanceof EntityPlayer) || ((EntityPlayer)entity).getTeam() == null || !((EntityPlayer)entity).isOnSameTeam((EntityLivingBase)fdghfdghfgh.mc.thePlayer) || !this.IiIiIiiIiIiIiIl();
    }
    
    public static double IiIiiIiiiIIIIIiIIiIiIii1111261(final Entity entity) {
        return ((fdghfdghfgh.mc.thePlayer.rotationYaw - IiIiiIiiiIIIIIiIIiIiIii11112(entity)) % 360.0 + 540.0) % 360.0 - 180.0;
    }
    
    public static float IiIiiIiiiIIIIIiIIiIiIii11112(final Entity entity) {
        final double y = entity.posX - fdghfdghfgh.mc.thePlayer.posX;
        final double n = entity.posY - fdghfdghfgh.mc.thePlayer.posY;
        final double x = entity.posZ - fdghfdghfgh.mc.thePlayer.posZ;
        final double n2 = -(Math.atan2(y, x) * 57.29577951308232);
        final double n3 = -(Math.asin(n / Math.sqrt(y * y + n * n + x * x)) * 57.29577951308232);
        return (float)n2;
    }
    
    public Entity IiiiiI() {
        Entity entity = null;
        int n = (int)fdghfdghfgh.fdghfdghfdghfdgh.getValue();
        for (final Entity entity2 : fdghfdghfgh.mc.theWorld.loadedEntityList) {
            if (entity2.isEntityAlive() && !entity2.isInvisible() && entity2 != fdghfdghfgh.mc.thePlayer && fdghfdghfgh.mc.thePlayer.getDistanceToEntity(entity2) <= fdghfdghfgh.dfghdfghfgjghj.getValue() && this.IiIiiIiiiIIIIIiIIiIiIii111(entity2) && entity2 instanceof EntityPlayer && fdghfdghfgh.mc.thePlayer.canEntityBeSeen(entity2) && IiIiiIiiiIIIIIiIIiIiIii11112611(entity2, (float)n) && !nklghjkghjkghjlhgjuik.playerName.contains(entity2.getName())) {
                entity = entity2;
                n = (int)IiIiiIiiiIIIIIiIIiIiIii1111261(entity2);
            }
        }
        return entity;
    }
    
    @SubscribeEvent
    public void IiIiIiiIiIiIiI(final TickEvent tickEvent) {
        if (fdghfdghfgh.mc.theWorld != null) {
            if (fdghfdghfgh.fdghdfghdfghfdghdfghdfghdfgh.getState()) {
                if (fdghfdghfgh.mc.thePlayer.getCurrentEquippedItem() == null) {
                    return;
                }
                if (!(fdghfdghfgh.mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemSword)) {
                    return;
                }
            }
            if (fdghfdghfgh.dfghfghvbcn.getState() && !Mouse.isButtonDown(0)) {
                return;
            }
            if (fdghfdghfgh.mc.currentScreen != null) {
                return;
            }
            final Entity iiiiiI = this.IiiiiI();
            if (this.getState() && iiiiiI != null && (IiIiiIiiiIIIIIiIIiIiIii1111261(iiiiiI) > 1.0 || IiIiiIiiiIIIIIiIIiIiIii1111261(iiiiiI) < -1.0)) {
                final boolean b = IiIiiIiiiIIIIIiIIiIiIii1111261(iiiiiI) > 0.0;
                final EntityPlayerSP thePlayer = fdghfdghfgh.mc.thePlayer;
                thePlayer.rotationYaw += (float)(b ? (-(Math.abs(IiIiiIiiiIIIIIiIIiIiIii1111261(iiiiiI)) / fdghfdghfgh.dfghdfghdfghdfghdfghdfgh.getValue())) : (Math.abs(IiIiiIiiiIIIIIiIIiIiIii1111261(iiiiiI)) / fdghfdghfgh.dfghdfghdfghdfghdfghdfgh.getValue()));
            }
        }
    }
    
    public fdghfdghfgh() {
        super("AimAssist", 0, Category.Combat);
        fdghfdghfgh.dfghdfghdfghdfghdfghdfgh = new ghjkmgvhjlkihjop("Speed", 0.0, 0.0, 600.0);
        fdghfdghfgh.dfghdfghfgjghj = new ghjkmgvhjlkihjop("Distance", 5.2, 3.0, 7.0);
        fdghfdghfgh.fdghfdghfdghfdgh = new ghjkmgvhjlkihjop("Fov", 180.0, 30.0, 360.0);
        fdghfdghfgh.fdghdfghdfghfdghdfghdfghdfgh = new fghjnfcgfhyhin("Sword", false);
        fdghfdghfgh.dfghfghvbcn = new fghjnfcgfhyhin("While Click", false);
        this.addValue(fdghfdghfgh.dfghdfghdfghdfghdfghdfgh);
        this.addValue(fdghfdghfgh.dfghdfghfgjghj);
        this.addValue(fdghfdghfgh.fdghfdghfdghfdgh);
        this.addBoolean(fdghfdghfgh.fdghdfghdfghfdghdfghdfghdfgh);
        this.addBoolean(fdghfdghfgh.dfghfghvbcn);
    }
    
    public boolean IiIiIiiIiIiIiIl() {
        return this.Team;
    }
}
