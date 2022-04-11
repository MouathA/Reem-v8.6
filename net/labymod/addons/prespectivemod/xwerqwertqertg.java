//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package net.labymod.addons.prespectivemod;

import io.netty.channel.*;
import net.minecraft.network.play.server.*;
import java.util.*;

public class xwerqwertqertg extends ChannelDuplexHandler
{
    public void write(final ChannelHandlerContext channelHandlerContext, final Object o, final ChannelPromise channelPromise) throws Exception {
        super.write(channelHandlerContext, o, channelPromise);
    }
    
    public void channelRead(final ChannelHandlerContext channelHandlerContext, Object o) throws Exception {
        if (o instanceof S18PacketEntityTeleport) {
            S18PacketEntityTeleport onEntityTeleport = (S18PacketEntityTeleport)o;
            for (final fdghgfdjhgikhyoj fdghgfdjhgikhyoj : xsgdfhfgujgfhifghi.getModules()) {
                if (fdghgfdjhgikhyoj.getState()) {
                    onEntityTeleport = fdghgfdjhgikhyoj.onEntityTeleport(onEntityTeleport);
                }
            }
            o = onEntityTeleport;
        }
        else if (o instanceof S14PacketEntity) {
            final S14PacketEntity s14PacketEntity = (S14PacketEntity)o;
            for (final fdghgfdjhgikhyoj fdghgfdjhgikhyoj2 : xsgdfhfgujgfhifghi.getModules()) {
                if (fdghgfdjhgikhyoj2.getState() && fdghgfdjhgikhyoj2.onRelativeMove(s14PacketEntity)) {
                    return;
                }
            }
        }
        else if (o instanceof S13PacketDestroyEntities) {
            final S13PacketDestroyEntities s13PacketDestroyEntities = (S13PacketDestroyEntities)o;
            for (final fdghgfdjhgikhyoj fdghgfdjhgikhyoj3 : xsgdfhfgujgfhifghi.getModules()) {
                if (fdghgfdjhgikhyoj3.getState()) {
                    fdghgfdjhgikhyoj3.onDestroyEntities(s13PacketDestroyEntities);
                }
            }
        }
        super.channelRead(channelHandlerContext, o);
    }
}
