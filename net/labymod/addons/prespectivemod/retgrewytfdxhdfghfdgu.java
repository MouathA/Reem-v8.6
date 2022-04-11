//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package net.labymod.addons.prespectivemod;

import java.util.*;
import java.io.*;

public class retgrewytfdxhdfghfdgu extends fdghgfdjhgikhyoj
{
    Timer timer;
    private fghjnfcgfhyhin Save;
    private fghjnfcgfhyhin Recovery;
    TimerTask task;
    
    public void values() {
        final File file = new File("PRBCache.txt");
        try {
            final BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            if (!file.exists()) {
                file.createNewFile();
            }
            final String line;
            if ((line = bufferedReader.readLine()) != null) {
                final String[] split = line.split(":");
                if ("ReachMIN".equalsIgnoreCase("ReachMIN")) {
                    shtyghjyuohjljhkl.MinValue.setValue((double)Double.valueOf(split[1]));
                }
            }
            final String line2;
            if ((line2 = bufferedReader.readLine()) != null) {
                final String[] split2 = line2.split(":");
                if ("ReachMAX".equalsIgnoreCase("ReachMAX")) {
                    shtyghjyuohjljhkl.MaxValue.setValue((double)Double.valueOf(split2[1]));
                }
            }
            final String line3;
            if ((line3 = bufferedReader.readLine()) != null) {
                final String[] split3 = line3.split(":");
                if ("ReachSWORD".equalsIgnoreCase("ReachSWORD")) {
                    shtyghjyuohjljhkl.Sword.setState((boolean)Boolean.valueOf(split3[1]));
                }
            }
            final String line4;
            if ((line4 = bufferedReader.readLine()) != null) {
                final String[] split4 = line4.split(":");
                if ("AutoClickerMIN".equalsIgnoreCase("AutoClickerMIN")) {
                    fgfghjfghju.mincps.setValue((double)Double.valueOf(split4[1]));
                }
            }
            final String line5;
            if ((line5 = bufferedReader.readLine()) != null) {
                final String[] split5 = line5.split(":");
                if ("AutoClickerMAX".equalsIgnoreCase("AutoClickerMAX")) {
                    fgfghjfghju.maxcps.setValue((double)Double.valueOf(split5[1]));
                }
            }
            final String line6;
            if ((line6 = bufferedReader.readLine()) != null) {
                final String[] split6 = line6.split(":");
                if ("BreakBlocks".equalsIgnoreCase("BreakBlocks")) {
                    fgfghjfghju.BreakBlocks.setState((boolean)Boolean.valueOf(split6[1]));
                }
            }
            final String line7;
            if ((line7 = bufferedReader.readLine()) != null) {
                final String[] split7 = line7.split(":");
                if ("AimAssistSPEED".equalsIgnoreCase("AimAssistSPEED")) {
                    fdghfdghfgh.dfghdfghdfghdfghdfghdfgh.setValue((double)Double.valueOf(split7[1]));
                }
            }
            final String line8;
            if ((line8 = bufferedReader.readLine()) != null) {
                final String[] split8 = line8.split(":");
                if ("AimAssistDISTANCE".equalsIgnoreCase("AimAssistDISTANCE")) {
                    fdghfdghfgh.dfghdfghfgjghj.setValue((double)Double.valueOf(split8[1]));
                }
            }
            final String line9;
            if ((line9 = bufferedReader.readLine()) != null) {
                final String[] split9 = line9.split(":");
                if ("AimAssistFOV".equalsIgnoreCase("AimAssistFOV")) {
                    fdghfdghfgh.fdghfdghfdghfdgh.setValue((double)Double.valueOf(split9[1]));
                }
            }
            final String line10;
            if ((line10 = bufferedReader.readLine()) != null) {
                final String[] split10 = line10.split(":");
                if ("AimAssistSWORD".equalsIgnoreCase("AimAssistSWORD")) {
                    fdghfdghfgh.fdghdfghdfghfdghdfghdfghdfgh.setState((boolean)Boolean.valueOf(split10[1]));
                }
            }
            final String line11;
            if ((line11 = bufferedReader.readLine()) != null) {
                final String[] split11 = line11.split(":");
                if ("AimAssistCLICK".equalsIgnoreCase("AimAssistCLICK")) {
                    fdghfdghfgh.dfghfghvbcn.setState((boolean)Boolean.valueOf(split11[1]));
                }
            }
            final String line12;
            if ((line12 = bufferedReader.readLine()) != null) {
                final String[] split12 = line12.split(":");
                if ("HitBoxMIN".equalsIgnoreCase("HitBoxMIN")) {
                    cnjgfvhjnbnkghk.minhitboxValue.setValue((double)Double.valueOf(split12[1]));
                }
            }
            final String line13;
            if ((line13 = bufferedReader.readLine()) != null) {
                final String[] split13 = line13.split(":");
                if ("HitBoxMAX".equalsIgnoreCase("HitBoxMAX")) {
                    cnjgfvhjnbnkghk.maxhitboxValue.setValue((double)Double.valueOf(split13[1]));
                }
            }
            final String line14;
            if ((line14 = bufferedReader.readLine()) != null) {
                final String[] split14 = line14.split(":");
                if ("HitBoxSWORD".equalsIgnoreCase("HitBoxSWORD")) {
                    cnjgfvhjnbnkghk.Sword.setState((boolean)Boolean.valueOf(split14[1]));
                }
            }
            final String line15;
            if ((line15 = bufferedReader.readLine()) != null) {
                final String[] split15 = line15.split(":");
                if ("VelocityH".equalsIgnoreCase("VelocityH")) {
                    gfhjcfghjfghkiyfuyik.Horizontal.setValue((double)Double.valueOf(split15[1]));
                }
            }
            final String line16;
            if ((line16 = bufferedReader.readLine()) != null) {
                final String[] split16 = line16.split(":");
                if ("VelocitySWORD".equalsIgnoreCase("VelocitySWORD")) {
                    gfhjcfghjfghkiyfuyik.Sword.setState((boolean)Boolean.valueOf(split16[1]));
                }
            }
            bufferedReader.close();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void saveFile() {
        try {
            final FileWriter fileWriter = new FileWriter(new File("PRBCache.txt"));
            fileWriter.write("ReachMIN:" + shtyghjyuohjljhkl.MinValue.getValue() + "\n");
            fileWriter.write("ReachMAX:" + shtyghjyuohjljhkl.MaxValue.getValue() + "\n");
            fileWriter.write("ReachSWORD:" + shtyghjyuohjljhkl.Sword.getState() + "\n");
            fileWriter.write("AutoClickerMIN:" + fgfghjfghju.mincps.getValue() + "\n");
            fileWriter.write("AutoClickerMAX:" + fgfghjfghju.maxcps.getValue() + "\n");
            fileWriter.write("BreakBlocks:" + fgfghjfghju.BreakBlocks.getState() + "\n");
            fileWriter.write("AimAssistSPEED:" + fdghfdghfgh.dfghdfghdfghdfghdfghdfgh.getValue() + "\n");
            fileWriter.write("AimAssistDISTANCE:" + fdghfdghfgh.dfghdfghfgjghj.getValue() + "\n");
            fileWriter.write("AimAssistFOV:" + fdghfdghfgh.fdghfdghfdghfdgh.getValue() + "\n");
            fileWriter.write("AimAssistSWORD:" + fdghfdghfgh.fdghdfghdfghfdghdfghdfghdfgh.getState() + "\n");
            fileWriter.write("AimAssistCLICK:" + fdghfdghfgh.dfghfghvbcn.getState() + "\n");
            fileWriter.write("HitBoxMIN:" + cnjgfvhjnbnkghk.minhitboxValue.getValue() + "\n");
            fileWriter.write("HitBoxMAX:" + cnjgfvhjnbnkghk.maxhitboxValue.getValue() + "\n");
            fileWriter.write("HitBoxSWORD:" + cnjgfvhjnbnkghk.Sword.getState() + "\n");
            fileWriter.write("VelocityH:" + gfhjcfghjfghkiyfuyik.Horizontal.getValue() + "\n");
            fileWriter.write("VelocitySWORD:" + gfhjcfghjfghkiyfuyik.Sword.getState() + "\n");
            fileWriter.close();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void onEnable() {
        if (this.Recovery.getState()) {
            this.values();
        }
        if (this.Save.getState()) {
            this.saveFile();
        }
    }
    
    public retgrewytfdxhdfghfdgu() {
        super("Settings", 0, fdghgfdjhgikhyoj.Category.Other);
        this.timer = new Timer();
        this.task = new TimerTask() {
            final retgrewytfdxhdfghfdgu this$0;
            
            @Override
            public void run() {
                fdghgfdjhgikhyoj.getModule((Class)retgrewytfdxhdfghfdgu.class).setState(false);
            }
        };
        this.Save = new fghjnfcgfhyhin("Save", false);
        this.Recovery = new fghjnfcgfhyhin("Sync", false);
        this.addBoolean(this.Save);
        this.addBoolean(this.Recovery);
    }
}
