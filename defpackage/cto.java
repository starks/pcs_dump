package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
class cto {
    public static final cto a;
    public static final cto b;
    public static final cto c;
    public static final cto d;
    public static final cto e;
    public static final cto f;
    public static final cto g;
    public static final cto h;
    static final cto[] i;
    private static final /* synthetic */ cto[] j;

    static {
        cto ctoVar = new cto("STRONG", 0);
        a = ctoVar;
        cto ctoVar2 = new cto() { // from class: cti
            @Override // defpackage.cto
            public final cuv a(cua cuaVar, cuv cuvVar, cuv cuvVar2, Object obj) {
                cuv cuvVarA = super.a(cuaVar, cuvVar, cuvVar2, obj);
                c(cuvVar, cuvVarA);
                return cuvVarA;
            }
        };
        b = ctoVar2;
        cto ctoVar3 = new cto() { // from class: ctj
            @Override // defpackage.cto
            public final cuv a(cua cuaVar, cuv cuvVar, cuv cuvVar2, Object obj) {
                cuv cuvVarA = super.a(cuaVar, cuvVar, cuvVar2, obj);
                d(cuvVar, cuvVarA);
                return cuvVarA;
            }
        };
        c = ctoVar3;
        cto ctoVar4 = new cto() { // from class: ctk
            @Override // defpackage.cto
            public final cuv a(cua cuaVar, cuv cuvVar, cuv cuvVar2, Object obj) {
                cuv cuvVarA = super.a(cuaVar, cuvVar, cuvVar2, obj);
                c(cuvVar, cuvVarA);
                d(cuvVar, cuvVarA);
                return cuvVarA;
            }
        };
        d = ctoVar4;
        cto ctoVar5 = new cto("WEAK", 4);
        e = ctoVar5;
        cto ctoVar6 = new cto() { // from class: ctl
            @Override // defpackage.cto
            public final cuv a(cua cuaVar, cuv cuvVar, cuv cuvVar2, Object obj) {
                cuv cuvVarA = super.a(cuaVar, cuvVar, cuvVar2, obj);
                c(cuvVar, cuvVarA);
                return cuvVarA;
            }
        };
        f = ctoVar6;
        cto ctoVar7 = new cto() { // from class: ctm
            @Override // defpackage.cto
            public final cuv a(cua cuaVar, cuv cuvVar, cuv cuvVar2, Object obj) {
                cuv cuvVarA = super.a(cuaVar, cuvVar, cuvVar2, obj);
                d(cuvVar, cuvVarA);
                return cuvVarA;
            }
        };
        g = ctoVar7;
        cto ctoVar8 = new cto() { // from class: ctn
            @Override // defpackage.cto
            public final cuv a(cua cuaVar, cuv cuvVar, cuv cuvVar2, Object obj) {
                cuv cuvVarA = super.a(cuaVar, cuvVar, cuvVar2, obj);
                c(cuvVar, cuvVarA);
                d(cuvVar, cuvVarA);
                return cuvVarA;
            }
        };
        h = ctoVar8;
        j = new cto[]{ctoVar, ctoVar2, ctoVar3, ctoVar4, ctoVar5, ctoVar6, ctoVar7, ctoVar8};
        i = new cto[]{ctoVar, ctoVar2, ctoVar3, ctoVar4, ctoVar5, ctoVar6, ctoVar7, ctoVar8};
    }

    public cto(String str, int i2) {
    }

    static final void c(cuv cuvVar, cuv cuvVar2) {
        cuvVar2.k(cuvVar.b());
        cuu.c(cuvVar.h(), cuvVar2);
        cuu.c(cuvVar2, cuvVar.f());
        cuu.e(cuvVar);
    }

    static final void d(cuv cuvVar, cuv cuvVar2) {
        cuvVar2.q(cuvVar.c());
        cuu.d(cuvVar.i(), cuvVar2);
        cuu.d(cuvVar2, cuvVar.g());
        cuu.f(cuvVar);
    }

    public static cto[] values() {
        return (cto[]) j.clone();
    }

    public cuv a(cua cuaVar, cuv cuvVar, cuv cuvVar2, Object obj) {
        return b(cuaVar, obj, cuvVar.a(), cuvVar2);
    }

    final cuv b(cua cuaVar, Object obj, int i2, cuv cuvVar) {
        switch (ordinal()) {
            case 0:
                return new cuf(obj, i2, cuvVar);
            case 1:
                return new cud(obj, i2, cuvVar);
            case 2:
                return new cuh(obj, i2, cuvVar);
            case 3:
                return new cue(obj, i2, cuvVar);
            case 4:
                return new cun(cuaVar.h, obj, i2, cuvVar);
            case 5:
                return new cul(cuaVar.h, obj, i2, cuvVar);
            case 6:
                return new cup(cuaVar.h, obj, i2, cuvVar);
            case 7:
                return new cum(cuaVar.h, obj, i2, cuvVar);
            default:
                throw null;
        }
    }
}
