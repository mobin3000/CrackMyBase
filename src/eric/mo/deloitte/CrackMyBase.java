// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space
// Source File Name:   CrackMyBase.java
package eric.mo.deloitte;

import java.io.*;

public class CrackMyBase
{

    private CrackMyBase()
            throws IOException
    {
        long time = System.currentTimeMillis() / (long)1000;
        RandomAccessFile configFile = new RandomAccessFile("C:\\Users\\ericmo\\AppData\\Local\\wjjsoft\\nyfedit7\\myBase.ini"
                                                                , "rw");
        do
        {
            String line;
            if ((line = configFile.readLine()) == null)
                break;
            if (!line.contains("App.UserLic.FirstUseOn"))
                continue;
            configFile.seek(configFile.getFilePointer() - (long)12);
            System.out.println("Success");
            configFile.writeBytes("" + time);
            break;
        } while (true);
        System.out.println("-----------------Finished-----------123---445-789-");

        configFile.close();
    }

    public static void main(String args[])
            throws IOException
    {
        System.out.println("-----------------Begin---------000---------");

        CrackMyBase crackMyBase = new CrackMyBase();
    }
}
