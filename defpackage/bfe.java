package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.as.oss.R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfe {
    public static volatile eqi a;
    private static volatile epg b;
    private static volatile epg c;

    public bfe() {
    }

    public static epg a() {
        epg epgVarA;
        epg epgVar = b;
        if (epgVar != null) {
            return epgVar;
        }
        synchronized (bfe.class) {
            epgVarA = b;
            if (epgVarA == null) {
                epd epdVarA = epg.a();
                epdVarA.c = epf.SERVER_STREAMING;
                epdVarA.d = epg.c("com.google.android.apps.miphone.astrea.survey.api.SurveyService", "RequestSurvey");
                epdVarA.b();
                bes besVar = bes.a;
                int i = fec.b;
                epdVarA.a = new fea(besVar);
                epdVarA.b = new fea(beq.a);
                epgVarA = epdVarA.a();
                b = epgVarA;
            }
        }
        return epgVarA;
    }

    public static epg b() {
        epg epgVarA;
        epg epgVar = c;
        if (epgVar != null) {
            return epgVar;
        }
        synchronized (bfe.class) {
            epgVarA = c;
            if (epgVarA == null) {
                epd epdVarA = epg.a();
                epdVarA.c = epf.SERVER_STREAMING;
                epdVarA.d = epg.c("com.google.android.apps.miphone.astrea.survey.api.SurveyService", "StartupConfig");
                epdVarA.b();
                ber berVar = ber.a;
                int i = fec.b;
                epdVarA.a = new fea(berVar);
                epdVarA.b = new fea(beq.a);
                epgVarA = epdVarA.a();
                c = epgVarA;
            }
        }
        return epgVarA;
    }

    public static String c(InputStream inputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStream.skip(j);
            if (i <= 0) {
                i = Integer.MAX_VALUE;
            }
            while (i > 0) {
                int i2 = inputStream.read(bArr, 0, Math.min(i, 1024));
                if (i2 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
                i -= i2;
            }
            inputStream.close();
            try {
                return byteArrayOutputStream.toString("UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("Unsupported encoding UTF8. This should always be supported.", e);
            }
        } catch (IOException e2) {
            throw new RuntimeException("Failed to read license or metadata text.", e2);
        }
    }

    public static String d(Context context, String str, long j, int i) {
        Resources resources = context.getApplicationContext().getResources();
        return c(resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(R.id.dummy_placeholder))), j, i);
    }

    public static int e(int i) {
        int[] iArrF = f();
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArrF[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static int[] f() {
        return new int[]{1, 2, 3, 4, 5, 6};
    }

    public static final ExecutorService i(int i, ThreadFactory threadFactory) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public final ExecutorService g(ThreadFactory threadFactory, int i) {
        return i(1, threadFactory);
    }

    public final ExecutorService h(int i, int i2) {
        return i(i, Executors.defaultThreadFactory());
    }

    public bfe(byte[] bArr, byte[] bArr2) {
        this();
    }
}
