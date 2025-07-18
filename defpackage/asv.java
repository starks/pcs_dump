package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.apps.aicore.aidl.AIFeature;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class asv implements Runnable {
    final /* synthetic */ frd a;
    final /* synthetic */ ParcelFileDescriptor b;
    final /* synthetic */ feu c;
    final /* synthetic */ asi d;
    final /* synthetic */ asx e;
    private long f = 0;

    public asv(asx asxVar, frd frdVar, ParcelFileDescriptor parcelFileDescriptor, feu feuVar, asi asiVar) {
        this.a = frdVar;
        this.b = parcelFileDescriptor;
        this.c = feuVar;
        this.d = asiVar;
        this.e = asxVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        try {
            InputStream inputStreamC = this.a.c();
            try {
                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = this.b == null ? null : new ParcelFileDescriptor.AutoCloseOutputStream(this.b);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        if (((feq) this.c).d()) {
                            asx.c(null, this.e.b, this.d, this.f);
                            if (autoCloseOutputStream != null) {
                                autoCloseOutputStream.close();
                            }
                        } else {
                            int i = inputStreamC.read(bArr);
                            if (i == -1) {
                                ((czl) ((czl) asx.a.c()).i("com/google/android/apps/miphone/astrea/http/service/HttpGrpcBindableService$1", "run", AIFeature.Id.IMAGE_DESCRIPTION_SMALL_TALKBACK, "HttpGrpcBindableService.java")).s("[pfd-write] DOWNLOAD COMPLETE: Downloaded %d bytes from URL [%s].", this.f, this.d.b);
                                this.c.a();
                                asx.d(this.e.b, this.d, 1, this.f);
                                if (autoCloseOutputStream != null) {
                                    autoCloseOutputStream.close();
                                }
                            } else if (i > 0) {
                                this.f += i;
                                if (autoCloseOutputStream != null) {
                                    autoCloseOutputStream.write(bArr, 0, i);
                                } else {
                                    feu feuVar = this.c;
                                    asr asrVar = (asr) asj.a.createBuilder();
                                    asr asrVar2 = (asr) asp.a.createBuilder();
                                    eea eeaVarS = eea.s(bArr, 0, i);
                                    if (!asrVar2.a.isMutable()) {
                                        asrVar2.B();
                                    }
                                    asp aspVar = (asp) asrVar2.a;
                                    aspVar.b = 1 | aspVar.b;
                                    aspVar.c = eeaVarS;
                                    asp aspVar2 = (asp) asrVar2.z();
                                    if (!asrVar.a.isMutable()) {
                                        asrVar.B();
                                    }
                                    asj asjVar = (asj) asrVar.a;
                                    aspVar2.getClass();
                                    asjVar.c = aspVar2;
                                    asjVar.b = 2;
                                    feuVar.c((asj) asrVar.z());
                                }
                            }
                        }
                    }
                    inputStreamC.close();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    inputStreamC.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (eqr e) {
            if (((feq) this.c).d()) {
                asx.c(e, this.e.b, this.d, this.f);
            } else {
                this.c.b(e);
                asx.d(this.e.b, this.d, 2, this.f);
            }
        } catch (IOException e2) {
            ((czl) ((czl) ((czl) asx.a.e()).h(e2)).i("com/google/android/apps/miphone/astrea/http/service/HttpGrpcBindableService$1", "run", AIFeature.Id.GBOARD_WRITING_TOOLS, "HttpGrpcBindableService.java")).r("Failed performing IO operation while handling URL '%s'", this.d.b);
            this.c.b(e2);
            asx.d(this.e.b, this.d, 2, this.f);
        }
    }
}
