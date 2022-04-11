//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package net.labymod.addons.prespectivemod;

import java.lang.reflect.*;
import net.minecraftforge.client.event.*;
import org.lwjgl.input.*;
import net.minecraftforge.common.*;
import net.minecraftforge.fml.common.eventhandler.*;
import java.nio.*;

public class vfdsfgdfrhdfghjn
{
    private static Field buttonField;
    private static Field buttonsField;
    private static Field buttonStateField;
    
    static {
        try {
            vfdsfgdfrhdfghjn.buttonField = MouseEvent.class.getDeclaredField("button");
        }
        catch (NoSuchFieldException ex) {
            ex.printStackTrace();
        }
        try {
            vfdsfgdfrhdfghjn.buttonStateField = MouseEvent.class.getDeclaredField("buttonstate");
        }
        catch (NoSuchFieldException ex2) {
            ex2.printStackTrace();
        }
        try {
            vfdsfgdfrhdfghjn.buttonsField = Mouse.class.getDeclaredField("buttons");
        }
        catch (NoSuchFieldException ex3) {
            ex3.printStackTrace();
        }
    }
    
    public static void sendClick(final int i, final boolean b) {
        final MouseEvent mouseEvent = new MouseEvent();
        vfdsfgdfrhdfghjn.buttonField.setAccessible(true);
        try {
            vfdsfgdfrhdfghjn.buttonField.set(mouseEvent, i);
        }
        catch (IllegalAccessException ex) {
            ex.printStackTrace();
        }
        vfdsfgdfrhdfghjn.buttonField.setAccessible(false);
        vfdsfgdfrhdfghjn.buttonStateField.setAccessible(true);
        try {
            vfdsfgdfrhdfghjn.buttonStateField.set(mouseEvent, b);
        }
        catch (IllegalAccessException ex2) {
            ex2.printStackTrace();
        }
        vfdsfgdfrhdfghjn.buttonStateField.setAccessible(false);
        MinecraftForge.EVENT_BUS.post((Event)mouseEvent);
        try {
            vfdsfgdfrhdfghjn.buttonsField.setAccessible(true);
            final ByteBuffer byteBuffer = (ByteBuffer)vfdsfgdfrhdfghjn.buttonsField.get(null);
            vfdsfgdfrhdfghjn.buttonsField.setAccessible(false);
            byteBuffer.put(i, (byte)(b ? 1 : 0));
        }
        catch (IllegalAccessException ex3) {
            ex3.printStackTrace();
        }
    }
}
