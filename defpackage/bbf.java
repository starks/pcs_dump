package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import j$.util.Optional;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbf {
    static final bcj a = c("language_code", "en");
    public static final /* synthetic */ int b = 0;
    private final Context c;
    private final ayu d;
    private final fsc e;

    public bbf(Context context, ayu ayuVar, fsc fscVar) {
        this.c = context;
        this.d = ayuVar;
        this.e = fscVar;
    }

    public static bav a(String str, String str2) {
        asr asrVar = (asr) bav.a.createBuilder();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((bav) asrVar.a).b = str;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        bav bavVar = (bav) asrVar.a;
        str2.getClass();
        bavVar.c = str2;
        return (bav) asrVar.z();
    }

    public static bcj c(String str, String str2) {
        asr asrVar = (asr) bcj.a.createBuilder();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((bcj) asrVar.a).b = str;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        bcj bcjVar = (bcj) asrVar.a;
        str2.getClass();
        bcjVar.c = str2;
        return (bcj) asrVar.z();
    }

    public static int g(ayd aydVar) {
        axo axoVar = aydVar.b;
        if (axoVar == null) {
            axoVar = axo.a;
        }
        axl axlVar = axoVar.e;
        if (axlVar == null) {
            axlVar = axl.a;
        }
        int iB = axk.b(axlVar.b);
        if (iB == 0) {
            iB = axk.e;
        }
        int iB2 = bby.b(axk.a(iB));
        if (iB2 != 0) {
            return iB2;
        }
        throw new IllegalArgumentException(String.format("unable to convert %d to internal ClientVersion.Type", Integer.valueOf(axk.a(iB))));
    }

    public static eea h(eea eeaVar, csd csdVar, Optional optional, byte[] bArr, boolean z) {
        if (!csdVar.h()) {
            return eeaVar;
        }
        try {
            byte[] bArrI = csdVar.i(eeaVar.x(), bArr);
            return !z ? eea.r(bArrI) : eea.r((byte[]) optional.map(new bbe(bArrI, bArr, 0)).orElse(bArrI));
        } catch (GeneralSecurityException e) {
            throw new IllegalArgumentException(e);
        }
    }

    static /* synthetic */ byte[] i(byte[] bArr, byte[] bArr2, csd csdVar) {
        try {
            return csdVar.j(bArr, bArr2);
        } catch (GeneralSecurityException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private final long j(String str) {
        try {
            String str2 = this.c.getPackageManager().getPackageInfo(str.split(":", 2)[0], PackageManager.PackageInfoFlags.of(0L)).versionName;
            if (str2 == null) {
                return 4L;
            }
            return Long.parseLong(str2.split("\\.", 0)[r5.length - 1], 10);
        } catch (PackageManager.NameNotFoundException | NumberFormatException unused) {
            return 4L;
        }
    }

    private static Optional k(axo axoVar) {
        axn axnVarB = axn.b(axoVar.f);
        if (axnVarB == null) {
            axnVarB = axn.UNRECOGNIZED;
        }
        if (axnVarB == axn.VARIANT_UNSPECIFIED) {
            return Optional.empty();
        }
        cwr cwrVar = ayu.a;
        return Optional.of((String) (axnVarB == axn.UNRECOGNIZED ? Optional.empty() : axnVarB == axn.VARIANT_UNSPECIFIED ? Optional.of("") : Optional.of(axnVarB.name())).orElseThrow(new awq(axnVarB, 7)));
    }

    private static String l(axo axoVar) {
        axj axjVarB = axj.b(axoVar.d);
        if (axjVarB == null) {
            axjVarB = axj.UNRECOGNIZED;
        }
        return (String) Optional.ofNullable((String) ayu.b.get(axjVarB)).orElseThrow(new awq(axjVarB, 6));
    }

    private static String m(axo axoVar) {
        axm axmVarB = axm.b(axoVar.b);
        if (axmVarB == null) {
            axmVarB = axm.UNRECOGNIZED;
        }
        return (String) Optional.ofNullable((String) ayu.a.get(axmVarB)).orElseThrow(new awq(axmVarB, 4));
    }

    final baw b(axo axoVar) {
        String strE = e(axoVar);
        asr asrVar = (asr) baw.a.createBuilder();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        baw bawVar = (baw) asrVar.a;
        strE.getClass();
        bawVar.c = strE;
        asr asrVar2 = (asr) bap.a.createBuilder();
        long j = j(strE);
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        ((bap) asrVar2.a).b = j;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        baw bawVar2 = (baw) asrVar.a;
        bap bapVar = (bap) asrVar2.z();
        bapVar.getClass();
        bawVar2.e = bapVar;
        bawVar2.b |= 1;
        asrVar.b(a("client_group", l(axoVar)));
        asrVar.b(a("device_tier", m(axoVar)));
        k(axoVar).ifPresent(new awp(asrVar, 2));
        fsc fscVar = this.e;
        axi axiVarB = axi.b(axoVar.c);
        if (axiVarB == null) {
            axiVarB = axi.UNRECOGNIZED;
        }
        fscVar.ad(axiVarB).ifPresent(new awp(asrVar, 3));
        return (baw) asrVar.z();
    }

    final bcm d(eea eeaVar, ayd aydVar) {
        asr asrVar = (asr) bbx.a.createBuilder();
        String strF = f(aydVar);
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        bbx bbxVar = (bbx) asrVar.a;
        strF.getClass();
        bbxVar.e = strF;
        axo axoVar = aydVar.b;
        if (axoVar == null) {
            axoVar = axo.a;
        }
        String strM = m(axoVar);
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        bbx bbxVar2 = (bbx) asrVar.a;
        strM.getClass();
        bbxVar2.c = strM;
        asr asrVar2 = (asr) bbz.a.createBuilder();
        int iG = g(aydVar);
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        ((bbz) asrVar2.a).b = bby.a(iG);
        axo axoVar2 = aydVar.b;
        if (axoVar2 == null) {
            axoVar2 = axo.a;
        }
        axl axlVar = axoVar2.e;
        if (axlVar == null) {
            axlVar = axl.a;
        }
        int iB = axk.b(axlVar.b);
        if (iB == 0) {
            iB = axk.e;
        }
        long j = iB == axk.b ? 4L : j(f(aydVar));
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        ((bbz) asrVar2.a).c = j;
        bbz bbzVar = (bbz) asrVar2.z();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        bbx bbxVar3 = (bbx) asrVar.a;
        bbzVar.getClass();
        bbxVar3.f = bbzVar;
        bbxVar3.b |= 1;
        asrVar.a(a);
        axo axoVar3 = aydVar.b;
        if (axoVar3 == null) {
            axoVar3 = axo.a;
        }
        asrVar.a(c("client_group", l(axoVar3)));
        axo axoVar4 = aydVar.b;
        if (axoVar4 == null) {
            axoVar4 = axo.a;
        }
        k(axoVar4).ifPresent(new awp(asrVar, 4));
        fsc fscVar = this.e;
        axo axoVar5 = aydVar.b;
        if (axoVar5 == null) {
            axoVar5 = axo.a;
        }
        axi axiVarB = axi.b(axoVar5.c);
        if (axiVarB == null) {
            axiVarB = axi.UNRECOGNIZED;
        }
        fscVar.ad(axiVarB).ifPresent(new awp(asrVar, 5));
        asr asrVar3 = (asr) bcm.a.createBuilder();
        asr asrVar4 = (asr) bcb.a.createBuilder();
        if (!asrVar4.a.isMutable()) {
            asrVar4.B();
        }
        ((bcb) asrVar4.a).b = eeaVar;
        if (!asrVar4.a.isMutable()) {
            asrVar4.B();
        }
        ((bcb) asrVar4.a).c = true;
        if (!asrVar3.a.isMutable()) {
            asrVar3.B();
        }
        bcm bcmVar = (bcm) asrVar3.a;
        bcb bcbVar = (bcb) asrVar4.z();
        bcbVar.getClass();
        bcmVar.e = bcbVar;
        bcmVar.b |= 4;
        if (!asrVar3.a.isMutable()) {
            asrVar3.B();
        }
        bcm bcmVar2 = (bcm) asrVar3.a;
        bbx bbxVar4 = (bbx) asrVar.z();
        bbxVar4.getClass();
        bcmVar2.c = bbxVar4;
        bcmVar2.b |= 1;
        bca bcaVar = bca.a;
        if (!asrVar3.a.isMutable()) {
            asrVar3.B();
        }
        bcm bcmVar3 = (bcm) asrVar3.a;
        bcaVar.getClass();
        bcmVar3.d = bcaVar;
        bcmVar3.b |= 2;
        return (bcm) asrVar3.z();
    }

    public final String e(axo axoVar) {
        axi axiVarB = axi.b(axoVar.c);
        if (axiVarB == null) {
            axiVarB = axi.UNRECOGNIZED;
        }
        return (String) Optional.ofNullable((ayt) this.d.c.get(axiVarB)).map(new alg(13)).orElseThrow(new awq(axiVarB, 5));
    }

    public final String f(ayd aydVar) {
        axo axoVar = aydVar.b;
        if (axoVar == null) {
            axoVar = axo.a;
        }
        return e(axoVar);
    }
}
