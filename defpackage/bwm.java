package defpackage;

import android.content.Context;
import android.os.Build;
import j$.nio.channels.DesugarChannels;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.nio.channels.FileLockInterruptionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwm {
    private static final cbx a = cbr.c("FileLogger");
    private static final Object b = Build.ID;

    public static void a(Context context, dfa dfaVar) {
        FileOutputStream fileOutputStream;
        synchronized (b) {
            File file = new File(context.getExternalFilesDir(null).getAbsolutePath().replace(context.getPackageName(), context.getPackageName()), "brella_clearcut_log");
            try {
                try {
                    fileOutputStream = new FileOutputStream(file, true);
                } catch (IOException e) {
                    cbx cbxVar = a;
                    cbxVar.e("Make sure you have READ_EXTERNAL_STORAGE and WRITE_EXTERNAL_STORAGE permissions declared in your AndroidManifest.xml");
                    if (!(e instanceof FileNotFoundException)) {
                        throw new AssertionError(e);
                    }
                    cbxVar.h("The log file didn't exist when trying to append a log event!");
                }
            } catch (FileLockInterruptionException unused) {
                Thread.interrupted();
                a(context, dfaVar);
                Thread.currentThread().interrupt();
            }
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                try {
                    FileLock fileLockLock = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileOutputStream.getChannel()).lock();
                    try {
                        asr asrVar = (asr) cce.a.createBuilder();
                        if (!asrVar.a.isMutable()) {
                            asrVar.B();
                        }
                        cce cceVar = (cce) asrVar.a;
                        dfaVar.getClass();
                        efm efmVar = cceVar.b;
                        if (!efmVar.c()) {
                            cceVar.b = efb.mutableCopy(efmVar);
                        }
                        cceVar.b.add(dfaVar);
                        ((cce) asrVar.z()).writeTo(dataOutputStream);
                        dataOutputStream.flush();
                        file.getAbsolutePath();
                        if (fileLockLock != null) {
                            fileLockLock.close();
                        }
                        dataOutputStream.close();
                        fileOutputStream.close();
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}
