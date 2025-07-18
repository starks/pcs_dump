package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eeu extends edf {
    public efb a;
    private final efb b;

    protected eeu(efb efbVar) {
        this.b = efbVar;
        if (efbVar.isMutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.a = a();
    }

    private final efb a() {
        return this.b.newMutableInstance();
    }

    private static void b(Object obj, Object obj2) {
        egr.a.b(obj).g(obj, obj2);
    }

    public void B() {
        efb efbVarA = a();
        b(efbVarA, this.a);
        this.a = efbVarA;
    }

    public final void C(efb efbVar) {
        if (this.b.equals(efbVar)) {
            return;
        }
        if (!this.a.isMutable()) {
            B();
        }
        b(this.a, efbVar);
    }

    @Override // defpackage.egj
    public final /* synthetic */ egi getDefaultInstanceForType() {
        throw null;
    }

    @Override // defpackage.egj
    public final boolean isInitialized() {
        return efb.isInitialized(this.a, false);
    }

    @Override // defpackage.edf
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final eeu clone() {
        eeu eeuVarNewBuilderForType = this.b.newBuilderForType();
        eeuVarNewBuilderForType.a = A();
        return eeuVarNewBuilderForType;
    }

    @Override // defpackage.egh
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final efb z() {
        efb efbVarA = A();
        if (efbVarA.isInitialized()) {
            return efbVarA;
        }
        throw new ehg();
    }

    @Override // defpackage.egh
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public efb A() {
        if (!this.a.isMutable()) {
            return this.a;
        }
        this.a.makeImmutable();
        return this.a;
    }
}
