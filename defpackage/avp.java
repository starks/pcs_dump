package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.util.AbstractMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class avp {
    public String a;
    public String b;
    public auw c;
    public int d;
    public int e;
    private final Context f;

    public avp(Context context) {
        this.f = context;
    }

    final avp a(int i) {
        try {
            this.b = this.f.getString(i);
            return this;
        } catch (Resources.NotFoundException e) {
            throw new IllegalStateException("Invalid connectionKeyStringId", e);
        }
    }

    final AbstractMap.SimpleImmutableEntry b() {
        clq.v(!clq.O(this.a));
        this.c.getClass();
        clq.v(!clq.O(this.b));
        try {
            clq.v(!clq.O(this.f.getString(this.d)));
            try {
                clq.v(!clq.O(this.f.getString(this.e)));
                asr asrVar = (asr) auj.a.createBuilder();
                switch (this.c.ordinal()) {
                    case 2:
                        asr asrVar2 = (asr) auk.a.createBuilder();
                        String str = this.b;
                        if (!asrVar2.a.isMutable()) {
                            asrVar2.B();
                        }
                        auk aukVar = (auk) asrVar2.a;
                        str.getClass();
                        aukVar.b |= 1;
                        aukVar.c = str;
                        auk aukVar2 = (auk) asrVar2.z();
                        if (!asrVar.a.isMutable()) {
                            asrVar.B();
                        }
                        auj aujVar = (auj) asrVar.a;
                        aukVar2.getClass();
                        aujVar.c = aukVar2;
                        aujVar.b = 1;
                        break;
                    case 3:
                    default:
                        throw new UnsupportedOperationException(String.format("Unsupported connection type '%s'", this.c.name()));
                    case 4:
                        asr asrVar3 = (asr) aul.a.createBuilder();
                        String str2 = this.b;
                        if (!asrVar3.a.isMutable()) {
                            asrVar3.B();
                        }
                        aul aulVar = (aul) asrVar3.a;
                        str2.getClass();
                        aulVar.b = 1 | aulVar.b;
                        aulVar.c = str2;
                        aul aulVar2 = (aul) asrVar3.z();
                        if (!asrVar.a.isMutable()) {
                            asrVar.B();
                        }
                        auj aujVar2 = (auj) asrVar.a;
                        aulVar2.getClass();
                        aujVar2.c = aulVar2;
                        aujVar2.b = 2;
                        break;
                    case 5:
                        asr asrVar4 = (asr) auo.a.createBuilder();
                        String str3 = this.b;
                        if (!asrVar4.a.isMutable()) {
                            asrVar4.B();
                        }
                        auo auoVar = (auo) asrVar4.a;
                        str3.getClass();
                        auoVar.b = 1 | auoVar.b;
                        auoVar.c = str3;
                        auo auoVar2 = (auo) asrVar4.z();
                        if (!asrVar.a.isMutable()) {
                            asrVar.B();
                        }
                        auj aujVar3 = (auj) asrVar.a;
                        auoVar2.getClass();
                        aujVar3.c = auoVar2;
                        aujVar3.b = 3;
                        break;
                    case 6:
                        asr asrVar5 = (asr) aun.a.createBuilder();
                        String str4 = this.b;
                        if (!asrVar5.a.isMutable()) {
                            asrVar5.B();
                        }
                        aun aunVar = (aun) asrVar5.a;
                        str4.getClass();
                        aunVar.b = 1 | aunVar.b;
                        aunVar.c = str4;
                        aun aunVar2 = (aun) asrVar5.z();
                        if (!asrVar.a.isMutable()) {
                            asrVar.B();
                        }
                        auj aujVar4 = (auj) asrVar.a;
                        aunVar2.getClass();
                        aujVar4.c = aunVar2;
                        aujVar4.b = 4;
                        break;
                    case 7:
                        asr asrVar6 = (asr) aui.a.createBuilder();
                        String str5 = this.b;
                        if (!asrVar6.a.isMutable()) {
                            asrVar6.B();
                        }
                        aui auiVar = (aui) asrVar6.a;
                        str5.getClass();
                        auiVar.b = 1 | auiVar.b;
                        auiVar.c = str5;
                        aui auiVar2 = (aui) asrVar6.z();
                        if (!asrVar.a.isMutable()) {
                            asrVar.B();
                        }
                        auj aujVar5 = (auj) asrVar.a;
                        auiVar2.getClass();
                        aujVar5.c = auiVar2;
                        aujVar5.b = 5;
                        break;
                    case 8:
                        asr asrVar7 = (asr) aum.a.createBuilder();
                        String str6 = this.b;
                        if (!asrVar7.a.isMutable()) {
                            asrVar7.B();
                        }
                        aum aumVar = (aum) asrVar7.a;
                        str6.getClass();
                        aumVar.b = 1 | aumVar.b;
                        aumVar.c = str6;
                        aum aumVar2 = (aum) asrVar7.z();
                        if (!asrVar.a.isMutable()) {
                            asrVar.B();
                        }
                        auj aujVar6 = (auj) asrVar.a;
                        aumVar2.getClass();
                        aujVar6.c = aumVar2;
                        aujVar6.b = 6;
                        break;
                    case 9:
                        asr asrVar8 = (asr) aup.a.createBuilder();
                        String str7 = this.b;
                        if (!asrVar8.a.isMutable()) {
                            asrVar8.B();
                        }
                        aup aupVar = (aup) asrVar8.a;
                        str7.getClass();
                        aupVar.b = 1 | aupVar.b;
                        aupVar.c = str7;
                        aup aupVar2 = (aup) asrVar8.z();
                        if (!asrVar.a.isMutable()) {
                            asrVar.B();
                        }
                        auj aujVar7 = (auj) asrVar.a;
                        aupVar2.getClass();
                        aujVar7.c = aupVar2;
                        aujVar7.b = 7;
                        break;
                }
                cxo cxoVar = aux.a;
                euw euwVar = new euw((byte[]) null, (char[]) null, (byte[]) null, (byte[]) null);
                euwVar.m(this.a);
                euwVar.n(this.c);
                euwVar.l((auj) asrVar.z());
                aux auxVarK = euwVar.k();
                avq avqVar = new avq(null);
                int i = this.d;
                avqVar.a = i;
                byte b = avqVar.c;
                int i2 = this.e;
                avqVar.b = i2;
                avqVar.c = (byte) (3 | b);
                return new AbstractMap.SimpleImmutableEntry(auxVarK, new avr(i, i2));
            } catch (Resources.NotFoundException e) {
                throw new IllegalStateException("Invalid descriptionId", e);
            }
        } catch (Resources.NotFoundException e2) {
            throw new IllegalStateException("Invalid featureNameId", e2);
        }
    }
}
