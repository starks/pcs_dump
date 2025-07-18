package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bzh implements csg {
    private final /* synthetic */ int a;

    public /* synthetic */ bzh(int i) {
        this.a = i;
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x015f: MOVE (r9 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:352), block:B:79:0x015e */
    @Override // defpackage.csg
    public final Object a() throws Throwable {
        IOException e;
        Closeable closeable;
        String str;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads;
        long j;
        int i = this.a;
        int size = 0;
        if (i != 0) {
            if (i == 1) {
                return bfv.b();
            }
            if (i == 2) {
                Context context = cem.a;
                return cnx.y(Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: cek
                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable) {
                        Context context2 = cem.a;
                        return new Thread(runnable, "ProcessStablePhenotypeFlag");
                    }
                }));
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException();
                }
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                try {
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    Log.i("PhenotypeProcessReaper", "Memory state is: " + runningAppProcessInfo.importance);
                } catch (RuntimeException e2) {
                    Log.w("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e2);
                }
                z = runningAppProcessInfo.importance >= 400;
                return Boolean.valueOf(z);
            }
            csg csgVar = cfi.a;
            Map map = new cxh().a;
            if (map == null) {
                return cwn.a;
            }
            Set<Map.Entry> setEntrySet = map.entrySet();
            if (setEntrySet.isEmpty()) {
                return cwn.a;
            }
            cxe cxeVar = new cxe(setEntrySet.size());
            for (Map.Entry entry : setEntrySet) {
                Object key = entry.getKey();
                cxo cxoVarM = cxo.m(((cxm) entry.getValue()).i());
                if (!cxoVarM.isEmpty()) {
                    cxeVar.b(key, cxoVarM);
                    size += cxoVarM.size();
                }
            }
            return new cxq(cxeVar.e(), size);
        }
        Closeable closeable2 = null;
        try {
            try {
                str = "/proc/" + Process.myPid() + "/status";
                threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th) {
                th = th;
                bnf.a(closeable2);
                throw th;
            }
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
                try {
                    for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                        String strTrim = line.trim();
                        if (strTrim.startsWith("Groups:")) {
                            String[] strArrSplit = strTrim.substring(7).trim().split("\\s", -1);
                            int length = strArrSplit.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    z = false;
                                    break;
                                }
                                try {
                                    j = Long.parseLong(strArrSplit[i2]);
                                } catch (NumberFormatException unused) {
                                }
                                if (j >= 1000 && j < 2000) {
                                    break;
                                }
                                i2++;
                            }
                            bnf.a(bufferedReader);
                            return Boolean.valueOf(z);
                        }
                    }
                    throw new IllegalStateException("Missing Groups entry from /proc/pid/status.");
                } catch (IOException e4) {
                    e = e4;
                    throw new IllegalStateException("Unable to access /proc/pid/status: " + e.getMessage());
                }
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        } catch (Throwable th2) {
            th = th2;
            closeable2 = closeable;
            bnf.a(closeable2);
            throw th;
        }
    }
}
