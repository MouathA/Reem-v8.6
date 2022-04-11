//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package net.labymod.addons.prespectivemod;

import java.lang.reflect.*;
import java.util.*;
import net.minecraft.client.*;
import net.minecraftforge.event.entity.player.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.client.entity.*;
import net.minecraft.item.*;
import net.minecraft.client.gui.*;
import org.lwjgl.input.*;
import java.awt.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraft.init.*;
import net.minecraft.client.settings.*;
import net.minecraft.util.*;
import java.awt.event.*;

public class fgfghjfghju extends fdghgfdjhgikhyoj
{
    private long klashDown;
    private long klashrop;
    public static fghjnfcgfhyhin BlockHit;
    public static fghjnfcgfhyhin Jitter;
    public static fghjnfcgfhyhin BreakBlocks;
    private List<Long> clickTimes;
    public static ghjkmgvhjlkihjop mincps;
    public long delay;
    public static ghjkmgvhjlkihjop JitterValue;
    private long nextDelay;
    private static Field h;
    private boolean Mayar;
    private long klashRightfo8;
    private Perspective p;
    private boolean skip;
    private double Sabes;
    public static ghjkmgvhjlkihjop maxcps;
    public long keepalive;
    private ghjkmgvhjlkihjop hastValue;
    private ghjghkmvhbnjkvbn timer;
    private long klashRightt7t;
    private static Field f;
    private Method guiScreenMethod;
    public static ghjkmgvhjlkihjop BlockHitValue;
    private long klashUp;
    private Method gs;
    private Random random;
    private static Field g;
    private fghjnfcgfhyhin inv;
    public static fghjnfcgfhyhin Sword;
    private long nex;
    protected Minecraft mc;
    public long threshold;
    
    @SubscribeEvent
    public void IiIiIIiIiIIi2ii2i2iiIiIiIi2(final AttackEntityEvent attackEntityEvent) {
        if (this.mc.currentScreen != null) {
            return;
        }
        final float n = (float)((int)fgfghjfghju.BlockHitValue.getValue() * 100);
        this.keepalive = System.nanoTime() / 1000000L;
        if (this.getState() && (this.keepalive - this.threshold >= n || this.threshold == -1L)) {
            this.threshold = System.nanoTime() / 1000000L;
            if (fgfghjfghju.BlockHit.getState()) {
                this.IiIiIIiIiIIi2ii2i2iiIiIiIi23();
            }
        }
    }
    
    public boolean check(final EntityPlayerSP entityPlayerSP) {
        return !fgfghjfghju.Sword.getState() || (entityPlayerSP.getCurrentEquippedItem() != null && (entityPlayerSP.getCurrentEquippedItem().getItem() instanceof ItemSword || entityPlayerSP.getCurrentEquippedItem().getItem() instanceof ItemAxe));
    }
    
    public fgfghjfghju() {
        super("AutoClicker", 0, fdghgfdjhgikhyoj.Category.Combat);
        this.mc = Minecraft.getMinecraft();
        this.keepalive = 0L;
        this.delay = 1L;
        this.threshold = 0L;
        this.p = new Perspective();
        fgfghjfghju.maxcps = new ghjkmgvhjlkihjop("Max", 17.0, 5.0, 20.0);
        fgfghjfghju.mincps = new ghjkmgvhjlkihjop("Min", 14.0, 5.0, 19.0);
        fgfghjfghju.JitterValue = new ghjkmgvhjlkihjop("JPS", 3.2, 0.0, 10.0);
        fgfghjfghju.BlockHitValue = new ghjkmgvhjlkihjop("BHPS", 6.0, 5.0, 15.0);
        fgfghjfghju.Sword = new fghjnfcgfhyhin("Sword / Axe", false);
        fgfghjfghju.BlockHit = new fghjnfcgfhyhin("Block Hit", false);
        fgfghjfghju.Jitter = new fghjnfcgfhyhin("Jitter", false);
        fgfghjfghju.BreakBlocks = new fghjnfcgfhyhin("Break Blocks", false);
        this.addValue(fgfghjfghju.mincps);
        this.addValue(fgfghjfghju.maxcps);
        this.addValue(fgfghjfghju.BlockHitValue);
        this.addValue(fgfghjfghju.JitterValue);
        this.addBoolean(fgfghjfghju.Jitter);
        this.addBoolean(fgfghjfghju.BlockHit);
        this.addBoolean(fgfghjfghju.BreakBlocks);
        this.addBoolean(fgfghjfghju.Sword);
        this.random = new Random();
        try {
            this.gs = GuiScreen.class.getDeclaredMethod("mouseClicked", Integer.TYPE, Integer.TYPE, Integer.TYPE);
        }
        catch (Exception ex) {
            try {
                this.gs = GuiScreen.class.getDeclaredMethod("mouseClicked", Integer.TYPE, Integer.TYPE, Integer.TYPE);
            }
            catch (Exception ex2) {
                this.onDisable();
            }
        }
    }
    
    private void IiIiIIiIiIIi2ii2i2iiIiIiIi() {
        if (fgfghjfghju.mincps.getValue() > fgfghjfghju.maxcps.getValue()) {
            return;
        }
        if (Mouse.isButtonDown(1)) {
            return;
        }
        long n = (int)Math.round(900.0 / fgfghjfghju.mincps.getValue() + this.random.nextDouble() * (fgfghjfghju.maxcps.getValue() - fgfghjfghju.mincps.getValue()) - 9.0);
        if (System.currentTimeMillis() > this.klashrop) {
            if (!this.Mayar && this.random.nextInt(100) >= 85) {
                this.Mayar = true;
                this.Sabes = 1.1 + this.random.nextDouble() * 0.15;
            }
            else {
                this.Mayar = false;
            }
            this.klashrop = System.currentTimeMillis() + 500L + this.random.nextInt(1500);
        }
        if (this.Mayar) {
            n *= (long)this.Sabes;
        }
        if (System.currentTimeMillis() > this.nex) {
            if (this.random.nextInt(100) >= 80) {
                n += 50L + this.random.nextInt(150);
            }
            this.nex = System.currentTimeMillis() + 500L + this.random.nextInt(1500);
        }
        this.klashDown = System.currentTimeMillis() + n;
        this.klashUp = System.currentTimeMillis() + n / 2L - this.random.nextInt(10);
        this.mc.thePlayer.swingItem();
    }
    
    public void IiIiIIiIiIIi2ii2i2iiIiIiIi23() {
        try {
            final Robot robot = new Robot();
            robot.mousePress(4);
            robot.mouseRelease(4);
        }
        catch (AWTException ex) {
            ex.printStackTrace();
        }
    }
    
    @SubscribeEvent
    public void onTick(final TickEvent.ClientTickEvent clientTickEvent) {
        if ((this.getState() || !this.getState()) && fgfghjfghju.mincps.getValue() >= fgfghjfghju.maxcps.getValue()) {
            fgfghjfghju.mincps.setValue(fgfghjfghju.maxcps.getValue() - 4.0);
        }
        if (fgfghjfghju.Jitter.getState() && this.random.nextDouble() > 0.65) {
            if (Mouse.isButtonDown(1)) {
                return;
            }
            if (this.mc.currentScreen != null) {
                return;
            }
            if (Mouse.isButtonDown(0)) {
                final float n = (float)(fgfghjfghju.JitterValue.getValue() * 0.3);
                if (this.random.nextBoolean()) {
                    final EntityPlayerSP thePlayer = this.mc.thePlayer;
                    thePlayer.rotationYaw += this.random.nextFloat() * n;
                }
                else {
                    final EntityPlayerSP thePlayer2 = this.mc.thePlayer;
                    thePlayer2.rotationYaw -= this.random.nextFloat() * n;
                }
                if (this.random.nextBoolean()) {
                    final EntityPlayerSP thePlayer3 = this.mc.thePlayer;
                    thePlayer3.rotationYaw += (float)(this.random.nextFloat() * (n * 0.75));
                }
                else {
                    final EntityPlayerSP thePlayer4 = this.mc.thePlayer;
                    thePlayer4.rotationYaw -= (float)(this.random.nextFloat() * (n * 0.75));
                }
            }
        }
        if (this.mc.currentScreen == null && this.check(this.mc.thePlayer)) {
            Mouse.poll();
            if (Mouse.isButtonDown(0)) {
                if (fgfghjfghju.BreakBlocks.getState() && this.mc.objectMouseOver != null) {
                    final BlockPos getBlockPos = this.mc.objectMouseOver.getBlockPos();
                    if (getBlockPos != null) {
                        if (this.mc.theWorld.getBlockState(getBlockPos).getBlock() != Blocks.air) {
                            KeyBinding.setKeyBindState(this.getKey(), true);
                            KeyBinding.onTick(this.getKey());
                            return;
                        }
                        KeyBinding.setKeyBindState(this.getKey(), false);
                    }
                }
                if (this.klashDown > 0L && this.klashUp > 0L) {
                    if (System.currentTimeMillis() > this.klashDown) {
                        KeyBinding.setKeyBindState(this.mc.gameSettings.keyBindAttack.getKeyCode(), true);
                        KeyBinding.onTick(this.mc.gameSettings.keyBindAttack.getKeyCode());
                        vfdsfgdfrhdfghjn.sendClick(0, true);
                        this.IiIiIIiIiIIi2ii2i2iiIiIiIi();
                    }
                    else if (System.currentTimeMillis() > this.klashUp) {
                        KeyBinding.setKeyBindState(this.mc.gameSettings.keyBindAttack.getKeyCode(), false);
                        vfdsfgdfrhdfghjn.sendClick(0, false);
                    }
                }
                else {
                    this.IiIiIIiIiIIi2ii2i2iiIiIiIi();
                }
                if (!Mouse.isButtonDown(1)) {
                    this.klashRightfo8 = 0L;
                    this.klashRightt7t = 0L;
                }
            }
            else {
                this.klashRightfo8 = 0L;
                this.klashRightt7t = 0L;
                this.klashUp = 0L;
                this.klashDown = 0L;
            }
        }
    }
    
    static {
        try {
            fgfghjfghju.g = MouseEvent.class.getDeclaredField("button");
        }
        catch (NoSuchFieldException ex) {
            ex.printStackTrace();
        }
        try {
            fgfghjfghju.f = MouseEvent.class.getDeclaredField("buttonstate");
        }
        catch (NoSuchFieldException ex2) {
            ex2.printStackTrace();
        }
        try {
            fgfghjfghju.h = Mouse.class.getDeclaredField("buttons");
        }
        catch (NoSuchFieldException ex3) {
            ex3.printStackTrace();
        }
    }
}
