package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class coe {
    public cnv a;
    public cnv b;
    public cnv c;
    public cnv d;
    public cnx e;
    public cnx f;
    public cnx g;
    public cnx h;
    public cnx i;
    public cnx j;
    public cnx k;
    public cnx l;

    public coe() {
        this.i = new cod();
        this.j = new cod();
        this.k = new cod();
        this.l = new cod();
        this.a = new cns(0.0f);
        this.b = new cns(0.0f);
        this.c = new cns(0.0f);
        this.d = new cns(0.0f);
        this.e = new cnx();
        this.f = new cnx();
        this.g = new cnx();
        this.h = new cnx();
    }

    private static float j(cnx cnxVar) {
        if (cnxVar instanceof cod) {
            return -1.0f;
        }
        if (cnxVar instanceof cnw) {
        }
        return -1.0f;
    }

    public final coe a(float f) {
        d(f);
        e(f);
        c(f);
        b(f);
        return this;
    }

    public final void b(float f) {
        this.d = new cns(f);
    }

    public final void c(float f) {
        this.c = new cns(f);
    }

    public final void d(float f) {
        this.a = new cns(f);
    }

    public final void e(float f) {
        this.b = new cns(f);
    }

    public final void f(cnx cnxVar) {
        this.l = cnxVar;
        j(cnxVar);
    }

    public final void g(cnx cnxVar) {
        this.k = cnxVar;
        j(cnxVar);
    }

    public final void h(cnx cnxVar) {
        this.i = cnxVar;
        j(cnxVar);
    }

    public final void i(cnx cnxVar) {
        this.j = cnxVar;
        j(cnxVar);
    }

    public coe(cof cofVar) {
        this.i = new cod();
        this.j = new cod();
        this.k = new cod();
        this.l = new cod();
        this.a = new cns(0.0f);
        this.b = new cns(0.0f);
        this.c = new cns(0.0f);
        this.d = new cns(0.0f);
        this.e = new cnx();
        this.f = new cnx();
        this.g = new cnx();
        this.h = new cnx();
        this.i = cofVar.j;
        this.j = cofVar.k;
        this.k = cofVar.l;
        this.l = cofVar.m;
        this.a = cofVar.b;
        this.b = cofVar.c;
        this.c = cofVar.d;
        this.d = cofVar.e;
        this.e = cofVar.f;
        this.f = cofVar.g;
        this.g = cofVar.h;
        this.h = cofVar.i;
    }
}
