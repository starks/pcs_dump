package defpackage;

import j$.util.Optional;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import java.util.zip.InflaterInputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbq implements bbd {
    static final eox a = eox.c("X-GOOG-API-KEY", epc.b);
    public static final czn b = czn.j("com/google/android/apps/miphone/astrea/pd/processor/impl/ProtectedDownloadProcessorImpl");
    public static final bbc c;
    public final djz d;
    public final Executor e;
    public final bbf f;
    public final ayj g;
    public final ayo h;
    public final bbb i;
    public final api j;
    public final bnz k;
    private final bao l;

    static {
        asr asrVar = (asr) bbc.a.createBuilder();
        eea eeaVar = eea.b;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        bbc bbcVar = (bbc) asrVar.a;
        eeaVar.getClass();
        bbcVar.b |= 2;
        bbcVar.d = eeaVar;
        c = (bbc) asrVar.z();
    }

    public bbq(ayo ayoVar, djz djzVar, Executor executor, api apiVar, bnz bnzVar, bao baoVar, bbb bbbVar, bbf bbfVar, ayj ayjVar) {
        this.h = ayoVar;
        this.d = djzVar;
        this.e = executor;
        this.j = apiVar;
        this.k = bnzVar;
        this.l = baoVar;
        this.i = bbbVar;
        this.f = bbfVar;
        this.g = ayjVar;
    }

    private final djy g(String str) {
        return dij.i(this.k.d(str), new arl(str, 2), this.d);
    }

    @Override // defpackage.bbd
    public final djy a(final axt axtVar) {
        try {
            Pattern pattern = bbs.a;
            boolean z = true;
            clq.w(axtVar.c.length() == 39, "unexpected api key size");
            clq.w(bbs.a.matcher(axtVar.c).matches(), "api key contains illegal characters");
            ayd aydVar = axtVar.b;
            if (aydVar == null) {
                aydVar = ayd.a;
            }
            axp axpVar = aydVar.c;
            if (axpVar == null) {
                axpVar = axp.a;
            }
            clq.w(!axpVar.b.w(), "missing public key");
            bbf bbfVar = this.f;
            ayd aydVar2 = axtVar.b;
            if (aydVar2 == null) {
                aydVar2 = ayd.a;
            }
            final String strF = bbfVar.f(aydVar2);
            try {
                this.i.a(strF);
                ayo ayoVar = this.h;
                ayd aydVar3 = axtVar.b;
                if (aydVar3 == null) {
                    aydVar3 = ayd.a;
                }
                axo axoVar = aydVar3.b;
                if (axoVar == null) {
                    axoVar = axo.a;
                }
                axi axiVarB = axi.b(axoVar.c);
                if (axiVarB == null) {
                    axiVarB = axi.UNRECOGNIZED;
                }
                final elu eluVarA = ayoVar.a(axiVarB);
                final bbm bbmVar = new bbm(this, axtVar, z ? 1 : 0);
                ayd aydVar4 = axtVar.b;
                if (aydVar4 == null) {
                    aydVar4 = ayd.a;
                }
                axo axoVar2 = aydVar4.b;
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
                final boolean z2 = iB == axk.d;
                return dij.j(dij.j(dij.j(djr.q(g(strF)), new dis() { // from class: bbi
                    @Override // defpackage.dis
                    public final djy a(Object obj) {
                        return this.a.c((bbc) obj, bbmVar, z2);
                    }
                }, this.d), new dis() { // from class: bbj
                    @Override // defpackage.dis
                    public final djy a(Object obj) throws GeneralSecurityException, IOException {
                        bbp bbpVar = (bbp) obj;
                        bbc bbcVarB = bbpVar.b();
                        csd csdVarC = bbpVar.c();
                        axt axtVar2 = axtVar;
                        bbq bbqVar = this.a;
                        String str = (String) bbqVar.h.b().orElse(axtVar2.c);
                        epc epcVar = new epc();
                        epcVar.f(bbq.a, str);
                        bco bcoVar = (bco) ((bco) ((bco) bco.b(new bcn(0), eluVarA)).d(new fep(epcVar))).c(bbqVar.e);
                        ayd aydVar5 = axtVar2.b;
                        if (aydVar5 == null) {
                            aydVar5 = ayd.a;
                        }
                        ((czl) ((czl) bbq.b.c()).i("com/google/android/apps/miphone/astrea/pd/processor/impl/ProtectedDownloadProcessorImpl", "downloadBlob", 275, "ProtectedDownloadProcessorImpl.java")).r("downloading blob with public key hash %s.", csdVarC.g());
                        bbf bbfVar2 = bbqVar.f;
                        byte[] bArrK = csdVarC.k();
                        byte[] bArrX = bbcVarB.d.x();
                        ayk aykVarA = bbpVar.a();
                        asr asrVar = (asr) bcd.a.createBuilder();
                        int iB2 = aykVarA.b() - 1;
                        int i = iB2 != 0 ? iB2 != 1 ? bch.e : bch.c : bch.b;
                        asr asrVar2 = (asr) bci.a.createBuilder();
                        if (!asrVar2.a.isMutable()) {
                            asrVar2.B();
                        }
                        ((bci) asrVar2.a).c = bch.a(i);
                        if (aykVarA.b() == 1) {
                            eea eeaVarA = aykVarA.a();
                            if (!asrVar2.a.isMutable()) {
                                asrVar2.B();
                            }
                            ((bci) asrVar2.a).b = eeaVarA;
                        }
                        bci bciVar = (bci) asrVar2.z();
                        if (!asrVar.a.isMutable()) {
                            asrVar.B();
                        }
                        bcd bcdVar = (bcd) asrVar.a;
                        bciVar.getClass();
                        bcdVar.d = bciVar;
                        bcdVar.b |= 2;
                        eea eeaVarR = eea.r(bArrK);
                        ayd aydVar6 = axtVar2.b;
                        if (aydVar6 == null) {
                            aydVar6 = ayd.a;
                        }
                        bcm bcmVarD = bbfVar2.d(eeaVarR, aydVar6);
                        if (!asrVar.a.isMutable()) {
                            asrVar.B();
                        }
                        bcd bcdVar2 = (bcd) asrVar.a;
                        bcmVarD.getClass();
                        bcdVar2.c = bcmVarD;
                        bcdVar2.b |= 1;
                        eea eeaVarR2 = eea.r(bArrX);
                        if (!asrVar.a.isMutable()) {
                            asrVar.B();
                        }
                        ((bcd) asrVar.a).e = eeaVarR2;
                        asr asrVar3 = (asr) bcs.a.createBuilder();
                        if (!asrVar3.a.isMutable()) {
                            asrVar3.B();
                        }
                        ((bcs) asrVar3.a).c = true;
                        if (!asrVar3.a.isMutable()) {
                            asrVar3.B();
                        }
                        ((bcs) asrVar3.a).b = true;
                        if (!asrVar.a.isMutable()) {
                            asrVar.B();
                        }
                        bcd bcdVar3 = (bcd) asrVar.a;
                        bcs bcsVar = (bcs) asrVar3.z();
                        bcsVar.getClass();
                        bcdVar3.f = bcsVar;
                        bcdVar3.b |= 4;
                        int iB3 = axs.b(axtVar2.d);
                        if (iB3 == 0) {
                            iB3 = axs.d;
                        }
                        int iB4 = bcc.b(axs.a(iB3));
                        if (iB4 == 0) {
                            throw new IllegalArgumentException(String.format("unable to convert %d to external DownloadMode", Integer.valueOf(axs.a(iB3))));
                        }
                        if (!asrVar.a.isMutable()) {
                            asrVar.B();
                        }
                        ((bcd) asrVar.a).g = bcc.a(iB4);
                        bcd bcdVar4 = (bcd) asrVar.z();
                        elu eluVar = bcoVar.a;
                        epg epgVarA = bcp.a;
                        if (epgVarA == null) {
                            synchronized (bcp.class) {
                                epgVarA = bcp.a;
                                if (epgVarA == null) {
                                    epd epdVarA = epg.a();
                                    epdVarA.c = epf.UNARY;
                                    epdVarA.d = epg.c("google.internal.abuse.ondevicesafety.v1alpha.ProgramBlobService", "DownloadBlob");
                                    epdVarA.b();
                                    bcd bcdVar5 = bcd.a;
                                    int i2 = fec.b;
                                    epdVarA.a = new fea(bcdVar5);
                                    epdVarA.b = new fea(bcf.a);
                                    epgVarA = epdVarA.a();
                                    bcp.a = epgVarA;
                                }
                            }
                        }
                        String str2 = strF;
                        return dij.j(dhq.j(djr.q(feo.a(eluVar.a(epgVarA, bcoVar.b), bcdVar4)), Exception.class, new aqf(bbqVar, str2, 5), bbqVar.d), new bbl(bbqVar, csdVarC, aydVar5, bbcVarB, str2, 1), bbqVar.d);
                    }
                }, this.d), new bbk(this, 0), this.d);
            } catch (avo e) {
                return cnx.B(e);
            }
        } catch (RuntimeException e2) {
            return cnx.B(e2);
        }
    }

    @Override // defpackage.bbd
    public final djy b(final axv axvVar) {
        try {
            Pattern pattern = bbs.a;
            int i = 0;
            clq.w(axvVar.c.length() == 39, "unexpected api key size");
            clq.w(bbs.a.matcher(axvVar.c).matches(), "api key contains illegal characters");
            bbf bbfVar = this.f;
            axo axoVar = axvVar.b;
            if (axoVar == null) {
                axoVar = axo.a;
            }
            final String strE = bbfVar.e(axoVar);
            try {
                this.i.a(strE);
                ayo ayoVar = this.h;
                axo axoVar2 = axvVar.b;
                if (axoVar2 == null) {
                    axoVar2 = axo.a;
                }
                axi axiVarB = axi.b(axoVar2.c);
                if (axiVarB == null) {
                    axiVarB = axi.UNRECOGNIZED;
                }
                final elu eluVarA = ayoVar.a(axiVarB);
                return dij.j(dij.j(dij.j(djr.q(g(strE)), new aqf(this, new bbm(this, axvVar, i), 3, null), this.d), new dis() { // from class: bbh
                    @Override // defpackage.dis
                    public final djy a(Object obj) throws GeneralSecurityException, IOException {
                        bbp bbpVar = (bbp) obj;
                        csd csdVarC = bbpVar.c();
                        axv axvVar2 = axvVar;
                        bbq bbqVar = this.a;
                        String str = (String) bbqVar.h.b().orElse(axvVar2.c);
                        epc epcVar = new epc();
                        epcVar.f(bbq.a, str);
                        baz bazVar = (baz) ((baz) ((baz) baz.b(new bcn(1), eluVarA)).d(new fep(epcVar))).c(bbqVar.e);
                        ((czl) ((czl) bbq.b.c()).i("com/google/android/apps/miphone/astrea/pd/processor/impl/ProtectedDownloadProcessorImpl", "downloadManifestConfig", 323, "ProtectedDownloadProcessorImpl.java")).r("downloading manifest with public key hash %s.", csdVarC.g());
                        byte[] bArrK = csdVarC.k();
                        ayk aykVarA = bbpVar.a();
                        asr asrVar = (asr) bar.a.createBuilder();
                        axo axoVar3 = axvVar2.b;
                        if (axoVar3 == null) {
                            axoVar3 = axo.a;
                        }
                        baw bawVarB = bbqVar.f.b(axoVar3);
                        if (!asrVar.a.isMutable()) {
                            asrVar.B();
                        }
                        bar barVar = (bar) asrVar.a;
                        bawVarB.getClass();
                        barVar.c = bawVarB;
                        barVar.b |= 1;
                        int iB = aykVarA.b() - 1;
                        int i2 = iB != 0 ? iB != 1 ? bat.e : bat.c : bat.b;
                        asr asrVar2 = (asr) bau.a.createBuilder();
                        if (!asrVar2.a.isMutable()) {
                            asrVar2.B();
                        }
                        ((bau) asrVar2.a).c = bat.a(i2);
                        if (aykVarA.b() == 1) {
                            eea eeaVarA = aykVarA.a();
                            if (!asrVar2.a.isMutable()) {
                                asrVar2.B();
                            }
                            ((bau) asrVar2.a).b = eeaVarA;
                        }
                        bau bauVar = (bau) asrVar2.z();
                        if (!asrVar.a.isMutable()) {
                            asrVar.B();
                        }
                        bar barVar2 = (bar) asrVar.a;
                        bauVar.getClass();
                        barVar2.e = bauVar;
                        barVar2.b |= 4;
                        asr asrVar3 = (asr) baq.a.createBuilder();
                        eea eeaVarR = eea.r(bArrK);
                        if (!asrVar3.a.isMutable()) {
                            asrVar3.B();
                        }
                        ((baq) asrVar3.a).b = eeaVarR;
                        if (!asrVar.a.isMutable()) {
                            asrVar.B();
                        }
                        bar barVar3 = (bar) asrVar.a;
                        baq baqVar = (baq) asrVar3.z();
                        baqVar.getClass();
                        barVar3.d = baqVar;
                        barVar3.b |= 2;
                        asr asrVar4 = (asr) bax.a.createBuilder();
                        ayc aycVar = axvVar2.d;
                        if (aycVar == null) {
                            aycVar = ayc.a;
                        }
                        boolean z = aycVar.b;
                        if (!asrVar4.a.isMutable()) {
                            asrVar4.B();
                        }
                        ((bax) asrVar4.a).b = z;
                        bax baxVar = (bax) asrVar4.z();
                        if (!asrVar.a.isMutable()) {
                            asrVar.B();
                        }
                        bar barVar4 = (bar) asrVar.a;
                        baxVar.getClass();
                        barVar4.f = baxVar;
                        barVar4.b |= 8;
                        bar barVar5 = (bar) asrVar.z();
                        elu eluVar = bazVar.a;
                        epg epgVarA = bba.a;
                        if (epgVarA == null) {
                            synchronized (bba.class) {
                                epgVarA = bba.a;
                                if (epgVarA == null) {
                                    epd epdVarA = epg.a();
                                    epdVarA.c = epf.UNARY;
                                    epdVarA.d = epg.c("google.internal.abuse.ondevicesafety.v2.ProtectedDownloadService", "GetManifestConfig");
                                    epdVarA.b();
                                    bar barVar6 = bar.a;
                                    int i3 = fec.b;
                                    epdVarA.a = new fea(barVar6);
                                    epdVarA.b = new fea(bas.a);
                                    epgVarA = epdVarA.a();
                                    bba.a = epgVarA;
                                }
                            }
                        }
                        String str2 = strE;
                        return dij.j(dhq.j(djr.q(feo.a(eluVar.a(epgVarA, bazVar.b), barVar5)), Exception.class, new aqf(bbqVar, str2, 5), bbqVar.d), new bbl(bbqVar, csdVarC, axvVar2, bbpVar, str2, 0), bbqVar.d);
                    }
                }, this.d), new bbk(this, 0), this.d);
            } catch (avo e) {
                return cnx.B(e);
            }
        } catch (RuntimeException e2) {
            return cnx.B(e2);
        }
    }

    public final djy c(bbc bbcVar, bbn bbnVar, boolean z) throws GeneralSecurityException, IOException {
        djy djyVarC;
        if (z) {
            djyVarC = dij.i(djr.q(this.k.d("VM_CLIENT")), new arl(this, 3), this.d);
        } else if ((bbcVar.b & 1) != 0) {
            djyVarC = cnx.C(this.l.a(bbcVar.c.x()));
        } else {
            ((czl) ((czl) b.c()).i("com/google/android/apps/miphone/astrea/pd/processor/impl/ProtectedDownloadProcessorImpl", "integrityCheck", 176, "ProtectedDownloadProcessorImpl.java")).p("generating new key set for a new client persistent state");
            csd csdVarC = this.l.c();
            djy djyVarC2 = cnx.C(csdVarC);
            asr asrVar = (asr) bbcVar.toBuilder();
            Object obj = csdVarC.c;
            dks dksVarB = bba.b();
            byte[] bArr = new byte[0];
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                fsc fscVar = new fsc(byteArrayOutputStream);
                dvg dvgVar = ((dle) obj).a;
                byte[] bArrB = dksVarB.b(dvgVar.toByteArray(), bArr);
                asr asrVar2 = (asr) dup.a.createBuilder();
                eea eeaVarR = eea.r(bArrB);
                if (!asrVar2.a.isMutable()) {
                    asrVar2.B();
                }
                ((dup) asrVar2.a).c = eeaVarR;
                dvi dviVarA = dlp.a(dvgVar);
                if (!asrVar2.a.isMutable()) {
                    asrVar2.B();
                }
                dup dupVar = (dup) asrVar2.a;
                dviVarA.getClass();
                dupVar.d = dviVarA;
                dupVar.b |= 1;
                try {
                    asr asrVar3 = (asr) ((dup) asrVar2.z()).toBuilder();
                    if (!asrVar3.a.isMutable()) {
                        asrVar3.B();
                    }
                    dup dupVar2 = (dup) asrVar3.a;
                    dupVar2.d = null;
                    dupVar2.b &= -2;
                    ((dup) asrVar3.z()).writeTo((OutputStream) fscVar.a);
                    ((OutputStream) fscVar.a).close();
                    eea eeaVarR2 = eea.r(byteArrayOutputStream.toByteArray());
                    if (!asrVar.a.isMutable()) {
                        asrVar.B();
                    }
                    bbc bbcVar2 = (bbc) asrVar.a;
                    bbcVar2.b |= 1;
                    bbcVar2.c = eeaVarR2;
                    bbcVar = (bbc) asrVar.z();
                    djyVarC = djyVarC2;
                } catch (Throwable th) {
                    ((OutputStream) fscVar.a).close();
                    throw th;
                }
            } catch (IOException unused) {
                throw new GeneralSecurityException("Serialize keyset failed");
            }
        }
        return dij.j(djr.q(djyVarC), new cgn(this, bbnVar, bbcVar, 1), this.d);
    }

    public final /* synthetic */ csd d(Optional optional) {
        try {
            return this.l.b(((bbc) optional.orElseThrow(new bbg(0))).c.x());
        } catch (IOException | GeneralSecurityException e) {
            throw new IllegalStateException("Could not convert VM public key bytes", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
    
        if (r15 >= r13) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
    
        r14 = r12[r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (r14 < 'a') goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r14 > 'z') goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        r6 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        defpackage.clq.G(r6 ^ r11, "Cannot call lowerCase() on a mixed-case alphabet");
        r6 = new char[r10.b.length];
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        r12 = r10.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r14 >= r12.length) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        r12 = r12[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        if (defpackage.clq.U(r12) == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        r12 = r12 ^ 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        r6[r14] = (char) r12;
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        r12 = new defpackage.deo(r10.a.concat(".lowerCase()"), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        if (r10.h == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        if (r12.h == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
    
        r6 = r12.g;
        r6 = java.util.Arrays.copyOf(r6, r6.length);
        r10 = 65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        if (r10 > 90) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
    
        r13 = r10 | 32;
        r14 = r12.g;
        r15 = r14[r10];
        r14 = r14[r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00aa, code lost:
    
        if (r15 != (-1)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ac, code lost:
    
        r6[r10] = r14;
        r19 = r9;
        r21 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b3, code lost:
    
        r11 = (char) r10;
        r19 = r9;
        r9 = (char) r13;
        r21 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00be, code lost:
    
        if (r14 != (-1)) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c0, code lost:
    
        r6[r13] = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c2, code lost:
    
        r10 = r21 + 1;
        r9 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00dd, code lost:
    
        throw new java.lang.IllegalStateException(defpackage.clq.u("Can't ignoreCase() since '%s' and '%s' encode different values", java.lang.Character.valueOf(r11), java.lang.Character.valueOf(r9)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00de, code lost:
    
        r19 = r9;
        r10 = new defpackage.deo(r12.a.concat(".ignoreCase()"), r12.b, r6, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f1, code lost:
    
        r19 = r9;
        r10 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        r12 = r10.b;
        r13 = r12.length;
        r15 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ defpackage.djy e(defpackage.csd r23, defpackage.ayd r24, defpackage.bbc r25, java.lang.String r26, defpackage.bcf r27) {
        /*
            Method dump skipped, instructions count: 995
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbq.e(csd, ayd, bbc, java.lang.String, bcf):djy");
    }

    public final /* synthetic */ djy f(csd csdVar, axv axvVar, bbp bbpVar, String str, bas basVar) throws IOException {
        axw axwVar;
        int serializedSize = basVar.getSerializedSize();
        try {
            bbf bbfVar = this.f;
            axo axoVar = axvVar.b;
            if (axoVar == null) {
                axoVar = axo.a;
            }
            byte[] bArrI = csdVar.i(basVar.b.x(), bbfVar.e(axoVar).getBytes(StandardCharsets.UTF_8));
            bay bayVar = basVar.c;
            if (bayVar == null) {
                bayVar = bay.a;
            }
            if (bayVar.b) {
                asr asrVar = (asr) axw.a.createBuilder();
                InflaterInputStream inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(bArrI));
                ArrayList arrayList = new ArrayList();
                int iMin = 256;
                while (true) {
                    byte[] bArr = new byte[iMin];
                    int i = 0;
                    while (i < iMin) {
                        int i2 = inflaterInputStream.read(bArr, i, iMin - i);
                        if (i2 == -1) {
                            break;
                        }
                        i += i2;
                    }
                    eea eeaVarS = i == 0 ? null : eea.s(bArr, 0, i);
                    if (eeaVarS == null) {
                        break;
                    }
                    arrayList.add(eeaVarS);
                    iMin = Math.min(iMin + iMin, 8192);
                }
                int size = arrayList.size();
                eea eeaVarQ = size == 0 ? eea.b : eea.q(arrayList.iterator(), size);
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                axw axwVar2 = (axw) asrVar.a;
                eeaVarQ.getClass();
                axwVar2.b = eeaVarQ;
                axwVar = (axw) asrVar.z();
            } else {
                asr asrVar2 = (asr) axw.a.createBuilder();
                eea eeaVarR = eea.r(bArrI);
                if (!asrVar2.a.isMutable()) {
                    asrVar2.B();
                }
                ((axw) asrVar2.a).b = eeaVarR;
                axwVar = (axw) asrVar2.z();
            }
            return cnx.C(new bbo(axwVar, bbpVar.b(), serializedSize, str));
        } catch (GeneralSecurityException e) {
            this.i.b(str, 2, serializedSize);
            return cnx.B(e);
        }
    }
}
