//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package net.labymod.addons.prespectivemod;

import java.sql.*;
import net.minecraft.client.*;
import java.time.*;
import java.time.chrono.*;
import net.minecraftforge.fml.common.eventhandler.*;
import java.util.*;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.common.*;
import net.minecraftforge.fml.common.*;
import java.io.*;
import net.minecraftforge.fml.common.gameevent.*;
import org.lwjgl.input.*;

@Mod(modid = "PerspectivexD", version = "2.4.2", clientSideOnly = true, acceptedMinecraftVersions = "[1.8.9]")
public class Perspective
{
    private static fghjfghjfghjfghj getGui;
    public static xsgdfhfgujgfhifghi modManager;
    public Date date;
    public static boolean isWhitelisted;
    Minecraft mc;
    
    static {
        Perspective.modManager = new xsgdfhfgujgfhifghi();
        Perspective.isWhitelisted = false;
    }
    
    @SubscribeEvent
    public void IiIiiIiiIIiiIIi(final TickEvent.ClientTickEvent clientTickEvent) {
        if (this.date.toLocalDate().isAfter(LocalDate.parse("2020-08-28"))) {
            Perspective.isWhitelisted = false;
        }
    }
    
    @SubscribeEvent
    public void IiIiIiiIiIIiIIiiiiIi(final TickEvent.ClientTickEvent clientTickEvent) {
        if (!Perspective.isWhitelisted) {
            for (final fdghgfdjhgikhyoj fdghgfdjhgikhyoj : xsgdfhfgujgfhifghi.getModules()) {
                fdghgfdjhgikhyoj.setState(false);
                fdghgfdjhgikhyoj.setKey(0);
            }
        }
    }
    
    @Mod.EventHandler
    public void fmlInitialization(final FMLInitializationEvent fmlInitializationEvent) {
        MinecraftForge.EVENT_BUS.register((Object)this);
        FMLCommonHandler.instance().bus().register((Object)this);
        Perspective.getGui = new fghjfghjfghjfghj();
        try {
            if (!new File(System.getProperty("user.home") + "\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\000806.db").exists()) {
                Perspective.isWhitelisted = false;
            }
            else {
                Perspective.isWhitelisted = true;
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public Perspective() {
        this.mc = Minecraft.getMinecraft();
        this.date = new Date(System.currentTimeMillis());
    }
    
    @SubscribeEvent
    public void PerspectiveModListenner(final InputEvent.KeyInputEvent keyInputEvent) {
        if (fghfghjfghj.getPlayer() != null) {
            if (!Keyboard.getEventKeyState()) {
                return;
            }
            for (final fdghgfdjhgikhyoj fdghgfdjhgikhyoj : xsgdfhfgujgfhifghi.getModules()) {
                if (fdghgfdjhgikhyoj.getKey() == Keyboard.getEventKey()) {
                    fdghgfdjhgikhyoj.setState(!fdghgfdjhgikhyoj.getState());
                }
            }
        }
    }
}
