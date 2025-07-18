package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class esw extends eof {
    final enx a;
    final eno b;
    final etm c;
    final etn d;
    List e;
    ewn f;
    boolean g;
    boolean h;
    final /* synthetic */ exm i;
    exo j;

    public esw() {
    }

    @Override // defpackage.eof
    public final Object a() {
        clq.G(this.g, "Subchannel is not started");
        return this.f;
    }

    @Override // defpackage.eof
    public final List b() {
        this.i.m.c();
        clq.G(this.g, "not started");
        return this.e;
    }

    @Override // defpackage.eof
    public final void c() {
        this.i.m.c();
        clq.G(this.g, "not started");
        this.f.a();
    }

    @Override // defpackage.eof
    public final void d() {
        exo exoVar;
        this.i.m.c();
        if (this.f == null) {
            this.h = true;
            return;
        }
        if (!this.h) {
            this.h = true;
        } else {
            if (!this.i.B || (exoVar = this.j) == null) {
                return;
            }
            exoVar.a();
            this.j = null;
        }
        exm exmVar = this.i;
        if (exmVar.B) {
            this.f.g(exm.b);
        } else {
            this.j = exmVar.m.d(new ewr(new ewf(this, 14)), 5L, TimeUnit.SECONDS, this.i.i.b());
        }
    }

    @Override // defpackage.eof
    public final void e(eoh eohVar) {
        this.i.m.c();
        clq.G(!this.g, "already started");
        clq.G(!this.h, "already shutdown");
        clq.G(!this.i.B, "Channel is being terminated");
        this.g = true;
        String strB = this.i.b();
        exm exmVar = this.i;
        eub eubVar = exmVar.i;
        ScheduledExecutorService scheduledExecutorServiceB = eubVar.b();
        exk exkVar = new exk(this, eohVar);
        exm exmVar2 = this.i;
        enl enlVar = exmVar2.H;
        etl etlVarA = exmVar2.D.a();
        eno enoVar = this.b;
        exm exmVar3 = this.i;
        ewn ewnVar = new ewn(this.a, strB, exmVar.U, eubVar, scheduledExecutorServiceB, exmVar3.o, exmVar3.m, exkVar, enlVar, etlVarA, enoVar, this.c, this.i.q);
        enh enhVar = new enh();
        enhVar.a = "Child Subchannel started";
        enhVar.b = eni.CT_INFO;
        enhVar.b(this.i.l.a());
        enhVar.d = ewnVar;
        this.i.F.b(enhVar.a());
        this.f = ewnVar;
        enl.b(this.i.H.e, ewnVar);
        this.i.v.add(ewnVar);
    }

    @Override // defpackage.eof
    public final void f(List list) {
        this.i.m.c();
        this.e = list;
        ewn ewnVar = this.f;
        list.getClass();
        ewn.j(list);
        clq.w(!list.isEmpty(), "newAddressGroups is empty");
        ewnVar.f.execute(new euy(ewnVar, DesugarCollections.unmodifiableList(new ArrayList(list)), 3));
    }

    public final String toString() {
        return this.b.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public esw(exm exmVar, enx enxVar) {
        this();
        this.i = exmVar;
        this.e = enxVar.a;
        this.a = enxVar;
        eno enoVarB = eno.b("Subchannel", exmVar.b());
        this.b = enoVarB;
        etn etnVar = new etn(enoVarB, exmVar.l.a(), "Subchannel for ".concat(enxVar.a.toString()));
        this.d = etnVar;
        this.c = new etm(etnVar, exmVar.l);
    }
}
