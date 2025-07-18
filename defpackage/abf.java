package defpackage;

import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abf extends abj {
    final Set ab = new HashSet();
    boolean ac;
    CharSequence[] ad;
    CharSequence[] ae;

    private final MultiSelectListPreference aq() {
        return (MultiSelectListPreference) ap();
    }

    @Override // defpackage.abj
    protected final void aM(sx sxVar) {
        int length = this.ae.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.ab.contains(this.ae[i].toString());
        }
        CharSequence[] charSequenceArr = this.ad;
        abe abeVar = new abe(this);
        cg cgVar = (cg) sxVar.b;
        cgVar.n = charSequenceArr;
        cgVar.v = abeVar;
        cgVar.r = zArr;
        cgVar.s = true;
    }

    @Override // defpackage.abj
    public final void am(boolean z) {
        if (z && this.ac) {
            aq().k(this.ab);
        }
        this.ac = false;
    }

    @Override // defpackage.abj, defpackage.x, defpackage.ab
    public final void d(Bundle bundle) {
        super.d(bundle);
        if (bundle != null) {
            this.ab.clear();
            this.ab.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.ac = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.ad = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.ae = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreferenceAq = aq();
        if (multiSelectListPreferenceAq.g == null || multiSelectListPreferenceAq.h == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.ab.clear();
        this.ab.addAll(multiSelectListPreferenceAq.i);
        this.ac = false;
        this.ad = multiSelectListPreferenceAq.g;
        this.ae = multiSelectListPreferenceAq.h;
    }

    @Override // defpackage.abj, defpackage.x, defpackage.ab
    public final void g(Bundle bundle) {
        super.g(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.ab));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.ac);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.ad);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.ae);
    }
}
