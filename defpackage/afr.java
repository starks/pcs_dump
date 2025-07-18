package defpackage;

import android.util.Log;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afr {
    public final boolean b;
    private final File c;
    private final Lock d;
    private FileChannel e;
    private static final ur f = new ur(null);
    public static final Map a = new HashMap();

    public afr(String str, File file, boolean z) {
        Lock lock;
        str.getClass();
        this.b = false;
        this.c = file != null ? new File(file, str.concat(".lck")) : null;
        Map map = a;
        synchronized (map) {
            Object reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(str, reentrantLock);
            }
            lock = (Lock) reentrantLock;
        }
        this.d = lock;
    }

    public final void a(boolean z) throws IOException {
        this.d.lock();
        if (z) {
            try {
                File file = this.c;
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(new FileOutputStream(this.c).getChannel());
                fileChannelConvertMaybeLegacyFileChannelFromLibrary.lock();
                this.e = fileChannelConvertMaybeLegacyFileChannelFromLibrary;
            } catch (IOException e) {
                this.e = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.e;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.d.unlock();
    }
}
