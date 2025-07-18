package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ceh {
    private static volatile cru a;

    private ceh() {
    }

    public static cru a(Context context) {
        cru cruVar;
        cru cruVarD;
        cru cruVarD2;
        cru cruVar2 = a;
        if (cruVar2 != null) {
            return cruVar2;
        }
        synchronized (ceh.class) {
            cruVar = a;
            if (cruVar == null) {
                String str = Build.TYPE;
                String str2 = Build.TAGS;
                int i = cej.a;
                if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                    Context contextA = cbl.a(context);
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        StrictMode.allowThreadDiskWrites();
                        try {
                            File file = new File(contextA.getDir("phenotype_hermetic", 0), "overrides.txt");
                            cruVarD = file.exists() ? cru.d(file) : crd.a;
                        } catch (RuntimeException e) {
                            Log.e("HermeticFileOverrides", "no data dir", e);
                            cruVarD = crd.a;
                        }
                        if (cruVarD.c()) {
                            Object objA = cruVarD.a();
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream((File) objA)));
                                try {
                                    oc ocVar = new oc();
                                    HashMap map = new HashMap();
                                    while (true) {
                                        String line = bufferedReader.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        String[] strArrSplit = line.split(" ", 3);
                                        if (strArrSplit.length != 3) {
                                            Log.e("HermeticFileOverrides", "Invalid: " + line);
                                        } else {
                                            String str3 = new String(strArrSplit[0]);
                                            String strDecode = Uri.decode(new String(strArrSplit[1]));
                                            String strDecode2 = (String) map.get(strArrSplit[2]);
                                            if (strDecode2 == null) {
                                                String str4 = new String(strArrSplit[2]);
                                                strDecode2 = Uri.decode(str4);
                                                if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                    map.put(str4, strDecode2);
                                                }
                                            }
                                            oc ocVar2 = (oc) ocVar.get(str3);
                                            if (ocVar2 == null) {
                                                ocVar2 = new oc();
                                                ocVar.put(str3, ocVar2);
                                            }
                                            ocVar2.put(strDecode, strDecode2);
                                        }
                                    }
                                    Log.w("HermeticFileOverrides", "Parsed " + String.valueOf(objA) + " for Android package " + contextA.getPackageName());
                                    brb brbVar = new brb(ocVar);
                                    bufferedReader.close();
                                    cruVarD2 = cru.d(brbVar);
                                } catch (Throwable th) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException e2) {
                                throw new RuntimeException(e2);
                            }
                        } else {
                            cruVarD2 = crd.a;
                        }
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    } catch (Throwable th3) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th3;
                    }
                } else {
                    cruVarD2 = crd.a;
                }
                cruVar = cruVarD2;
                a = cruVar;
            }
        }
        return cruVar;
    }
}
