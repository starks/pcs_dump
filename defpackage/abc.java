package defpackage;

import android.os.Bundle;
import androidx.preference.ListPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abc extends abj {
    public int ab;
    private CharSequence[] ac;
    private CharSequence[] ad;

    private final ListPreference aq() {
        return (ListPreference) ap();
    }

    @Override // defpackage.abj
    protected final void aM(sx sxVar) {
        CharSequence[] charSequenceArr = this.ac;
        int i = this.ab;
        axa axaVar = new axa(this, 1);
        cg cgVar = (cg) sxVar.b;
        cgVar.n = charSequenceArr;
        cgVar.p = axaVar;
        cgVar.u = i;
        cgVar.t = true;
        sxVar.f(null, null);
    }

    @Override // defpackage.abj
    public final void am(boolean z) {
        int i;
        if (!z || (i = this.ab) < 0) {
            return;
        }
        aq().n(this.ad[i].toString());
    }

    @Override // defpackage.abj, defpackage.x, defpackage.ab
    public final void d(Bundle bundle) {
        super.d(bundle);
        if (bundle != null) {
            this.ab = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.ac = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.ad = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreferenceAq = aq();
        if (listPreferenceAq.g == null || listPreferenceAq.h == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.ab = listPreferenceAq.k(listPreferenceAq.i);
        this.ac = listPreferenceAq.g;
        this.ad = listPreferenceAq.h;
    }

    @Override // defpackage.abj, defpackage.x, defpackage.ab
    public final void g(Bundle bundle) {
        super.g(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.ab);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.ac);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.ad);
    }
}
