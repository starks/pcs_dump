package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fnc extends fnh implements fna {
    private final boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fnc(fna fnaVar) {
        fnh fnhVarE;
        super(true);
        boolean z = true;
        A(null);
        flo floVarX = x();
        flp flpVar = floVarX instanceof flp ? (flp) floVarX : null;
        if (flpVar == null || (fnhVarE = flpVar.e()) == null) {
            z = false;
            break;
        }
        while (!fnhVarE.aZ()) {
            flo floVarX2 = fnhVarE.x();
            flp flpVar2 = floVarX2 instanceof flp ? (flp) floVarX2 : null;
            if (flpVar2 == null || (fnhVarE = flpVar2.e()) == null) {
                z = false;
                break;
            }
        }
        this.a = z;
    }

    @Override // defpackage.fnh
    public final boolean aZ() {
        return this.a;
    }

    @Override // defpackage.fnh
    public final boolean ba() {
        return true;
    }
}
